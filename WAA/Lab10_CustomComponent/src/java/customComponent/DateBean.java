/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customComponent;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Rajiv
 */
@Named(value = "dateBean")
@RequestScoped
public class DateBean {

    /**
     * Creates a new instance of DateBean
     */
    public DateBean() {
    }
    
    private String month;
    private String year;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
}
