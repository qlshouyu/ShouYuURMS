package com.qlshouyu.urms.admin.api;
import com.qlshouyu.urms.common.web.ResponseResult;
import com.qlshouyu.urms.model.po.Dictionary;
import com.qlshouyu.urms.model.vo.DictionaryVo;
import com.qlshouyu.urms.service.DictionaryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UrmsAdminApiApplication.class)
public class UrmsAdminApiApplicationTests {

    @Autowired
    private DictionaryService service;

    @Test
    public void contextLoads() {
    }
    @Test
    public void save(){
        DictionaryVo dictionary=new DictionaryVo();
        dictionary.setName("测试");
        dictionary.setValue("test");
        Dictionary dist = service.edit(dictionary);
        Assert.assertNotNull(dist);
    }

}
