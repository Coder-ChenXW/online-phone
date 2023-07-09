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
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id; // 员工id

    private String username; // 员工姓名

    private String dept; // 部门

    private LocalDate hiredate; // 入职时间

    @TableField("idCard")
    private String idCard; // 身份证号

    @TableField("positionName")
    private String positionName; // 岗位名称

    private String rank; // 职级

    private String education; // 学历


}
