package com.itsm.platform.account.consumer;


import com.alibaba.fastjson.JSON;
import com.itsm.platform.account.entity.UmRole;
import com.itsm.platform.account.service.UmRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
* Created by tom on 2016-07-13 16:11:45.
 */
public class UmRoleDemoAction {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmRoleDemoAction.class);
    private UmRoleService umRoleService;

    public UmRoleService getUmRoleService() {
        return umRoleService;
    }

    public void setUmRoleService(UmRoleService umRoleService) {
        this.umRoleService = umRoleService;
    }

    public void start() throws Exception {
        List<UmRole> umRoles = umRoleService.listAll();
        assert(umRoles != null);
        assert(umRoles.size() == 1);

        LOGGER.info("list all:{}", JSON.toJSON(umRoles));
    }
}
