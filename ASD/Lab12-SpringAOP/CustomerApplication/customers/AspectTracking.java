package customers;

/**
 * Created by Rajiv on 5/20/2017.
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.util.StopWatch;

import java.util.Date;

@Aspect
public class AspectTracking {
    Date d = new Date();

    @After(value = "execution(* customers.EmailSender.sendEmail(..))&& args(email,message)", argNames = "joinPoint,email,message")
    public void sendEmailAdvice(JoinPoint joinPoint, String email, String message){
        EmailSender emailSender = (EmailSender) joinPoint.getTarget();
        System.out.println(d+ " method = " + joinPoint.getSignature().getName());
        System.out.println("message = "+message);
        System.out.println("outgoing mail server = " + emailSender.getOutgoingMailServer());
    }

    @Around("execution(* customers.CustomerDAO.*(..))")
    public Object invoke(ProceedingJoinPoint call ) throws Throwable {
        StopWatch sw = new StopWatch();
        sw.start(call.getSignature().getName());
        Object retVal = call.proceed();
        sw.stop();
        long totaltime = sw.getLastTaskTimeMillis();
        System.out.println("Time to execute save = " + totaltime +" ms.");
        return retVal;
    }


}
