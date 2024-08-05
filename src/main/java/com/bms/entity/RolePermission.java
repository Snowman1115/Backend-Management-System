package com.bms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * User Role Details
 * @author Sn0w_15
 * @since 2024-08-05
 */
@Getter
@Setter
@TableName("bms_role_permission")
public class RolePermission implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Role ID
     */
    private Long roleId;

    /**
     * Permission ID
     */
    private Long permissionId;


}