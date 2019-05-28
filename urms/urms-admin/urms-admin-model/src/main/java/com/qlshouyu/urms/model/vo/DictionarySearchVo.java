package com.qlshouyu.urms.model.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.qlshouyu.urms.common.database.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 高露 微信：18956074544
 * @Description TODO
 * @date 19-5-28下午3:47
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
@ApiModel(value ="DictionarySearch")
public class DictionarySearchVo {

    @ApiModelProperty(value = "字典名称")
    private String name;
    @ApiModelProperty(value = "字典值")
    private String value;

    @ApiModelProperty(value = "分页信息")
    private Page page;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
