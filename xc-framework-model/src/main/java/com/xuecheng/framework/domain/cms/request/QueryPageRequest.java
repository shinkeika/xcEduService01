package com.xuecheng.framework.domain.cms.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class QueryPageRequest {
    //接收页面查询的查询条件
    //站点id
    //站点id
    @ApiModelProperty("站点id")
    private String siteId;
    //页面ID
    @ApiModelProperty("页面ID")
    private String pageId;
    //页面名称
    @ApiModelProperty("页面名称")
    private String pageName;
    //别名
    @ApiModelProperty("别名")
    private String pageAliase;
    //模版id
    @ApiModelProperty("模版id")
    private String templateId;
    //....

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

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

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

    public String getTemplateId() {
        return templateId;
    }
}
