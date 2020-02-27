package com.guoxianbin.common.utils;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String str="1";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		String str="1";
		boolean b = StringUtil.hasText(str);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String c = StringUtil.randomChineseString(10);
		System.out.println(c);
	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 100; i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name);	
		}
	
	}

}
