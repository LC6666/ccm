package com.ccm.controller;

import com.ccm.entity.LoginUser;
import com.ccm.service.LoginUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (LoginTest)表控制层
 *
 * @author makejava
 * @since 2020-10-23 16:30:23
 */
@RestController
@RequestMapping("loginUser")
public class LoginUserController {
    /**
     * 服务对象
     */
    @Resource
    private LoginUserService loginTestService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public LoginUser selectOne(Integer id) {
        return this.loginTestService.queryById(id);
    }

}