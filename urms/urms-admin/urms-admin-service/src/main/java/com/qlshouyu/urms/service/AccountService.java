package com.qlshouyu.urms.service;

import com.qlshouyu.urms.common.db.BaseService;
import com.qlshouyu.urms.model.po.Account;
import com.qlshouyu.urms.repository.mapper.AccountMapper;
import org.springframework.stereotype.Service;

/**
 * 账户服务
 *
 * @author 高露 邮箱：<a href="egojit@qq.com">egojit@qq.com</a>
 * @since 2019-10-08 19:15
 */
@Service
public class AccountService extends BaseService<Account> {
    /**
     * 构造函数
     *
     * @param mapper
     */
    public AccountService(AccountMapper mapper) {
        super(mapper);
    }
}
