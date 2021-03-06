package com.megatravel.dtos;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import com.megatravel.model.AccommodationUnit;
import com.megatravel.model.Reservation;
import com.megatravel.model.User;

public class ToDTO {

	
	
	public static ReservationDTO toReservationDTO(Reservation reservation) throws DatatypeConfigurationException {
		ReservationDTO newObj = new ReservationDTO();
		newObj.setId(reservation.getId());
		SimpleDateFormat format = new SimpleDateFormat("DD/MM/YYYY HH:MM");
		
		
		newObj.setArrivalDate( reservation.getArrivalDate());
		newObj.setDepartureDate(reservation.getDepartureDate());
		newObj.setStayRealized(reservation.isStayRealized());
		newObj.setReservationPrice(reservation.getReservationPrice());
		newObj.setUserDTO( reservation.getUser() == null? null : ToDTO.toUserDTO(reservation.getUser()));
		newObj.setLastChangedDate(reservation.getLastChangedDate());
//        for (AccommodationUnit au : reservation.getAccommodationUnit()){
//            newObj.getAccommodationUnitDTO().add((Object)ToDTO.toAccommodationUnitDTO(au));
//        }
        newObj.setReservationPrice(reservation.getReservationPrice());
        return newObj;

    }
	
	public static UserDTO toUserDTO(User user) {
		UserDTO newObj = new UserDTO();
		
		return newObj;
	}
	
	public static AccommodationUnitDTO toAccommodationUnitDTO(AccommodationUnit au) {
		AccommodationUnitDTO newObj = new AccommodationUnitDTO();
		
		return newObj;
	}
	
	
}
