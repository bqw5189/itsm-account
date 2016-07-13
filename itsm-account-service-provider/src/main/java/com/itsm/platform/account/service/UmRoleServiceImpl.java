package com.itsm.platform.account.service;

import com.itsm.platform.account.entity.UmRole;
import org.dubbo.x.repository.DaoBase;
import org.dubbo.x.service.CURDServiceBase;
import com.itsm.platform.account.repository.UmRoleDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *  角色表
* Created by tom on 2016-07-13 16:11:45.
 */
public class UmRoleServiceImpl extends CURDServiceBase<UmRole> implements UmRoleService {
    @Autowired
    private UmRoleDao umRoleDao;

    @Override
    public DaoBase<UmRole> getDao() {
        return umRoleDao;
    }
}
