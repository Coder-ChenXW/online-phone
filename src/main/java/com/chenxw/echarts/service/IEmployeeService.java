package com.chenxw.echarts.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.chenxw.echarts.entity.Employee;


import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ChenXW
 * @since 2023-04-24
 */
public interface IEmployeeService extends IService<Employee> {

    // 查询所有员工
    public  List<Employee> getAllEmployee();

}
