package com.berkbektas.humanresource.client.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;

@Getter
@Setter
public class ExpenseDto {
    private String typeOfExpenditure;//harcama türü

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate receiptDate; //Fiş tarihi

    private Double spendingAmount; // harcama miktarı
    private Double taxRate;
    private String description;

    private Integer employeeId;
}
