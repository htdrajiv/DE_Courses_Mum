
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class Calculator {

    private int firstnumber;
    private int secondnumber;
    private int result;

    public String add() {
        result = firstnumber + secondnumber;
        return null;
    }

    public String subtract() {
        result = firstnumber - secondnumber;
        return null;
    }

    public String multiply() {
        result = firstnumber * secondnumber;
        return null;
    }

    public String divide() {
        result = firstnumber / secondnumber;
        return null;
    }

    public int getFirstnumber() {
        return firstnumber;
    }

    public void setFirstnumber(int firstnumber) {
        this.firstnumber = firstnumber;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getSecondnumber() {
        return secondnumber;
    }

    public void setSecondnumber(int secondnumber) {
        this.secondnumber = secondnumber;
    }
}
