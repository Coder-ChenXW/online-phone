package com.chenxw.echarts.controller;


import com.chenxw.echarts.result.R;
import com.chenxw.echarts.entity.*;
import com.chenxw.echarts.mapper.OrdersItemMapper;
import com.chenxw.echarts.vo.HuaWeiSellTotalVo;
import com.chenxw.echarts.vo.KindOfPhoneDataVo;
import com.chenxw.echarts.vo.KindOfPhonePriceVo;
import com.chenxw.echarts.vo.TopShopFiveVo;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ChenXW
 * @since 2023-04-24
 */
@RestController
@RequestMapping("/ordersitem")
//@CrossOrigin
@Slf4j
public class OrdersItemController {


    @Resource
    private OrdersItemMapper ordersItemMapper;


    /**
     * @description: 查询订单销售前五的手机
     * @author: ChenXW
     * @date: 2023/6/5 20:19
     */
    @GetMapping("/topFive")
    public R topFive() {

        List<TopShopFiveVo> ordersItemList = ordersItemMapper.selectTopFive();

        log.info("ordersItemList:{}", ordersItemList);

        return R.ok().data("ordersItemList", ordersItemList);

    }


    /**
     * @description: 近三年的销售变化
     * @author: ChenXW
     * @date: 2023/6/5 20:39
     */
    @GetMapping("/yearBrand")
    public R yearBrand() {
        // 查询近三年销售变化

        List<YearBrandData> yearBrandDataList = ordersItemMapper.selectYearBrand();


        log.info("ordersItemList:{}", yearBrandDataList);

        return R.ok().data("ordersItemList", yearBrandDataList);

    }

    /**
     * @description: 查询华为手机不同类型销量占比
     * @author: ChenXW
     * @date: 2023/6/5 23:19
     */
    @GetMapping("/kindOfPhone")
    public R kindOfPhone() {

        List<KindOfPhoneDataVo> kindOfPhoneDatumVos = ordersItemMapper.selectKindOfPhone();


        log.info("ordersItemList:{}", kindOfPhoneDatumVos);

        return R.ok().data("ordersItemList", kindOfPhoneDatumVos);

    }


    /**
     * @description: 华为手机各价位销量
     * @author: ChenXW
     * @date: 2023/6/5 23:25
     */
    @GetMapping("/kindOfPrice")
    public R kindOfPrice() {

        List<KindOfPhonePriceVo> kindOfPrice = ordersItemMapper.selectKindOfPrice();
        log.info("kindOfPrice:{}", kindOfPrice);

        return R.ok().data("ordersItemList", kindOfPrice);
    }

    /**
     * @description: 近三年各品牌销售变化
     * @author: ChenXW
     * @date: 2023/6/5 23:39
     */
    @GetMapping("/yearBrandKindSell")
    public R yearBrandKindSell() {

        List<YearBrandKindSell> yearBrandKindSell = ordersItemMapper.selectYearBrandKindSell();
        log.info("yearBrandKindSell:{}", yearBrandKindSell);

        return R.ok().data("yearBrandKindSell", yearBrandKindSell);
    }


    /**
     * @description: 查询华为手机的销量总体概况
     * @author: ChenXW
     * @date: 2023/6/6 0:02
     */
    @GetMapping("/huaweiSell")
    public R huaweiSell() {

        List<HuaWeiSellTotalVo> huaWeiSellTotalList = ordersItemMapper.selectHuaWeiSellTotal();

        log.info("huaWeiSellTotalList:{}", huaWeiSellTotalList);

        return R.ok().data("huaWeiSellTotalList", huaWeiSellTotalList);

    }

}
