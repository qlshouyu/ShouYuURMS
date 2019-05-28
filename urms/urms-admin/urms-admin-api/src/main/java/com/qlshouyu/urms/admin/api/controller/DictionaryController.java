package com.qlshouyu.urms.admin.api.controller;

import com.qlshouyu.urms.common.BaseController;
import com.qlshouyu.urms.common.ResponseResult;
import com.qlshouyu.urms.common.database.Page;
import com.qlshouyu.urms.model.po.Dictionary;
import com.qlshouyu.urms.model.vo.DictionarySearchVo;
import com.qlshouyu.urms.service.DictionaryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

/**
 * @author 高露 微信：18956074544
 * @Description TODO
 * @date 19-5-28下午1:55
 */
@RestController
@RequestMapping("/api/admin/v1/dictionary")
@Api(description = "字典管理",tags = "字典管理")
public class DictionaryController extends BaseController {
    @Autowired
    private DictionaryService service;

    @GetMapping
    @ApiOperation(value = "分页获取字典列表")
    @ApiParam()
    public ResponseResult<Page> list(Page page, DictionarySearchVo search) {
        Example example=new Example(Dictionary.class);
        Example.Criteria criteria= example.createCriteria();
        if(!StringUtils.isEmpty(search.getName())){
            criteria.andLike("name",search.getName());
        }
        if(!StringUtils.isEmpty(search.getValue())){
            criteria.andEqualTo("value",search.getValue());
        }
        page= service.pageByExemple(page,example);
        return new ResponseResult(page);
    }
}
