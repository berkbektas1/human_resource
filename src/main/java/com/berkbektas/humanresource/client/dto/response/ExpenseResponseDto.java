package com.berkbektas.humanresource.client.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;

@Getter
@Setter
public class ExpenseResponseDto {

    private String typeOfExpenditure;//harcama türü

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date receiptDate; //Fiş tarihi

    private Double spendingAmount; // harcama miktarı
    private Double taxRate;
    private String description;
    private String employeeName;
}
