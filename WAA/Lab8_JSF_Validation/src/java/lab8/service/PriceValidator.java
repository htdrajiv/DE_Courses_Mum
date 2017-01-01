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
@FacesValidator("lab8.service.PriceValidator")
public class PriceValidator implements Validator{
    @Override
	public void validate(FacesContext arg0, UIComponent arg1, Object value)
			throws ValidatorException {
		String msg = "";
		if (value == null) {
			msg = "This field must not be null";
		} else {
			try {
				double v = Double.parseDouble(value.toString());

				if (v < 1)
					msg = "The value '" + v +"' is smaller than the minimum value of 1";
				else if (v > 10000)
					msg = "The value '" + v +"' is greater than the maximum value of 10000";
			} catch (NumberFormatException ex) {
				msg = "Invalid input ";
			}
		}
		if (!msg.equals("")) {
			FacesMessage ms = new FacesMessage(msg);
			ms.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(ms);
		}

	}
}
