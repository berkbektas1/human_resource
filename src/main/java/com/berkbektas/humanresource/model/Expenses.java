package com.berkbektas.humanresource.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "expenses")
public class Expenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "expenses_id")
    private Integer id;
    private String typeOfExpenditure;//harcama türü
    private Date receiptDate; //Fiş tarihi
    private BigDecimal spendingAmount; // harcama miktarı
    private Double taxRate;
    private String description;

    @ManyToOne()
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    private Employee employee;
}

