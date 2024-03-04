package com.example.employee.service;

import com.example.employee.dto.DepartmentDto;
import com.example.employee.dto.EmployeeDTO;
import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;
    private RestTemplate restTemplate;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO){
        Employee employee = new Employee(
                employeeDTO.getId(),
                employeeDTO.getFirstName(),
                employeeDTO.getLastName(),
                employeeDTO.getEmail(),
                employeeDTO.getDepartmentCode()
        );
        Employee savedEmployee = employeeRepo.save(employee);
        EmployeeDTO savedEmployeeDTO = new EmployeeDTO(
                savedEmployee.getId(),
                savedEmployee.getFirstName(),
                savedEmployee.getLastName(),
                savedEmployee.getEmail(),
                savedEmployee.getDepartmentCode()
        );
        return savedEmployeeDTO;
    }

    public EmployeeDTO getEmployeeById(Long id){
        Employee employee = employeeRepo.findById(id).get();

       ResponseEntity<DepartmentDto> responseEntity = restTemplate.getForEntity("localhost:8080/api/department/getDepartment/"+ employee.getDepartmentCode(), DepartmentDto.class);
       DepartmentDto departmentDto =  responseEntity.getBody();
        EmployeeDTO employeeDTO = new EmployeeDTO(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getDepartmentCode()
        );
        return employeeDTO;
    }
}
