package com.chenxw.echarts.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenxw.echarts.entity.OrdersItem;
import com.chenxw.echarts.mapper.OrdersItemMapper;
import com.chenxw.echarts.service.IOrdersItemService;
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
public class OrdersItemServiceImpl extends ServiceImpl<OrdersItemMapper, OrdersItem> implements IOrdersItemService {

}
