/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_EventHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author Rajiv
 */
@Named(value = "eventHandlingBean")
@RequestScoped
public class EventHandlingBean {
    /**
     * Creates a new instance of EventHandlingBean
     */
    public EventHandlingBean() {
    }
    private String selectedAirline = "all";
        
    
    private List<AirlinesDetails> airlinesDetails = Arrays.asList(
            new AirlinesDetails("Amsterdam","New York","12/11/06","KLM","klm","790.80"),
            new AirlinesDetails("Amsterdam","New York","12/11/06","North West","nw","795.55"),
            new AirlinesDetails("Amsterdam","New York","12/11/06","KLM","klm","820.00"),
            new AirlinesDetails("Amsterdam","New York","12/11/06","United Airlines","ua","825.00"),
            new AirlinesDetails("Amsterdam","New York","12/11/06","North West","nw","875.80"),
            new AirlinesDetails("Amsterdam","New York","12/11/06","KLM","klm","989.80"),
            new AirlinesDetails("Amsterdam","New York","12/11/06","United Airlines","ua","1050.80")
    );    
    
    public void airlinesChanged(ValueChangeEvent e){
        selectedAirline = e.getNewValue().toString();
        this.filteredAirlinesDetails = getFilteredAirlines();        
    }
    
    private List<AirlinesDetails> getFilteredAirlines(){
        List<AirlinesDetails> returnList = new ArrayList<>();
        if(this.selectedAirline.equals("all"))
            returnList  = airlinesDetails;
        else{
            for(AirlinesDetails air:airlinesDetails){
                if(this.selectedAirline.equals(air.getCode())){
                    returnList.add(air);
                }
            }
        }
        return returnList;
    }
    
    private List<AirlinesDetails> filteredAirlinesDetails = getFilteredAirlines();
    
    public List<AirlinesDetails> getFilteredAirlinesDetails() {
        return filteredAirlinesDetails;
    }

    public void setFilteredAirlinesDetails(List<AirlinesDetails> filteredAirlinesDetails) {
        this.filteredAirlinesDetails = filteredAirlinesDetails;
    }
    
    public String getSelectedAirline() {
        return selectedAirline;
    }

    public void setSelectedAirline(String selectedAirline) {
        this.selectedAirline = selectedAirline;
    }   
    
}
