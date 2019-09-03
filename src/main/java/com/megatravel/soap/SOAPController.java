package com.megatravel.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/agent/res")
public class SOAPController {

    @Autowired
    AccommodationClient accommodationClient;

    @Autowired
    ReservationClient reservationClient;

    @Autowired
    AuthClient authClient;

    @Autowired
    MessageClient messageClient;

    @GetMapping(value="GetAllAccommodations")
    public GetAllAccommodationsResponse getAllReservations() {
        System.out.println("usao u ws");
        GetAllAccommodations req=new GetAllAccommodations();
        return accommodationClient.getAllReservations(req);
    }

    @GetMapping(value="GetListReservationsForAgent/{email}")
    public GetListReservationsForAgentResponse getAllresAgent(@PathVariable(value = "email") String email) {
        System.out.println("usao u ws");
        //System.out.println("EMAIL " + email);
        GetListReservationsForAgent req=new GetListReservationsForAgent();
        req.setEmail(email);
        return reservationClient.getAllReservations(req);
    }

    @GetMapping(value="ConfirmReservation/{id}")
    public ConfirmReservationResponse confirmReservation(@PathVariable(value="id") Long id) {
        System.out.println("usao u ws");
        ConfirmReservation req=new ConfirmReservation();
        req.setReservationId(id);
        return reservationClient.confirmReservation(req);
    }

//    @GetMapping(value="CreateReservation")
    @RequestMapping(value="CreateReservation", method = RequestMethod.POST, consumes = "application/json")
    public CreateReservationResponse getChatRooms(@RequestBody ReservationDTO reservationDTO) {
        System.out.println("usao u ws");
        CreateReservation req=new CreateReservation();
        req.setReservationDTO(reservationDTO);
        return reservationClient.createReservation(req);
    }

   // @GetMapping(value="Login")
   @RequestMapping(value="Login", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public LoginResponse login(@RequestBody LoginDTO loginDTO) {
        System.out.println("LOGIN u ws");
       System.out.println("User " + loginDTO.getEmail());
       Login req=new Login();
        req.setLoginDTO(loginDTO);
        return authClient.login(req);
    }

    @GetMapping(value="GetChatRooms/{id}")
    public GetChatRoomsResponse getChatRooms(@PathVariable(value="id") Long id) {
        System.out.println("usao u ws");
        GetChatRooms req=new GetChatRooms();
        req.setUserId(id);
        return messageClient.getChatRooms(req);
    }

    @GetMapping(value="GetListMessagesForChatRoom/{userID}/{crID}")
    public GetListMessagesForChatRoomResponse getChatRooms(@PathVariable(value="userID") Long id, @PathVariable(value="crID") Long crID) {
        System.out.println("usao u ws");
        GetListMessagesForChatRoom req=new GetListMessagesForChatRoom();
        req.setChatroomId(crID);
        req.setUserId(id);
        return messageClient.getListMessagesForChatRoom(req);
    }
//////////////////////////////////////////////////////
   // @GetMapping(value="SendMessage/{crID}")
    @RequestMapping(value="SendMessage/{crID}", method = RequestMethod.PUT, consumes = "application/json")
    public SendMessageResponse sendMessage(@PathVariable(value="crID") Long crID, @RequestBody MessageDTO messageDTO) {
        System.out.println("usao u MESSAGE");
        System.out.println("ID" + messageDTO.getReceiver().getId());

        SendMessage req=new SendMessage();
        req.setArg0(crID);
        req.setMessageDTO(messageDTO);
        return messageClient.sendMessage(req);
    }

    //////////////////////////////////////////

    @GetMapping(value="GetAllServices")
    public GetAllServicesResponse getAllServices() {
        System.out.println("usao u ws");
        GetAllServices req=new GetAllServices();
        return accommodationClient.getAllServices(req);
    }

    @GetMapping(value="GetAllUnits/{Id}")
    public GetAllUnitsResponse getAllUnits(@PathVariable(value="Id") Long id) {
        System.out.println("usao u ws");
        GetAllUnits req=new GetAllUnits();
        req.setAccId(id);
        return accommodationClient.getAllUnits(req);
    }

    @GetMapping(value="GetAllUnitType")
    public GetAllUnitTypeResponse getAllUnitType() {
        System.out.println("usao u ws");
        GetAllUnitType req=new GetAllUnitType();
        return accommodationClient.getAllUnitType(req);
    }

    @RequestMapping(value="CreateUnit/{Id}", method = RequestMethod.POST, consumes = "application/json")
    public CreateUnitResponse createUnit(@PathVariable(value="Id") Long id, @RequestBody AccommodationUnitDTO auDTO) {
        System.out.println("Create Unit u ws");
        CreateUnit req=new CreateUnit();
        req.setAccId(id);
        req.setAccommodationUnitDTO(auDTO);
        return accommodationClient.createUnit(req);
    }
}

