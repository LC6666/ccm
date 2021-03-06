package com.ccm.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Paths;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import io.qameta.allure.*;

@SpringBootTest
@Epic("Epic测试")
@Feature("第一个feature")
public class AllureDemoTest {

	@Test
	@Tag("基础测试")
	@Issue("指定缺陷")
	@TmsLink("tmslink?")
	@Severity(SeverityLevel.NORMAL)
	@Story("场景测试")
	void contextLoads() {
		mytest1();
		Assertions.fail();
	}

	@Story("我的第一个测试用例")
	@DisplayName("junit显示名称")
	@Description("allure描述说明")
	@Test
	void mytest1() {

	}

	@Story("我的第二个测试用例")
	@DisplayName("截图测试")
	@Description("allure描述说明2")
	@Attachment(value = "截图", type = "image/png")
	@Test
	@Step("测试用例2")
	void mytest2() {
		System.out.println("测试用例1");
		try {
			Allure.addAttachment("logo", "image/png",
					new FileInputStream(
							Paths.get(System.getProperty("user.dir"), "src/test/resources/logo.png").toString()),
					".png");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
