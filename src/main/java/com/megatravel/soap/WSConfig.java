package com.megatravel.soap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WSConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {

        Jaxb2Marshaller marshaller=new Jaxb2Marshaller();
        String[] packagesToScan= {"com.megatravel.soap"};
        marshaller.setPackagesToScan(packagesToScan);
        return marshaller;
    }

    @Bean
    public AccommodationClient resClient(Jaxb2Marshaller marshaller) {
        AccommodationClient client=new AccommodationClient();
        client.setDefaultUri("http://localhost:8079/ws/res)");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

    @Bean
    public ReservationClient reservationClient(Jaxb2Marshaller marshaller) {
        ReservationClient client=new ReservationClient();
        //client.setDefaultUri("http://localhost:8079/ws/res)");
        client.setDefaultUri("http://localhost:9999/api/agent/ws/res)");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }


}