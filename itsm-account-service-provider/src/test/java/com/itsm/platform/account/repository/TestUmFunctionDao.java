package com.itsm.platform.account.repository;

import com.itsm.platform.account.entity.UmFunction;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

import java.util.List;

/**
 * 功能
 * Created by tom on 16/6/21.
 */
@ContextConfiguration(locations = {"/META-INF/spring/applicationContext.xml"})
public class TestUmFunctionDao extends SpringTransactionalTestCase {

    @Autowired
    private UmFunctionDao umFunctionDao;

    @Test
    public void findAll(){
        List<UmFunction> umFunctions = umFunctionDao.findAllBy();

        Assert.assertNotNull(umFunctions);

        Assert.assertEquals(umFunctions.size(), 71);
    }
}
