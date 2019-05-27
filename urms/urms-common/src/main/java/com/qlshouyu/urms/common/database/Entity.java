package com.qlshouyu.urms.common.database;

import javax.persistence.Id;

/**
 * @author 高露 微信：18956074544
 * @Description TODO
 * @date 2019-05-26 11:44
 */
public abstract class Entity {

    @Id
    private String id;


    private Long createTime;

    private Long updateTime;

    public void perInster(){

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
