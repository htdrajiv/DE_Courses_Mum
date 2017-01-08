/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_EventHandling;

/**
 *
 * @author Rajiv
 */
public class AirlinesDetails {
    public AirlinesDetails(){}
    public AirlinesDetails(String from,String to,String departureDate,String name,String code,String fair){
        this.from = from;
        this.to = to;
        this.departureDate = departureDate;
        this.name = name;
        this.code = code;
        this.fair = fair;
    }
    private String from;
    private String to;
    private String departureDate;
    private String name;
    private String code;
    private String fair;
    
    public String getCode(){
        return code;
    }
    
    public void setCode(String code){
        this.code = code;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFair() {
        return fair;
    }

    public void setFair(String fair) {
        this.fair = fair;
    }
    
}
