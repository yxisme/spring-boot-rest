package cn.yxisme.core.common;

import cn.yxisme.core.exception.CodeMessage;
import cn.yxisme.core.exception.CodeMessageDef;

/**
 * Created by yangxiong on 2019/3/2.
 */
public class ResultBean {
    private int code;
    private String message;
    private Object data;

    public ResultBean() {
        CodeMessage cm = CodeMessageDef.SUCCESS;
        this.code = cm.getCode();
        this.message = cm.getMsg();
    }

    public ResultBean(Object data) {
        CodeMessage cm = CodeMessageDef.SUCCESS;
        this.code = cm.getCode();
        this.message = cm.getMsg();
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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