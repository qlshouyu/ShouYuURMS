package com.qlshouyu.urms.model.vo;

import com.qlshouyu.urms.common.base.entity.VoEntity;

/**
 * TODO
 *
 * @author 高露 邮箱：<a href="egojit@qq.com">egojit@qq.com</a>
 * @since 2019-09-26 22:47
 */
public class LoginUserVo extends VoEntity {

    private String loginName;

    private String pwd;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
