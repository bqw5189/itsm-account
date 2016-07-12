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
 * 用户
 * <p>
 * Created by tom on 16/7/2.
 */
@Entity
@Table(name = "t_um_user")
@ApiModel("用户")
public class UmUser extends StatusEntity {
    
    /**
     * 登录名
     */
    @ApiModelProperty(value = "登录名", required = false)
    @NotNull
    @Column(columnDefinition = "登录名")
    private String loginName;
    public String getLoginName() {
        return loginName;
    }
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码", required = false)
    @NotNull
    @Column(columnDefinition = "密码")
    private String passwd;
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    /**
     * 名称
     */
    @ApiModelProperty(value = "名称", required = false)
    @NotNull
    @Column(columnDefinition = "名称")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 电话
     */
    @ApiModelProperty(value = "电话", required = false)
    
    @Column(columnDefinition = "电话")
    private String phone;
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    /**
     * 邮件
     */
    @ApiModelProperty(value = "邮件", required = false)
    
    @Column(columnDefinition = "邮件")
    private String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * 部门名称
     */
    @ApiModelProperty(value = "部门名称", required = false)
    
    @Column(columnDefinition = "部门名称")
    private String departmentName;
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    /**
     * 最后登录时间
     */
    @ApiModelProperty(value = "最后登录时间", required = false)
    
    @Column(columnDefinition = "最后登录时间")
    private Integer lastLoginTime;
    public Integer getLastLoginTime() {
        return lastLoginTime;
    }
    public void setLastLoginTime(Integer lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    
    /**
     * 登录ip
     */
    @ApiModelProperty(value = "登录ip", required = false)
    
    @Column(columnDefinition = "登录ip")
    private String loginAddress;
    public String getLoginAddress() {
        return loginAddress;
    }
    public void setLoginAddress(String loginAddress) {
        this.loginAddress = loginAddress;
    }
    
    /**
     * 描述描述
     */
    @ApiModelProperty(value = "描述描述", required = false)
    
    @Column(columnDefinition = "描述描述")
    private String remark;
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    /**
     * 锁定
     */
    @ApiModelProperty(value = "锁定", required = false)
    
    @Column(columnDefinition = "锁定")
    private String locked;
    public String getLocked() {
        return locked;
    }
    public void setLocked(String locked) {
        this.locked = locked;
    }
    
    /**
     * 登录ip
     */
    @ApiModelProperty(value = "登录ip", required = false)
    
    @Column(columnDefinition = "登录ip")
    private String ip;
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    
    /**
     * 企业id
     */
    @ApiModelProperty(value = "企业id", required = false)
    
    @Column(columnDefinition = "企业id")
    private String enterpriseId;
    public String getEnterpriseId() {
        return enterpriseId;
    }
    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
    
}

