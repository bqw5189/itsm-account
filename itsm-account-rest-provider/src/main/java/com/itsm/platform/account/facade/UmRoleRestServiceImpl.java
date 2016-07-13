package com.itsm.platform.account.facade;

import com.itsm.platform.account.entity.UmRole;
import org.dubbo.x.service.CURDService;
import org.dubbo.x.facade.RestServiceBase;
import com.itsm.platform.account.service.UmRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 角色表
* Created by tom on 2016-07-13 16:11:45.
 */
public class UmRoleRestServiceImpl extends RestServiceBase<UmRole> implements UmRoleRestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UmRoleRestServiceImpl.class);

    private UmRoleService umRoleService;

    public UmRoleService getUmRoleService() {
        return umRoleService;
    }

    public void setUmRoleService(UmRoleService umRoleService) {
        this.umRoleService = umRoleService;
    }

    @Override
    public CURDService<UmRole> getService() {
        return umRoleService;
    }

}
