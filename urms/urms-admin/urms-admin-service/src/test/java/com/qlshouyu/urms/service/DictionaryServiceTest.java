package com.qlshouyu.urms.service;

import com.qlshouyu.urms.common.ResponseResult;
import com.qlshouyu.urms.common.database.Page;
import com.qlshouyu.urms.model.po.Dictionary;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

/**
 * @author 高露 微信：18956074544
 * @Description TODO
 * @date 19-5-28上午11:17
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestRunner.class)
public class DictionaryServiceTest {
    @Autowired
    private DictionaryService service;
    @org.junit.Test
    public void save() {
        Dictionary dictionary=new Dictionary();
        dictionary.setName("测试1");
        dictionary.setValue("test1");
        ResponseResult<Dictionary> dic = service.editSelective(dictionary);
        Assert.assertNotNull("",dic);
    }

}