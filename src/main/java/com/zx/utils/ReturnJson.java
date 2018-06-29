package com.zx.utils;
/**
 * @author cd
 *
 */
public class ReturnJson {
    private boolean isSuccess;	//是否成功
    private String message;	//消息
    private Object data;	//数据

    public ReturnJson(boolean isSuccess, String message, Object data) {
        this.isSuccess = isSuccess;
        this.message = message;
        this.data = data;
    }

    public boolean getIsSuccess() {
        return isSuccess;
    }
    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
