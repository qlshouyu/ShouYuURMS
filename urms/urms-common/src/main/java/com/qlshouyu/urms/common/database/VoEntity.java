package com.qlshouyu.urms.common.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

/**
 * @author 高露 微信：18956074544
 * @Description 界面对象必须继承
 * @date 19-5-28下午5:26
 */
public abstract class VoEntity {
    protected static Logger LOGGER= LoggerFactory.getLogger(VoEntity.class);


    public <T extends Entity> T poToVo(Class<T> tClass){
        try {
            T r = tClass.newInstance();
            BeanUtils.copyProperties(this, r);
            return r;
        }catch (Exception ex){
            LOGGER.error("界面对象转数据库对象出错",ex);
        }
        return null;
    }
}
