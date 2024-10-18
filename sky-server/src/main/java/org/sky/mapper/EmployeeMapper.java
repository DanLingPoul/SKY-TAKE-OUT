package org.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.sky.entity.Employee;
import org.sky.service.EmployeeService;

@Mapper
public interface EmployeeMapper {
    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);
}