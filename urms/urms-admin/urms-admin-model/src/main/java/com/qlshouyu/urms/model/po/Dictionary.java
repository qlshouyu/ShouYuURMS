package com.qlshouyu.urms.model.po;

import com.qlshouyu.urms.common.database.Entity;

import javax.persistence.Table;

/**
 * @author 高露 微信：18956074544
 * @Description TODO
 * @date 2019-05-26 11:38
 */
@Table(name = "urms_dictionary")
public class Dictionary extends Entity {

    /**
     * 名称
     */
    private String name;
    /**
     * 字典值
     */
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
