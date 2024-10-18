package org.sky.service;


import org.sky.dto.EmployeeLoginDTO;
import org.sky.entity.Employee;

public interface EmployeeService {
    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

}
