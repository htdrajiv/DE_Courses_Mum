/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import com.sun.tools.ws.wsdl.document.Output;
import java.text.ParseException;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Rajiv
 */
@Named(value = "conversionBean")
@RequestScoped
public class ConversionBean {

    /**
     * Creates a new instance of ConversionBean
     */
    public ConversionBean() {
        
    }
    private String date;
    private String temperature;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
   
    public String convertDate(){        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");        
        StringBuilder outputStr = new StringBuilder();
        try {
            Date date = formatter.parse(this.date);            
            outputStr.append(new SimpleDateFormat("E, MMM dd yyyy").format(date));            

        } catch (ParseException e) {
            e.printStackTrace();
        }        
        return outputStr.toString();
    }    
    
    public String convertTemperature(){
        char unit = this.temperature.charAt(0);
        String measure = this.temperature.substring(1, this.temperature.length()-1);
        String unitC = "";
        switch(unit){ 
            case 'F': unitC = "Farenheit";
            break; 
            case 'C': unitC = "Celcius"; 
            break; 
        }
        return measure+" "+unitC;
    }
    
}
