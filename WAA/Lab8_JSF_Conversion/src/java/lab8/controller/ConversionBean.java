/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.controller;

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
    private Date date;
    private String temperature;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
  
    
}
