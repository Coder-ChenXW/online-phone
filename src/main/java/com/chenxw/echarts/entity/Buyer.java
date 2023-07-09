package com.chenxw.echarts.entity;

import java.time.LocalDate;
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
public class Buyer implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id; // 采购id

    @TableField("buyDate")
    private LocalDate buyDate; // 采购日期

    @TableField("buyerId")
    private Integer buyerId; // 采购员id


}
