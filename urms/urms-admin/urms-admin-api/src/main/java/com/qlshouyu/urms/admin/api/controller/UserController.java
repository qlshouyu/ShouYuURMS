package com.qlshouyu.urms.admin.api.controller;

import com.qlshouyu.urms.common.web.BaseController;
import com.qlshouyu.urms.service.UserServcie;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户管理
 *
 * @author 高露 邮箱：<a href="egojit@qq.com">egojit@qq.com</a>
 * @since 2019-10-08 18:58
 */
@RestController
@RequestMapping("/api/admin/v1/user")
@Api(value = "用户管理",tags = "用户管理")
public class UserController extends BaseController {

    @Autowired
    private UserServcie service;

    /**
     * 根据条件查询所有字典
     * @param search 查询条件 {@code DictionarySearchVo}
     * @return 返回字典列表 {@code List<Dictionary>}
     */
//    @GetMapping
//    @ApiOperation(value = "字典-列表")
//    public ResponseResult<List<Dictionary>> list(@ApiParam(value = "查询参数") DictionarySearchVo search) {
//        return service.list(search);
//    }
//
//
//    @PostMapping
//    @ApiOperation(value = "字典-编辑[添加/修改]")
//    public ResponseResult<Dictionary> edit(@ApiParam(value = "字典对象",required = true) DictionaryVo model) {
//        return service.edit(model);
//    }
//
//    /**
//     * 根据多个id删除字典
//     *
//     * @param ids 多个id逗号隔开{@code String}
//     * @return 实体对象
//     */
//    @DeleteMapping("/{ids}")
//    @ApiOperation(value = "字典-删除")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name="ids", value="逗号隔开的多个字典id", required=true, paramType="path", dataType="String")
//    })
//    public ResponseResult<String> delete(@PathVariable(value = "ids",required = true) String ids) {
//        service.delete(ids);
//        return new ResponseResult("成功");
//    }
}
