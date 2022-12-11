package com.berkbektas.humanresource.client.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
public class CreatePermissionRequest {
    @NotBlank(message = "izin türü boş geçilemez")
    private String permissionType;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotBlank(message = "Başlangıç tarihi boş olamaz")
    private LocalDate startDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotBlank(message = "Bitiş tarihi boş olamaz")
    private LocalDate endDate;
    @NotNull(message = "Toplam gün boş geçilemez")
    private Integer totalDay;
    @NotBlank(message = "Açıklama boş olmaz")
    private String description;

    private Integer employee_id;
}
