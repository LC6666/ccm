package com.ccm.utils;import org.junit.jupiter.api.Assertions;import org.junit.jupiter.api.Test;class ResultCodeTest {	@Test	void testResultCode() {		ResultCode r = ResultCode.SUCCESS;		Assertions.assertEquals(r.code(), 1,r.message());	}		}