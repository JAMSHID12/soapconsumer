package com.tanjer.CountrySoapConsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class SoapClientConfig {
	
	@Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.tanjer.CountrySoapConsumer.CountryInfoSoap");
        return marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller marshaller) {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setDefaultUri("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso");
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        return webServiceTemplate;
    }

	/*
	 * @Bean public Jaxb2Marshaller marshaller() { Jaxb2Marshaller marshaller=new
	 * Jaxb2Marshaller();
	 * marshaller.setPackagesToScan("com.tanjer.CountrySoapConsumer.calculate");
	 * return marshaller; }
	 */
}
