/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import java.util.Date;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Rajiv
 */
@Named(value = "flightSearchBean")
@RequestScoped
public class FlightSearchBean {
    private String from;
    private String to;
    private String departureDate;
    private String returnDate;
    private String roundOrOneWay;
    private List<String> options;
      
    /**
     * Creates a new instance of FlightSearchBean
     */
    
    public FlightSearchBean() {}

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getRoundOrOneWay() {
        return roundOrOneWay;
    }

    public void setRoundOrOneWay(String roundOrOneWay) {
        this.roundOrOneWay = roundOrOneWay;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
    
    public String displayMsgInConsole(){
        System.out.println("From : "+this.from);
        System.out.println("To : "+this.to);
        System.out.println("Departure Date : "+this.departureDate);
        System.out.println("Return Date : "+this.returnDate);
        System.out.println(this.roundOrOneWay);
        System.out.println("Options : "+this.options);
        return null;
    }        
}
