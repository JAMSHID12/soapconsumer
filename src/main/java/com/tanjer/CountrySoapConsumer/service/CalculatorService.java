package com.tanjer.CountrySoapConsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.tanjer.CountrySoapConsumer.calculate.Add;
import com.tanjer.CountrySoapConsumer.calculate.AddResponse;

@Service
public class CalculatorService {
	@Autowired
	private WebServiceTemplate webServiceTemplate;

	public int add(int intA, int intB) {
		Add request = new Add();
		request.setIntA(intA);
		request.setIntB(intB);

		AddResponse response = (AddResponse) webServiceTemplate.marshalSendAndReceive(
				"http://www.dneonline.com/calculator.asmx", request, new SoapActionCallback("http://tempuri.org/Add"));
		return response.getAddResult();
	}

	// Similar methods for Subtract, Multiply, and Divide can be added here.
}