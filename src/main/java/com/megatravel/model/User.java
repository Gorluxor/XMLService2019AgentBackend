package com.megatravel.model;

import com.megatravel.dtos.UserDTO;
import com.megatravel.validations.EmailValidation;
import com.megatravel.validations.StaticData;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings("WeakerAccess")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min= StaticData.minLength, max=StaticData.lengthValue)
    private String name;
    @NotNull
    @Size(min=StaticData.minLength, max=StaticData.lengthValue)
    private String lastName;
    @NotNull
    private String password;
    @NotNull
    private String salt;
    @EmailValidation
    @NotNull
    @Size(min=StaticData.minLengthEmail, max= StaticData.maxLengthEmail)
    private String email;
    @OneToOne
    private Role role;

    // Above needed for spring security, below extra info

    protected String country;

    protected Date birthday;

    protected String phoneNumber;

    protected String pib;

    protected boolean activatedUser;

    @ManyToOne
    protected Location location;

    @OneToMany(mappedBy = "user")
    protected List<Reservation> reservations;

    @OneToOne(mappedBy = "user")
    protected Accommodation accommodation;

    public User() {

    }

    public User(UserDTO userDTO) {
        this.name = userDTO.getName();
        this.lastName = userDTO.getLastName();
        this.password = userDTO.getPassword();
        this.email = userDTO.getEmail();
        this.role = userDTO.getRoleDTO() == null ? null : new Role(userDTO.getRoleDTO());
        this.id = userDTO.getId();
    }

    // Minimum for security
    public User(Long id, String name, String lastName, String password, String salt, String email){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.salt = salt;
        this.email = email;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Accommodation getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(Accommodation accommodation) {
        this.accommodation = accommodation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public boolean isActivatedUser() {
        return activatedUser;
    }

    public void setActivatedUser(boolean activatedUser) {
        this.activatedUser = activatedUser;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
