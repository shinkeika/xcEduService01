package com.xuecheng.test.freemarker;

import com.xuecheng.test.freemarker.model.Student;
import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FreemarkerTest {

    // 静态化，基于ftl生成html文件
    @Test
    public void testGenerateHtml() throws IOException, TemplateException {
        // 定义配置类
        Configuration configuration = new Configuration(Configuration.getVersion());
        // 定义模版
        // 得到classpath的路径
        String classpath = this.getClass().getResource("/").getPath();
        configuration.setDirectoryForTemplateLoading(new File(classpath + "/templates/"));
        Template template = configuration.getTemplate("test1.ftl");
        // 定义数据模型
        Map map = getMap();
        // 静态化
        String s = FreeMarkerTemplateUtils.processTemplateIntoString(template, map);
        System.out.println(s);
        InputStream inputStream = IOUtils.toInputStream(s);
        FileOutputStream fileOutputStream = new FileOutputStream(new File("/Users/shinkeika/learning/javapro/xcEduService01/test/test1.html"));
        IOUtils.copy(inputStream, fileOutputStream);
    }


    @Test
    public void testGenerateHtmlByString() throws IOException, TemplateException {
        // 定义配置类
        Configuration configuration = new Configuration(Configuration.getVersion());
        // 定义模版
        String templateString = "" +
                "<html>\n" +
                "    <head></head>\n" +
                "    <body>\n" +
                "    名称：${name}\n" +
                "    </body>\n" +
                "</html>";
        // 模版加载器
        StringTemplateLoader stringTemplateLoader = new StringTemplateLoader();
        stringTemplateLoader.putTemplate("template", templateString);
        configuration.setTemplateLoader(stringTemplateLoader);
        // 在配置中设置模版加载起
        Template template = configuration.getTemplate("template", "utf-8");
        // 定义数据模型
        Map map = getMap();
        // 静态化
        String s = FreeMarkerTemplateUtils.processTemplateIntoString(template, map);
        InputStream inputStream = IOUtils.toInputStream(s);
        FileOutputStream fileOutputStream = new FileOutputStream(new File("/Users/shinkeika/learning/javapro/xcEduService01/test/test2.html"));
        IOUtils.copy(inputStream, fileOutputStream);
    }


    //数据模型
    public Map getMap() {
        Map<String, Object> map = new HashMap<>();
        //向数据模型放数据
        map.put("name", "黑马程序员");
        Student stu1 = new Student();
        stu1.setName("小明");
        stu1.setAge(18);
        stu1.setMondy(1000.86f);
        stu1.setBirthday(new Date());
        Student stu2 = new Student();
        stu2.setName("小红");
        stu2.setMondy(200.1f);
        stu2.setAge(19);
//        stu2.setBirthday(new Date());
        List<Student> friends = new ArrayList<>();
        friends.add(stu1);
        stu2.setFriends(friends);
        stu2.setBestFriend(stu1);
        List<Student> stus = new ArrayList<>();
        stus.add(stu1);
        stus.add(stu2);
        //向数据模型放数据
        map.put("stus", stus);
        //准备map数据
        HashMap<String, Student> stuMap = new HashMap<>();
        stuMap.put("stu1", stu1);
        stuMap.put("stu2", stu2);
        //向数据模型放数据
        map.put("stu1", stu1);
        //向数据模型放数据
        map.put("stuMap", stuMap);
        return map;
    }
}
