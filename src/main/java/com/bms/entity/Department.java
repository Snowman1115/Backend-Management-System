package com.bms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * All Department Details
 * @author Sn0w_15
 * @since 2024-08-05
 */
@Getter
@Setter
@TableName("bms_department")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Department ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * Department Name
     */
    private String department;

    /**
     * Department Phone Number
     */
    private String phone;

    /**
     * Department Address
     */
    private String address;

    /**
     * Parent Department ID
     */
    private Long pid;

    /**
     * Parent Department Name
     */
    private String pName;

    /**
     * Sorting Order
     */
    private Integer orderNumber;

    /**
     * Create Time
     */
    private LocalDateTime createTime;

    /**
     * Update Time
     */
    private LocalDateTime updateTime;

    /**
     * 0 = isActive : 1 = isDeleted
     */
    private Integer isDelete;


}
