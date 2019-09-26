package com.qlshouyu.urms.sso.controller;

import com.qlshouyu.urms.common.web.BaseController;
import com.qlshouyu.urms.common.web.ResponseResult;
import com.qlshouyu.urms.model.vo.LoginUserVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author 高露 邮箱：<a href="egojit@qq.com">egojit@qq.com</a>
 * @since 2019-09-26 22:26
 */
@RestController("/api/oss/v1/sso")
public class SsoController extends BaseController {

    /**
     *
     * @return
     */
    @PostMapping("/login")
    public ResponseResult login(@RequestBody LoginUserVo loginUser){

        return null;
    }
}
