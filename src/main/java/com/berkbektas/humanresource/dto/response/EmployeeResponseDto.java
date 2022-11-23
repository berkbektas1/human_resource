package com.berkbektas.humanresource.dto.response;

import com.berkbektas.humanresource.model.Address;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class EmployeeResponseDto {
    private String firstName;
    private String lastName;

    private String email;

    private String identityNumber;
    private BigDecimal salary;
    private String title;
    private String role;
    private String level;
    private String department;

    @Temporal(TemporalType.DATE)
    private Date dateOfStart;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    private Address address;
}
