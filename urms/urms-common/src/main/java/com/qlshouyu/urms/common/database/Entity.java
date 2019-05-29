package com.qlshouyu.urms.common.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.util.StringUtils;

import javax.persistence.Id;
import java.util.UUID;

/**
 * @author 高露 微信：18956074544
 * @Description TODO
 * @date 2019-05-26 11:44
 */
public abstract class Entity {
    protected static Logger LOGGER= LoggerFactory.getLogger(VoEntity.class);
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

    public <T extends VoEntity> T poToVo(Class<T> tClass){
        try {
            T vo = tClass.newInstance();
            BeanUtils.copyProperties(this, vo);
            return vo;
        }catch (Exception ex){
            LOGGER.error("数据库对象转界面对象出错",ex);
        }
        return null;
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
