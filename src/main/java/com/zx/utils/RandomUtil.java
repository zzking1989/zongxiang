package com.zx.utils;

import java.util.Random;

public class RandomUtil {
	/**
	 * 返回随机数
	 * @param range
	 * @param length 
	 * @return
	 */
	public static int getRandomValue(int range,int length){
		Random random = new  Random();
		int randomNum = random.nextInt(range)+length;
		return randomNum;
	}
    public static String getRandom(int length){
        String val = "";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            val += String.valueOf(random.nextInt(10));
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println( getRandom(4));
	}
}
