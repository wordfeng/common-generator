package com.common.generate.utils.commongenerater;

import com.common.generate.utils.core.GenerateAge;
import com.common.generate.utils.core.GenerateLandline;
import com.common.generate.utils.core.GenerateName;
import com.common.generate.utils.core.GeneratePhoneNumber;
import com.common.generate.utils.core.UUID;

public class Generater {
	
	/**
	 * 生成一个中国名字
	 * @return
	 */
	public static String generateName() {
		return GenerateName.fullName();
	}
	
	/**
	 * 生成一个没有-连接的uuid
	 * @return
	 */
	public static String generateUUID() {
		return UUID.randomUUIDWithOutConcatChar();
	}

	/**
	 * 生成一个11位中国手机号
	 * @return
	 */
	public static String generateTelNumber() {
		return GeneratePhoneNumber.generatePhoneNumber();
	}
	
	/**
	 * 生成年龄 0 - 150
	 * @return
	 */
	public static int generateAge() {
		return GenerateAge.randomAge();
	}
	
	/**
	 * 生成座机号 三位前缀+7位号码
	 * @return
	 */
	public static String genetrateLandline() {
		return GenerateLandline.randomALandline();
	}
}
