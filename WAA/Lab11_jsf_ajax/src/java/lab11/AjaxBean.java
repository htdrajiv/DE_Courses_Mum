/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Rajiv
 */
@Named(value = "ajaxBean")
@RequestScoped
public class AjaxBean {

    /**
     * Creates a new instance of AjaxBean
     */
    public AjaxBean() {
    }
    private final static List<String> countries;
    static{
        countries = new ArrayList<>();
        String[] isoCountries = Locale.getISOCountries();
        for (String country : isoCountries) {
            Locale locale = new Locale("en", country);            
            String name = locale.getDisplayCountry();
            countries.add(name);           
        }
    }
    private String country;
    private List<String> filteredCountries = new ArrayList<>();

    public List<String> getFilteredCountries() {
        afterSelection();
        return filteredCountries;
    }

    public void setFilteredCountries(List<String> filteredCountries) {
        this.filteredCountries = filteredCountries;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
    public void afterSelection(){
        if(country!=null && !country.isEmpty()){
            for(String str : countries){
                if(str.toLowerCase().contains(country.toLowerCase())){
                    filteredCountries.add(str);
                }
            }
        }else{
            filteredCountries.addAll(countries);
        }               
    }  
    
}
