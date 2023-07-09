package com.chenxw.echarts.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenxw.echarts.entity.ClientInfo;
import com.chenxw.echarts.mapper.ClientInfoMapper;
import com.chenxw.echarts.service.IClientInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ChenXW
 * @since 2023-04-24
 */
@Service
public class ClientInfoServiceImpl extends ServiceImpl<ClientInfoMapper, ClientInfo> implements IClientInfoService {

}
