package com.berkbektas.humanresource.client.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
@Getter
@Setter
public class PermissionDto {

    private String permissionType;
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;
    private Integer totalDay;
    private String description;

    private Integer employee_id;
}
