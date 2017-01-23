package com.ban.mum.WAALab10;

import java.io.IOException;
import java.util.Map;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

@FacesComponent(createTag=true,tagName="spinner",namespace="http://ban.spinner")
public class MonthSpinner extends UIInput {

	private static final String MORE = ".more";
	private static final String LESS = ".less";

	@Override
	public String getFamily() {
		// TODO Auto-generated method stub
		return "custom.component";
	}
	@Override
	public void encodeBegin(FacesContext context) throws IOException {
		// TODO Auto-generated method stub
		ResponseWriter writer = context.getResponseWriter();
		String clientId = getClientId(context);

		//writer.startElement("form", this);
		encodeInputField(writer, clientId);
		encodeIncrementButton(writer, clientId);
		encodeDecrementButton(writer, clientId);
		//writer.endElement("form");

	}

	public void encodeInputField(ResponseWriter writer, String clientId) throws IOException {
		writer.startElement("input", this);
		writer.writeAttribute("name", clientId, null);
		writer.writeAttribute("type", "text", null);
		Object v = getValue();
		if (v != null) {
			writer.writeAttribute("value", v.toString(), "value");
		}

		Integer size = Integer.parseInt( (String) getAttributes().get("size"));
		if (size != null)
			writer.writeAttribute("size", size, "size");

		writer.endElement("input");

	}

	public void encodeIncrementButton(ResponseWriter writer, String clientId) throws IOException {
		writer.startElement("input", this);
		writer.writeAttribute("type", "submit", null);
		writer.writeAttribute("name", clientId + LESS, null);
		writer.writeAttribute("value", "<", "value");
		writer.endElement("input");
	}

	public void encodeDecrementButton(ResponseWriter writer, String clientId) throws IOException {
		writer.startElement("input", this);
		writer.writeAttribute("type", "submit", null);
		writer.writeAttribute("name", clientId + MORE, null);
		writer.writeAttribute("value", ">", "value");
		writer.endElement("input");
	}

	@Override
	public void decode(FacesContext context) {
		// TODO Auto-generated method stub
		Map<String, String> requestMap = context.getExternalContext().getRequestParameterMap();
		String clientId = getClientId(context);

		int increment;
		if (requestMap.containsKey(clientId + MORE))
			increment = 1;
		else if (requestMap.containsKey(clientId + LESS))
			increment = -1;
		else
			increment = 0;

		try {
			int submittedValue = Integer.parseInt((String) requestMap.get(clientId));
			int newValue = getIncrementedValue(submittedValue, increment);
			setSubmittedValue("" + newValue); // make it a String
		} catch (NumberFormatException ex) {
			if(clientId.contains("month"))
				setSubmittedValue("1");
			else if(clientId.contains("year"))
				setSubmittedValue("2014");
			else 
				setSubmittedValue((String) requestMap.get(clientId));
		}
	}

	private int getIncrementedValue(int submittedValue, int increment) {
		try{
			Integer minimum = Integer.parseInt((String) getAttributes().get("minimum"));
			Integer maximum = Integer.parseInt((String) getAttributes().get("maximum"));
			int newValue = submittedValue + increment;

			if ((minimum == null || newValue >= minimum.intValue()) && (maximum == null || newValue <= maximum.intValue()))
				return newValue;
			else
				return maximum;

		}
		catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}

}
