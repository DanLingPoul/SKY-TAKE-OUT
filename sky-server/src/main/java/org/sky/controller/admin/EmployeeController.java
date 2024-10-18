package org.sky.controller.admin;

import lombok.extern.slf4j.Slf4j;
import org.sky.constant.JwtClaimsConstant;
import org.sky.dto.EmployeeLoginDTO;
import org.sky.entity.Employee;
import org.sky.properties.JWTProperties;
import org.sky.result.Result;
import org.sky.service.EmployeeService;
import org.sky.utils.JwtUtil;
import org.sky.vo.EmployeeLoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 员工管理
 */
@RestController
@RequestMapping("/admin/employee")
@Slf4j
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private JWTProperties jwtProperties;

    /**
     * 登录
     *
     * @param employeeLoginDTO
     * @return
     */
    @PostMapping("/login")
    public Result<EmployeeLoginVO> login(EmployeeLoginDTO employeeLoginDTO) {
        log.info("员工登录： {}", employeeLoginDTO);
        Employee employee = employeeService.login(employeeLoginDTO);
        //登录成功后生成jwt令牌
        Map<String,Object> claims = new HashMap<>();
        claims.put(JwtClaimsConstant.EMP_ID,employee.getId());
        String token = JwtUtil.createJWT(
                jwtProperties.getAdminSecretKey(),
                jwtProperties.getAdminTtl(),
                claims);

        EmployeeLoginVO employeeLoginVO = EmployeeLoginVO.builder()
                .id(employee.getId())
                .userName(employee.getName())
                .token(token)
                .build();
        return Result.success(employeeLoginVO);
    }
    /**
     * 退出
     * @Return
     */
    @PostMapping("/logout")
    public Result<String> logout() {
        return Result.success();
    }
}


