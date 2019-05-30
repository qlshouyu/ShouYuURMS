package com.qlshouyu.urms.common.database;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * @author 高露 微信：18956074544
 * @Description TODO
 * @date 19-5-28上午10:55
 */
public abstract class BaseService<T extends PoEntity> {
    @Autowired
    private Mapper<T> mapper;

    public boolean save(T model){
        model.perInster();
        int count= mapper.insert(model);
        if(count>0) {
            return true;
        }else {
            return false;
        }
    }

    /**
     * 分页获取列表
     * @param page
     * @param example
     * @return
     */
    public Page<T> pageByExemple(Page<T> page,Example example){
        if(StringUtils.isEmpty(example.getOrderByClause())){
            example.setOrderByClause("createTime desc");
        }
        PageHelper.startPage(page.getPageNum(),page.getPageSize());
        List<T> list= mapper.selectByExample(example);
        int count= mapper.selectCountByExample(example);
        page.setCount(count);
        page.setContent(list);
        return page;
    }

    /**
     * 分页获取列表
     * @param example
     * @return
     */
    public List<T> listByExemple(Example example){
        if(StringUtils.isEmpty(example.getOrderByClause())){
            example.setOrderByClause("createTime desc");
        }
        List<T> list= mapper.selectByExample(example);
        return list;
    }

    /**
     * 获取对象
     * @return
     */
    public T selectOne(T model){
        T result= mapper.selectOne(model);
        return result;
    }

}
