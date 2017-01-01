/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.service;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
/**
 *
 * @author Rajiv
 */
@FacesConverter("lab8.service.ConverterService")
public class ConverterService implements Converter {

	@Override
	public Object getAsObject(FacesContext arg_0, UIComponent arg_1, String value) {
		if (value == null || value.toString().trim().isEmpty()) {
			return null;
		}
		String res = "Temperature was ";
		res += value.substring(1, value.length()) + " ";
		char c = value.charAt(0);
                switch(c){
                    case 'f':
                    case 'F': res += "Fahrenheit";
                            break;
                    case 'c':
                    case 'C': res += "Celsius";
                            break;
                    default: res = "Invalid temperature format";
                }		
		return res;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		// TODO Auto-generated method stub
		return value.toString();
	}

}

