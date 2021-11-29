package com.gb.DanismanPortal.mapper;

import com.gb.DanismanPortal.entity.Employee;
import com.gb.DanismanPortal.reponse.EmployeeResponse;
import com.gb.DanismanPortal.request.Employee.EmployeeAddRequest;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    List<EmployeeResponse> toEmployeeResponseList (List<Employee> employies);
    EmployeeResponse toEmployeeResponse (Employee employee);
    Employee toEmployee (EmployeeAddRequest employeeAddRequest);
}
