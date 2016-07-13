package com.itsm.platform.account.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.dubbo.x.entity.StatusEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import java.util.Date;

/**
 * 角色表
 * <p>
* Created by tom on 2016-07-13 16:11:45.
 */
@Entity
@Table(name = "t_um_role")
@ApiModel("角色表")
public class UmRole extends StatusEntity {
    
    /**
     * 名称
     */
    @ApiModelProperty(value = "名称", required = false)
    
    @Column(columnDefinition = "名称")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 描述
     */
    @ApiModelProperty(value = "描述", required = false)
    
    @Column(columnDefinition = "描述")
    private String describe;
    public String getDescribe() {
        return describe;
    }
    public void setDescribe(String describe) {
        this.describe = describe;
    }
    
}

