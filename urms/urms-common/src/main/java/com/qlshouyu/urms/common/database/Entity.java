package com.qlshouyu.urms.common.database;

import org.springframework.util.StringUtils;

import javax.persistence.Id;
import java.util.UUID;

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
        if(StringUtils.isEmpty(id)){
            id= UUID.randomUUID().toString();
        }
        if(createTime==null){
            createTime=System.currentTimeMillis();
            updateTime=System.currentTimeMillis();
        }
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
