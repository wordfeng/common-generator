package com.common.generate.utils.core;

import java.util.Random;

/**
 * 
 * @author 肖宇峰
 *
 */
public class GeneratePhoneNumber {
	public static final String[] SECOND_NUM = new String[] { "3", "4", "5", "7", "8", "9" };

	/**
	 * 生成一个11位手机号
	 * @return 手机号的字符串
	 */
	public static String generatePhoneNumber() {
		StringBuffer sb = new StringBuffer();
		sb.append(1);
		sb.append(SECOND_NUM[new Random().nextInt(SECOND_NUM.length)]);
		for (int i = 0; i < 9; i++) {
			sb.append(randomANumberOneToTen());
		}
		return sb.toString();
	}

	private static String randomANumberOneToTen() {
		return String.valueOf(new Random().nextInt(10));
	}

	public static void main(String[] args) {
		System.out.println(generatePhoneNumber());
	}

}
