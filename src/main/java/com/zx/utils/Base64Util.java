package com.zx.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

public class Base64Util {
    /** JDK实现Base64编码 */
    //编码
    public  static String jdkBase64encoder(String date ) {
        BASE64Encoder encoder = new BASE64Encoder();
        String encode = encoder.encode(date.getBytes());
        return  encode;
    }
    //解码
    public static  String jdkBase64decode(String date ) throws IOException{
        BASE64Decoder decoder = new BASE64Decoder();
        String decode = new String(decoder.decodeBuffer(date));
        return decode;
    }

}
