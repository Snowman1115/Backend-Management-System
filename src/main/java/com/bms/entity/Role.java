package com.bms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * Role Details
 * @author Sn0w_15
 * @since 2024-08-05
 */
@Getter
@Setter
@TableName("bms_role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Role ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * Role Code
     */
    private String roleCode;

    /**
     * Role Name
     */
    private String roleName;

    /**
     * Creator
     */
    private Long createUser;

    /**
     * 0 = isActive : 1 isDeleted
     */
    private Integer isDelete;

    /**
     * Remarks
     */
    private String remark;

    /**
     * Create Time
     */
    private LocalDateTime createTime;

    /**
     * Update Time
     */
    private LocalDateTime updateTime;


}
