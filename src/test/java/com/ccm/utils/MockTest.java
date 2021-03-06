package com.ccm.utils;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import com.ccm.entity.LoginUser;
import com.ccm.service.LoginUserService;

class MockTest {

	@Test
	void test() {
		
		String s = Paths.get(System.getProperty("user.dir"), "src/test/resources/logo.png").toString();
		System.out.println(s);
		LoginUser  loginuser = new LoginUser();
		loginuser.setId(1);
		loginuser.setLoginid("ssm");
		loginuser.setPassword("888888");
		LoginUserService ts = mock(LoginUserService.class);
		when(ts.queryById(1)).thenReturn(loginuser);
		System.out.println(ts.queryById(1).getPassword());
		}

}
