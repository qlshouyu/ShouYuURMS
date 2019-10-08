package com.qlshouyu.urms.model.po;

import com.qlshouyu.urms.common.base.entity.PoEntity;

import javax.persistence.Table;

/**
 * @author 高露 微信：18956074544
 * @Description TODO
 * @date 2019-05-26 11:38
 */
@Table(name = "urms_dictionary")
public class Dictionary extends PoEntity {
    private String id;
    private String value;
    private String name;
    private String parentId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
