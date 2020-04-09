package com.xuecheng.framework.domain.cms;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@ToString
@Document(collection = "cms_page")
public class CmsPage {
    /**
     * 页面名称、别名、访问地址、类型（静态/动态）、页面模版、状态
     */
    //站点ID
    private String siteId;
    //页面ID
    @Id
    private String pageId; 
    //页面名称
    private String pageName;
    //别名
    private String pageAliase;
    //访问地址
    private String pageWebPath;
    //参数
    private String pageParameter;
    //物理路径
    private String pagePhysicalPath;
    //类型（静态/动态）
    private String pageType;
    //页面模版
    private String pageTemplate;
    //页面静态化内容
    private String pageHtml;
    //状态
    private String pageStatus;
    //创建时间
    private Date pageCreateTime;
    //模版id
    private String templateId;
    //参数列表
    private List<CmsPageParam> pageParams;
    //模版文件Id
//    private String templateFileId;
    //静态文件Id
    private String htmlFileId;
    //数据Url
    private String dataUrl;

    public String getSiteId() {
        return siteId;
    }

    public String getPageId() {
        return pageId;
    }

    public String getPageName() {
        return pageName;
    }

    public String getPageAliase() {
        return pageAliase;
    }

    public String getPageWebPath() {
        return pageWebPath;
    }

    public String getPageParameter() {
        return pageParameter;
    }

    public String getPagePhysicalPath() {
        return pagePhysicalPath;
    }

    public String getPageType() {
        return pageType;
    }

    public String getPageTemplate() {
        return pageTemplate;
    }

    public String getPageHtml() {
        return pageHtml;
    }

    public String getPageStatus() {
        return pageStatus;
    }

    public Date getPageCreateTime() {
        return pageCreateTime;
    }

    public String getTemplateId() {
        return templateId;
    }

    public List<CmsPageParam> getPageParams() {
        return pageParams;
    }

    public String getHtmlFileId() {
        return htmlFileId;
    }

    public String getDataUrl() {
        return dataUrl;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public void setPageAliase(String pageAliase) {
        this.pageAliase = pageAliase;
    }

    public void setPageWebPath(String pageWebPath) {
        this.pageWebPath = pageWebPath;
    }

    public void setPageParameter(String pageParameter) {
        this.pageParameter = pageParameter;
    }

    public void setPagePhysicalPath(String pagePhysicalPath) {
        this.pagePhysicalPath = pagePhysicalPath;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    public void setPageTemplate(String pageTemplate) {
        this.pageTemplate = pageTemplate;
    }

    public void setPageHtml(String pageHtml) {
        this.pageHtml = pageHtml;
    }

    public void setPageStatus(String pageStatus) {
        this.pageStatus = pageStatus;
    }

    public void setPageCreateTime(Date pageCreateTime) {
        this.pageCreateTime = pageCreateTime;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public void setPageParams(List<CmsPageParam> pageParams) {
        this.pageParams = pageParams;
    }

    public void setHtmlFileId(String htmlFileId) {
        this.htmlFileId = htmlFileId;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }
}
