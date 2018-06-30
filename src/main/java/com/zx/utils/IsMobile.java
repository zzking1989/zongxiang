package com.zx.utils;

/**
 * 判断请求是否来自移动端
 */

//在controller中获取http头信息如下：
//        String requestHeader = request.getHeader("user-agent");
//        if(JudgeRequestDeviceUtil.isMobileDevice(requestHeader)){
//        logger.info("使用手机浏览器");
//        }else{
//        logger.info("使用web浏览器");
//        }
public class IsMobile {
    public static boolean  isMobileDevice(String requestHeader){
        /**
         * android : 所有android设备
         * mac os : iphone ipad
         * windows phone:Nokia等windows系统的手机
         */
        String[] deviceArray = new String[]{"android","mac os","windows phone"};
        if(requestHeader == null)
            return false;
        requestHeader = requestHeader.toLowerCase();
        for(int i=0;i<deviceArray.length;i++){
            if(requestHeader.indexOf(deviceArray[i])>0){
                return true;
            }
        }
        return false;
    }
}
