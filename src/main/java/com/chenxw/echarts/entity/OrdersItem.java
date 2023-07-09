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
public class OrdersItem implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id; // 销售id

    @TableField("brandId")
    private Integer brandId; // 商品id

    @TableField("sellCount")
    private Integer sellCount; // 销售数量

    @TableField("sellPrice")
    private Double sellPrice; // 销售价格


}
