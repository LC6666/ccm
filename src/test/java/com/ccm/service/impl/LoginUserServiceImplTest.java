package com.ccm.service.impl;



import javax.annotation.Resource;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.ccm.entity.LoginUser;
import com.ccm.service.LoginUserService;

/**
 * @author Administrator
 *
 */
@SpringBootTest
class LoginUserServiceImplTest {
    
    /**
     * 服务对象
     */
    @Resource
    private LoginUserService loginUserService;

    @Test
    @Transactional
    void testQueryById() {
        LoginUser login = this.loginUserService.queryById(1);
        Assertions.assertEquals("ssm",login.getLoginid());
//      事务只会在遇到RuntimeException的时候才会回滚
    }
    
    
    @Test
    @Transactional
    @Rollback(true)
    void testInsert() {
        LoginUser login = new LoginUser();
        login.setLoginid("zhyb5");
        login.setPassword("666666");
        this.loginUserService.insert(login);
        login.setLoginid("zhyb6");
        login.setPassword("666666");
        this.loginUserService.insert(login);
//      Assertions.assertEquals("ssm2",login.getLoginid());
//      事务任何情况都会回滚
    }
    
    @Test
    @Transactional
    @Rollback(false)
    void testInsert2() {
        LoginUser login = new LoginUser();
        login.setLoginid("zhyb5");
        login.setPassword("666666");
        this.loginUserService.insert(login);
        login.setLoginid("zhyb6");
        login.setPassword("666666");
        this.loginUserService.insert(login);
//      Assertions.assertEquals("ssm2",login.getLoginid());
//      Rollback(true)事务只会在遇到RuntimeException的时候才会回滚
    }

}