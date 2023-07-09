package com.chenxw.echarts.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chenxw.echarts.result.R;
import com.chenxw.echarts.entity.ClientInfo;
import com.chenxw.echarts.mapper.ClientInfoMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ChenXW
 * @since 2023-04-24
 */
@RestController
@RequestMapping("/clientinfo")
@Slf4j
public class ClientInfoController {

    @Resource
    private ClientInfoMapper clientInfoMapper;

    /**
     * @description: 查询各个省份的人数
     * @author: ChenXW
     * @date: 2023/6/5 21:39
     */
    @GetMapping("/province")
    public R province() {

        QueryWrapper<ClientInfo> queryWrapper = new QueryWrapper<>();

        List<Map<String, Object>> clientInfoList = clientInfoMapper.selectMaps(queryWrapper.select("province", "count(province) as count").groupBy("province"));

        log.info("clientInfoList:{}", clientInfoList);

        return R.ok().data("clientInfoList", clientInfoList);


    }


    /**
     * @description: 客户行业分布情况
     * @author: ChenXW
     * @date: 2023/6/5 21:45
     */
    @GetMapping("/job")
    public R  job(){
        QueryWrapper<ClientInfo> queryWrapper = new QueryWrapper<>();

        List<Map<String, Object>> clientInfoList = clientInfoMapper.selectMaps(queryWrapper.select("industry", "count(industry) as job").groupBy("industry"));

        log.info("clientInfoList:{}", clientInfoList);
        return R.ok().data("clientInfoList", clientInfoList);
    }


}
