package com.soap.soap.Configuration;

import com.soap.soap.Service.SoapClient;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.soap.client.generated");
        return marshaller;
    }

    // the default uri here is what will be used if you dont explicitly specify the endpoint when making request.
    @Bean
    SoapClient soapClient(Jaxb2Marshaller marshaller){
        SoapClient soapClient = new SoapClient();
        soapClient.setDefaultUri("http://localhost:5000/ws");
        soapClient.setMarshaller(marshaller);
        soapClient.setUnmarshaller(marshaller);
        return soapClient;
    }
}
