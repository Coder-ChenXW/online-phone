package com.chenxw.echarts.entity;

import java.time.LocalDate;
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
public class ClientInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id; // 客户id

    private String sex; // 性别

    private LocalDate birthday; // 生日

    private String username; // 客户姓名

    private String area; // 地区

    private String province; // 省份

    private String city;    // 城市

    private String industry; // 行业

}
