package com.qlshouyu.urms.model.po;

import com.qlshouyu.urms.common.base.entity.PoEntity;

/**
 * TODO
 *
 * @author 高露 邮箱：<a href="egojit@qq.com">egojit@qq.com</a>
 * @since 2019-10-08 19:49
 */
public class Menu extends PoEntity {
    private String id;
    private String title;
    private long sort;
    private String url;
    private String remark;
    private String icon;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public long getSort() {
        return sort;
    }

    public void setSort(long sort) {
        this.sort = sort;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
