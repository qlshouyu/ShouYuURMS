package com.qlshouyu.urms.common.web;

import com.qlshouyu.urms.common.base.entity.Jsonable;
import com.qlshouyu.urms.common.web.exception.RESPONSE_STATUS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 高露 微信：18956074544
 * @Description 　接口结果
 * @date 19-5-28下午12:48
 */
public class ResponseResult<T> extends Jsonable {
    private static Logger LOGGER= LoggerFactory.getLogger(ResponseResult.class);
    private T data;

    private RESPONSE_STATUS status;

    private Integer code;

    private String message;

    public ResponseResult(T data,RESPONSE_STATUS status,String message) {
        this.data=data;
        this.status=status;
        this.code=status.getValue();
        this.message=message;
    }

    public ResponseResult(T data) {
        this(data,RESPONSE_STATUS.SUCCESS,"");
        LOGGER.debug("response result:{}",this);
    }

    public ResponseResult(Integer code,String message) {
        this((T) RESPONSE_STATUS.ERROR.getName(),RESPONSE_STATUS.ERROR,message);
        LOGGER.debug("response result:{}",this);
    }

    public ResponseResult(Throwable throwable) {
        this((T) RESPONSE_STATUS.ERROR.getName(),RESPONSE_STATUS.ERROR,throwable.getMessage());
        LOGGER.debug("response result:{}",this);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
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

}


