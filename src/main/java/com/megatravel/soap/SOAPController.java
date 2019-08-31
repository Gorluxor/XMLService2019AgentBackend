package com.megatravel.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/agent/res")
public class SOAPController {

    @Autowired
    AccommodationClient accommodationClient;

    @Autowired
    ReservationClient reservationClient;

    @GetMapping(value="GetAllAccommodations")
    public GetAllAccommodationsResponse getAllReservations() {
        System.out.println("usao u ws");
        GetAllAccommodations req=new GetAllAccommodations();
        return accommodationClient.getAllReservations(req);
    }

    @GetMapping(value="GetListReservationsForAgent")
    public GetListReservationsForAgentResponse getAllresAgent() {
        System.out.println("usao u ws");
        GetListReservationsForAgent req=new GetListReservationsForAgent();
        req.setEmail("agent@gmail.com");
        return reservationClient.getAllReservations(req);
    }

}

