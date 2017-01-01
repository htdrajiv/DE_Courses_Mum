/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.service;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


/**
 *
 * @author Rajiv
 */
@FacesValidator("lab8.service.BrandValidator")
public class BrandValidator implements Validator{
    @Override
	public void validate(FacesContext arg0, UIComponent arg1, Object value)
			throws ValidatorException {
		
		String msg = "";
		if(value == null || value.toString().trim().isEmpty()){
			msg = "This field can not be null";
		}else{
			String text = value.toString().trim();
			if(!text.equalsIgnoreCase("BMW") && !text.equalsIgnoreCase("Mercedes")){
				msg = "Invalid Brand";
			}
		}
		if(!msg.equals("")){
			FacesMessage ms = new FacesMessage(msg);
			ms.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(ms);
		}
		
	}
}
