package com.xuecheng.framework.domain.cms;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Author: mrt.
 * @Description:
 * @Date:Created in 2018/1/24 10:04.
 * @Modified By:
 */
@Data
@ToString
@Document(collection = "cms_template")
public class CmsTemplate {

    //站点ID
    private String siteId;
    //模版ID
    @Id
    private String templateId;
    //模版名称
    private String templateName;
    //模版参数
    private String templateParameter;

    //模版文件Id
    private String templateFileId;

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public void setTemplateParameter(String templateParameter) {
        this.templateParameter = templateParameter;
    }

    public void setTemplateFileId(String templateFileId) {
        this.templateFileId = templateFileId;
    }

    public String getSiteId() {
        return siteId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public String getTemplateParameter() {
        return templateParameter;
    }

    public String getTemplateFileId() {
        return templateFileId;
    }
}
