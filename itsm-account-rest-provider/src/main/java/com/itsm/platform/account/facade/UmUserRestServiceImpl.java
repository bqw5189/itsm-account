package com.itsm.platform.account.facade;

import com.itsm.platform.account.entity.UmUser;
import com.itsm.platform.account.service.UmUserService;
import org.dubbo.x.facade.RestServiceBase;
import org.dubbo.x.service.CURDService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 用户
 * User: baiqw
 * Date: 14-12-9
 * Time: 下午3:45
 */
public class UmUserRestServiceImpl extends RestServiceBase<UmUser> implements UmUserRestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UmUserRestServiceImpl.class);

    private UmUserService umUserService;

    public UmUserService getUmUserService() {
        return umUserService;
    }

    public void setUmUserService(UmUserService umUserService) {
        this.umUserService = umUserService;
    }

    @Override
    public CURDService<UmUser> getService() {
        return umUserService;
    }

}
