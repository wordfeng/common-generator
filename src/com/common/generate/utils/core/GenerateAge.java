package com.common.generate.utils.core;

import java.util.Random;

/**
 * 
 * @author 肖宇峰
 *
 */
public class GenerateAge {
	
	/**
	 * 最大年龄
	 */
	public static int MAX_AGE = 150;
	/**
	 * 最小年龄
	 */
	public static int MIN_AGE = 0;
	
	/**
	 * 默认0-150
	 * @return
	 */
	public static int randomAge() {
		return new Random().nextInt(GenerateAge.MAX_AGE - GenerateAge.MIN_AGE + 1) + GenerateAge.MIN_AGE;
	}
	
	/**
	 * 每个年龄范围
	 * @param min
	 * @param max
	 */
	public static void range(int min, int max) {
		GenerateAge.MAX_AGE = max;
		GenerateAge.MIN_AGE = min;
	}
}
