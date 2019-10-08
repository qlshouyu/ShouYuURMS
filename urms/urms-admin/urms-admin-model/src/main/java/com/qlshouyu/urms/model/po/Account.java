package com.qlshouyu.urms.model.po;

import com.qlshouyu.urms.common.base.entity.PoEntity;

import javax.persistence.Table;

/**
 * 账户信息
 *
 * @author 高露 邮箱：<a href="egojit@qq.com">egojit@qq.com</a>
 * @since 2019-10-08 19:05
 */
@Table(name = "urms_account")
public class Account extends PoEntity {

    private String id;
    private String loginName;
    private String password;
    private String remark;
    private String avatar;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }



    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
