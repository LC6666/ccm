package com.ccm.service;

import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.ccm.entity.LoginUser;

class LoginUserServiceTest {

	@Test
	void test() {
		LoginUser  loginuser = new LoginUser();
		loginuser.setId(1);
		loginuser.setLoginid("ssm");
		loginuser.setPassword("888888");
		LoginUserService ts = mock(LoginUserService.class);
		when(ts.queryById(1)).thenReturn(loginuser);
		System.out.println(ts.queryById(1).getLoginid());
		
		LoginUser  loginuser2 = new LoginUser();
		loginuser2.setId(1);
		loginuser2.setLoginid("username1");
		loginuser2.setPassword("888888");
		LoginUserService ts2 = Mockito.mock(LoginUserService.class);
//		使用anyInt()可以匹配任何整形数据
		when(ts2.queryById(Mockito.anyInt())).thenReturn(loginuser2);
		System.out.println(ts2.queryById(100).getLoginid()+"|"+ts2.queryById(100).getId()+"|"+ts2.queryById(100).getPassword());
		
		
		LoginUser  loginuser3 = new LoginUser();
		loginuser3.setId(1);
		loginuser3.setLoginid("username2");
		loginuser3.setPassword("888888");
		LoginUserService ts3 = Mockito.mock(LoginUserService.class);
//		使用anyInt()可以匹配任何整形数据
		when(ts3.queryById(Mockito.anyInt())).thenReturn(loginuser3);
//		使用Verify断言，在Mockito中可以直接使用断言，而不是Junit的Assertion
//		验证某个方法是否被调用
		System.out.println(ts3.queryById(500).getLoginid());
		verify(ts3).queryById(500);
	}
	
	
	

	
}
