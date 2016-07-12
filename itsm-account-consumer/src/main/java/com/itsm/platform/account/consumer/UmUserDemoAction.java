package com.itsm.platform.account.consumer;


import com.alibaba.fastjson.JSON;
import com.itsm.platform.account.entity.UmUser;
import com.itsm.platform.account.service.UmUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author baiqw
 */
public class UmUserDemoAction {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmUserDemoAction.class);
    private UmUserService umUserService;

    public UmUserService getUmUserService() {
        return umUserService;
    }

    public void setUmUserService(UmUserService umUserService) {
        this.umUserService = umUserService;
    }

    public void start() throws Exception {
        List<UmUser> umUsers = umUserService.listAll();
        assert(umUsers != null);
        assert(umUsers.size() == 1);

        LOGGER.info("list all:{}", JSON.toJSON(umUsers));
    }
}
