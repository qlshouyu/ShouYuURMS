package com.qlshouyu.urms.service;

import com.qlshouyu.urms.common.db.BaseService;
import com.qlshouyu.urms.model.po.User;
import com.qlshouyu.urms.repository.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * 用户服务
 *
 * @author 高露 邮箱：<a href="egojit@qq.com">egojit@qq.com</a>
 * @since 2019-10-08 19:14
 */
@Service
public class UserServcie extends BaseService<User> {
    /**
     * 构造函数
     *
     * @param mapper
     */
    public UserServcie(UserMapper mapper) {
        super(mapper);
    }
}
