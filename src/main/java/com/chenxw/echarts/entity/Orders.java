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
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;  // 销售id

    private LocalDate buyday; // 日期

    @TableField("clientId")
    private Integer clientId; // 客户id

    @TableField("sellId")
    private Integer sellId; // 销售员id


}
