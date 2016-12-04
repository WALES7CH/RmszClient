package com.rmsz.rmszclient.Beans;

/**
 * Created by witt on 16/12/3.
 */

public class ReTokenBean {

    /**
     * status : 200
     * message : 获取Token成功
     * data : 7cbdb1ec9675a4908d448a56de714541fee16cb6
     */

    private int status;
    private String message;
    private String data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
