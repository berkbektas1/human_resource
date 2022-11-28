package com.berkbektas.humanresource.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
    private Double salary;
    private String title;
    private String role;
    private String level;
    private String department;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateOfStart;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateOfBirth;

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
    private List<Expense> expensesList;

    @OneToMany(
            mappedBy = "employee",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private List<Permission> permissionsList;

}
