package com.example.department.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {
    private long id;
    private String departmentName;
    private String departmentDescription;
    private String departmentCode;

}
