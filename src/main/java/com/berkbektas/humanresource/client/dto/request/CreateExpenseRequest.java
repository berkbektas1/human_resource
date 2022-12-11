package com.berkbektas.humanresource.client.dto.request;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
public class CreateExpenseRequest {

    @NotBlank(message = "Harcama türü boş olamaz")
    private String typeOfExpenditure;//harcama türü

    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotBlank(message = "Fiş  boş olamaz")
    private LocalDate receiptDate; //Fiş tarihi

    @NotNull(message = "Harcama miktarı boş olamaz")
    private Double spendingAmount; // harcama miktarı
    @NotNull(message = "Vergi oranı boş olamaz")
    private Double taxRate;
    @NotBlank(message = "Açıklama boş olamaz")
    private String description;

    private Integer employee_id;
}
