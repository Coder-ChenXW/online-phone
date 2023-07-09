package com.chenxw.echarts;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chenxw.echarts.entity.ClientInfo;
import com.chenxw.echarts.entity.Employee;
import com.chenxw.echarts.mapper.ClientInfoMapper;
import com.chenxw.echarts.mapper.EmployeeMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OnlinePhoneApplication.class)
class OnlinePhoneApplicationTests {


    @Resource
    private EmployeeMapper employeeMapper;

    @Resource
    private ClientInfoMapper clientInfoMapper;

    @Test
    public void testFindAllEmployee() {

        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();

        List<Employee> employeeList = employeeMapper.selectList(queryWrapper);

        employeeList.forEach(System.out::println);

    }

    // 各省的客户人数,SELECT province, COUNT('province') FROM client_info GROUP BY province;
    @Test
    public void testFindProvince() {
        QueryWrapper<ClientInfo> queryWrapper = new QueryWrapper<>();
        List<ClientInfo> clientInfos = clientInfoMapper.selectList(queryWrapper.select("province", "count(province) as count").groupBy("province"));
        clientInfos.forEach(System.out::println);
    }


}
