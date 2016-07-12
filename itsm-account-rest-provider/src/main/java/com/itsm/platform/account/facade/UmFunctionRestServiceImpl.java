package com.itsm.platform.account.facade;

import com.itsm.platform.account.entity.UmFunction;
import org.dubbo.x.service.CURDService;
import org.dubbo.x.facade.RestServiceBase;
import com.itsm.platform.account.service.UmFunctionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能
 * User: baiqw
 * Date: 14-12-9
 * Time: 下午3:45
 */
public class UmFunctionRestServiceImpl extends RestServiceBase<UmFunction> implements UmFunctionRestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UmFunctionRestServiceImpl.class);

    private UmFunctionService umFunctionService;

    public UmFunctionService getUmFunctionService() {
        return umFunctionService;
    }

    public void setUmFunctionService(UmFunctionService umFunctionService) {
        this.umFunctionService = umFunctionService;
    }

    @Override
    public CURDService<UmFunction> getService() {
        return umFunctionService;
    }

}
