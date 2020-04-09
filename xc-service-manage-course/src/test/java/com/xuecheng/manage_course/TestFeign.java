package com.xuecheng.manage_course;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.manage_course.client.CmsPageClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestFeign {
    @Autowired
    CmsPageClient cmsPageClient; //接口代理对象，由Feign生成代理对象

    @Test
    public void testRibbon(){
        //发起远程调用
        CmsPage cmsPage = cmsPageClient.findCmsPageById("5a795ac7dd573c04508f3a56");
        System.out.println(cmsPage);

    }


}
