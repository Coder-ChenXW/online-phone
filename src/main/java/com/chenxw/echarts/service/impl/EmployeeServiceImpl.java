package com.chenxw.echarts.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenxw.echarts.entity.Employee;
import com.chenxw.echarts.mapper.EmployeeMapper;
import com.chenxw.echarts.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;


import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ChenXW
 * @since 2023-04-24
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployee() {

        List<Employee> employees = employeeMapper.selectList(null);
        return employees;


//        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
//        // 查询employee表中所有员工
//        queryWrapper.select("id", "name", "age", "education", "salary");


    }
}
