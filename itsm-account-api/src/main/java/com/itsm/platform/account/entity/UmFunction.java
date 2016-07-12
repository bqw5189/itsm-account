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
 * 功能
 * <p>
 * Created by tom on 16/7/2.
 */
@Entity
@Table(name = "t_um_function")
@ApiModel("功能")
public class UmFunction extends StatusEntity {
    
    /**
     * 模块名称
     */
    @ApiModelProperty(value = "模块名称", required = false)
    
    @Column(columnDefinition = "模块名称")
    private String moduleName;
    public String getModuleName() {
        return moduleName;
    }
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    
    /**
     * 名称英文
     */
    @ApiModelProperty(value = "名称英文", required = false)
    
    @Column(columnDefinition = "名称英文")
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
    private String functDesc;
    public String getFunctDesc() {
        return functDesc;
    }
    public void setFunctDesc(String functDesc) {
        this.functDesc = functDesc;
    }
    
    /**
     * 特权
     */
    @ApiModelProperty(value = "特权", required = false)
    
    @Column(columnDefinition = "特权")
    private String privilege;
    public String getPrivilege() {
        return privilege;
    }
    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }
    
}

