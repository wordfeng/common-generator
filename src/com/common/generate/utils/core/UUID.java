package com.common.generate.utils.core;

public class UUID {
	
	public static String randomUUIDWithOutConcatChar() {
		return java.util.UUID.randomUUID().toString().replace("-", "");
	}
	
	public static void main(String[] args) {
		System.out.println(randomUUIDWithOutConcatChar());
	}
}
