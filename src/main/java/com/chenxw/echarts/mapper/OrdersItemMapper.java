package com.chenxw.echarts.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenxw.echarts.entity.*;
import com.chenxw.echarts.vo.HuaWeiSellTotalVo;
import com.chenxw.echarts.vo.KindOfPhoneDataVo;
import com.chenxw.echarts.vo.KindOfPhonePriceVo;
import com.chenxw.echarts.vo.TopShopFiveVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ChenXW
 * @since 2023-04-24
 */
@Mapper
public interface OrdersItemMapper extends BaseMapper<OrdersItem> {

    List<YearBrandData> selectYearBrand();

    List<TopShopFiveVo> selectTopFive();

    List<KindOfPhoneDataVo> selectKindOfPhone();


    List<KindOfPhonePriceVo> selectKindOfPrice();


    List<YearBrandKindSell> selectYearBrandKindSell();

    List<HuaWeiSellTotalVo> selectHuaWeiSellTotal();

}
