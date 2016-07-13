package com.itsm.platform.account.repository;

import com.itsm.platform.account.entity.UmFunction;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

import java.util.List;

/**
 * 功能表
* Created by tom on 2016-07-13 16:11:45.
 */
@ContextConfiguration(locations = {"/META-INF/spring/applicationContext.xml"})
public class UmFunctionDaoTest extends SpringTransactionalTestCase {

    @Autowired
    private UmFunctionDao umFunctionDao;

    @Test
    public void findAll(){
        List<UmFunction> umFunctions = umFunctionDao.findAllBy();

        Assert.assertNotNull(umFunctions);

        Assert.assertEquals(umFunctions.size(), 3);
    }
}
