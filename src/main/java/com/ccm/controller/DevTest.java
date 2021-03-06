package com.ccm.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("devtest")
public class DevTest {

    @RequestMapping(value = "/",method=RequestMethod.GET)
    public String helloworld() {
        return "HelloWorld";
    }


    //	get基本接口
    @RequestMapping(value = "/getresponse/{id}",method=RequestMethod.GET)
    public String getresponse(@PathVariable("id") Integer id) {
        return "getresponse="+id;
    }

    //	post基本接口
    @RequestMapping(value = "/postresponse",method= RequestMethod.POST)
    public String postresponse(HttpServletRequest request ) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        return "username="+username+"   password="+password;
    }

}
