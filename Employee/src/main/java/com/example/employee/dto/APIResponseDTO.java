package com.example.employee.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class APIResponseDTO{
    public EmployeeDTO employee;
    public DepartmentDto department;
}
