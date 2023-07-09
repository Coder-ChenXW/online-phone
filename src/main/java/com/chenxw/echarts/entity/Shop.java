package com.chenxw.echarts.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ChenXW
 * @since 2023-04-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id; // 商品id

    @TableField("shopType")
    private String shopType; // 商品类型

    private String brand; // 商品品牌

    @TableField("shopModel")
    private String shopModel; // 商品型号

    @TableField("brandSize")
    private String brandSize; // 商品规格

    private Double price; // 商品价格


}
