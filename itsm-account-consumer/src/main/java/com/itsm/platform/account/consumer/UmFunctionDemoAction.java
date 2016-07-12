package com.itsm.platform.account.consumer;


import com.alibaba.fastjson.JSON;
import com.itsm.platform.account.entity.UmFunction;
import com.itsm.platform.account.service.UmFunctionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author baiqw
 */
public class UmFunctionDemoAction {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmFunctionDemoAction.class);
    private UmFunctionService umFunctionService;

    public UmFunctionService getUmFunctionService() {
        return umFunctionService;
    }

    public void setUmFunctionService(UmFunctionService umFunctionService) {
        this.umFunctionService = umFunctionService;
    }

    public void start() throws Exception {
        List<UmFunction> umFunctions = umFunctionService.listAll();
        assert(umFunctions != null);
        assert(umFunctions.size() == 1);

        LOGGER.info("list all:{}", JSON.toJSON(umFunctions));
    }
}
