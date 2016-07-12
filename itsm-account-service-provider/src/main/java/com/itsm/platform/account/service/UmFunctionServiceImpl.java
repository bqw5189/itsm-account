package com.itsm.platform.account.service;

import com.itsm.platform.account.entity.UmFunction;
import org.dubbo.x.repository.DaoBase;
import org.dubbo.x.service.CURDServiceBase;
import com.itsm.platform.account.repository.UmFunctionDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *  功能
 * @author baiqw
 */
public class UmFunctionServiceImpl extends CURDServiceBase<UmFunction> implements UmFunctionService {
    @Autowired
    private UmFunctionDao umFunctionDao;

    @Override
    public DaoBase<UmFunction> getDao() {
        return umFunctionDao;
    }
}
