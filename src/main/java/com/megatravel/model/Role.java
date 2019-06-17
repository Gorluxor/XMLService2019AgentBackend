package com.megatravel.model;

import com.megatravel.dtos.RoleDTO;
import com.megatravel.validations.StaticData;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min= StaticData.minLength, max= StaticData.lengthValue)
    private String roleName;

    public Role() {
        super();
    }

    public Role(RoleDTO roleDTO){
        super();
        this.id = roleDTO.getId();
        this.roleName = roleDTO.getName();
    }

    public Role(@NotNull @Size(min = StaticData.minLength, max = StaticData.lengthValue) String roleName) {
        this.roleName = roleName;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
