package com.berkbektas.humanresource.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer id;
    private String firstName;
    private String lastName;

    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
    private String email;

    private String identityNumber;
    private BigDecimal salary;
    private String title;
    private String role;
    private String level;
    private String department;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date dateOfStart;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @OneToOne(
            mappedBy = "employee",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Address address;

    @OneToMany(
            mappedBy = "employee",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    @JsonIgnore
    private List<Expenses> expensesList;

    @OneToMany(
            mappedBy = "employee",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    @JsonIgnore
    private List<Permissions> permissionsList;

}
