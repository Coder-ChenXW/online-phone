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
public class Buyeritem implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id; // 采购明细id

    @TableField("buyId")
    private Integer buyId;  // 采购id

    @TableField("shopId")
    private Integer shopId;  // 商品id

    @TableField("buyCount")
    private Integer buyCount; // 采购数量

    @TableField("buyPrice")
    private Double buyPrice; // 采购价格


}
