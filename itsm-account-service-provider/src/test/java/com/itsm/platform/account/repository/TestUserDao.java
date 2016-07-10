package com.itsm.platform.account.repository;

import com.itsm.platform.account.entity.UmUser;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

import java.util.List;

/**
 * Created by tom on 16/6/21.
 */
@ContextConfiguration(locations = {"/META-INF/spring/applicationContext.xml"})
public class TestUserDao extends SpringTransactionalTestCase {

    @Autowired
    private UmUserDao umUserDao;

    @Test
    public void findByName(){
        List<UmUser> user = umUserDao.findAllBy();

        Assert.assertNotNull(user);

    }
}
