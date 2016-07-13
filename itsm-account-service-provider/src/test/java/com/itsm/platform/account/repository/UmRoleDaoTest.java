package com.itsm.platform.account.repository;

import com.itsm.platform.account.entity.UmRole;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

import java.util.List;

/**
 * 角色表
* Created by tom on 2016-07-13 16:11:45.
 */
@ContextConfiguration(locations = {"/META-INF/spring/applicationContext.xml"})
public class UmRoleDaoTest extends SpringTransactionalTestCase {

    @Autowired
    private UmRoleDao umRoleDao;

    @Test
    public void findAll(){
        List<UmRole> umRoles = umRoleDao.findAllBy();

        Assert.assertNotNull(umRoles);

        Assert.assertEquals(umRoles.size(), 0);
    }
}
