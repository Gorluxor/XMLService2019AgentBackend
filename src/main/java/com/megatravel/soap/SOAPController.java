package com.megatravel.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/agent/res")
public class SOAPController {

    @Autowired
    AccommodationClient accommodationClient;

    @Autowired
    ReservationClient reservationClient;

    @Autowired
    AuthClient authClient;

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

    @GetMapping(value="ConfirmReservation/{id}")
    public ConfirmReservationResponse confirmReservation(@PathVariable(value="id") Long id) {
        System.out.println("usao u ws");
        ConfirmReservation req=new ConfirmReservation();
        req.setReservationId(id);
        return reservationClient.confirmReservation(req);
    }

   // @GetMapping(value="Login")
   @RequestMapping(value="Login", method = RequestMethod.POST, consumes = "application/json")
    public LoginResponse login(@RequestBody LoginDTO loginDTO) {
        System.out.println("LOGIN u ws");
       System.out.println("User " + loginDTO.getEmail());
       Login req=new Login();
        req.setLoginDTO(loginDTO);
        return authClient.login(req);
    }
}

