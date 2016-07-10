package com.itsm.platform.account.service;

import com.itsm.platform.account.entity.UmUser;
import com.itsm.platform.account.repository.UmUserDao;
import org.dubbo.x.repository.DaoBase;
import org.dubbo.x.service.CURDServiceBase;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *  用户
 * @author baiqw
 */
public class UmUserServiceImpl extends CURDServiceBase<UmUser> implements UmUserService {
    @Autowired
    private UmUserDao umUserDao;

    @Override
    public DaoBase<UmUser> getDao() {
        return umUserDao;
    }
}
