package com.qlshouyu.urms.model.po;

import com.qlshouyu.urms.common.base.entity.PoEntity;

import javax.persistence.Table;

/**
 * 用户信息
 *
 * @author 高露 邮箱：<a href="egojit@qq.com">egojit@qq.com</a>
 * @since 2019-10-08 19:04
 */
@Table(name = "urms_user")
public class User extends PoEntity {

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 年龄
     */
    private String age;

    /**
     * 性别id
     */
    private String sexId;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSexId() {
        return sexId;
    }

    public void setSexId(String sexId) {
        this.sexId = sexId;
    }
}
