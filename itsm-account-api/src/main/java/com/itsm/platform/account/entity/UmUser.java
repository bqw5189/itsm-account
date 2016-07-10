package com.itsm.platform.account.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.dubbo.x.entity.StatusEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 用户
 * <p>
 * Created by tom on 16/7/2.
 */
@Entity
@Table(name = "t_um_user")
@ApiModel("用户")
public class UmUser extends StatusEntity {
    
    /**
     * 登录用户名
     */
    @ApiModelProperty(value = "登录用户名", required = false)
    @NotNull
    @Column(columnDefinition = "登录用户名")
    private String loginName;
    public String getLoginName() {
        return loginName;
    }
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    
    /**
     * passwd
     */
    @ApiModelProperty(value = "passwd", required = false)
    @NotNull
    @Column(columnDefinition = "passwd")
    private String passwd;
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    /**
     * name
     */
    @ApiModelProperty(value = "name", required = false)
    @NotNull
    @Column(columnDefinition = "name")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * phone
     */
    @ApiModelProperty(value = "phone", required = false)
    
    @Column(columnDefinition = "phone")
    private String phone;
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    /**
     * email
     */
    @ApiModelProperty(value = "email", required = false)
    
    @Column(columnDefinition = "email")
    private String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * departmentName
     */
    @ApiModelProperty(value = "departmentName", required = false)
    
    @Column(columnDefinition = "departmentName")
    private String departmentName;
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    /**
     * lastLoginTime
     */
    @ApiModelProperty(value = "lastLoginTime", required = false)
    
    @Column(columnDefinition = "lastLoginTime")
    private Integer lastLoginTime;
    public Integer getLastLoginTime() {
        return lastLoginTime;
    }
    public void setLastLoginTime(Integer lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    
    /**
     * loginAddress
     */
    @ApiModelProperty(value = "loginAddress", required = false)
    
    @Column(columnDefinition = "loginAddress")
    private String loginAddress;
    public String getLoginAddress() {
        return loginAddress;
    }
    public void setLoginAddress(String loginAddress) {
        this.loginAddress = loginAddress;
    }
    
    /**
     * remark
     */
    @ApiModelProperty(value = "remark", required = false)
    
    @Column(columnDefinition = "remark")
    private String remark;
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    /**
     * locked
     */
    @ApiModelProperty(value = "locked", required = false)
    
    @Column(columnDefinition = "locked")
    private String locked;
    public String getLocked() {
        return locked;
    }
    public void setLocked(String locked) {
        this.locked = locked;
    }
    
    /**
     * ip
     */
    @ApiModelProperty(value = "ip", required = false)
    
    @Column(columnDefinition = "ip")
    private String ip;
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    
    /**
     * enterpriseId
     */
    @ApiModelProperty(value = "enterpriseId", required = false)
    
    @Column(columnDefinition = "enterpriseId")
    private String enterpriseId;
    public String getEnterpriseId() {
        return enterpriseId;
    }
    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
    
}

