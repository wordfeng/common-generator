package com.common.generate.utils.core;

import java.util.Random;

/**
 * 生成类座机号
 * 
 * @author 肖宇峰
 *
 */
public class GenerateLandline {
	/**
	 * 区号前缀
	 * 
	 * @return
	 */
	private static String prefix() {
		StringBuffer sb = new StringBuffer();
		sb.append(0);
		sb.append(new Random().nextInt(5 - 1 + 1) + 1);
		sb.append(new Random().nextInt(6));
		return sb.toString();
	}

	/**
	 * 号码7位
	 * @return
	 */
	private static String number() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 7; i++) {
			sb.append(new Random().nextInt(10));
		}
		return sb.toString();
	}
	
	/**
	 * 生成一个座机号
	 * @return
	 */
	public static String randomALandline() {
		return prefix()+"-"+number();
	}
	
	public static void main(String[] args) {
		System.out.println(randomALandline());
	}
}
