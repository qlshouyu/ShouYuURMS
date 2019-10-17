package com.qlshouyu.urms.common.base.entity;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * TODO
 *
 * @author 高露 邮箱：<a href="egojit@qq.com">egojit@qq.com</a>
 * @since 2019-10-17 22:27
 */
public abstract class Jsonable implements Serializable {

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
