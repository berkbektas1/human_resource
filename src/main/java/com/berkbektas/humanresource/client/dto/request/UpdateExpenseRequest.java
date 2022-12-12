package com.berkbektas.humanresource.client.dto.request;

import com.berkbektas.humanresource.model.Employee;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UpdateExpenseRequest {
    private String typeOfExpenditure;//harcama türü

    private LocalDate receiptDate; //Fiş tarihi

    private Double spendingAmount; // harcama miktarı
    private Double taxRate;
    private String description;

}
