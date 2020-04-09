package com.xuecheng.framework.domain.cms;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @Author: mrt.
 * @Description:
 * @Date:Created in 2018/1/24 9:46.
 * @Modified By:
 */
@Data
@ToString
@Document(collection = "cms_site")
public class CmsSite {

    //站点ID
    @Id
    private String siteId;
    //站点名称
    private String siteName;
    //站点名称
    private String siteDomain;
    //站点端口
    private String sitePort;
    //站点访问地址
    private String siteWebPath;
    //创建时间
    private Date siteCreateTime;
    // 站点的物理路径
    private String sitePhysicalPath;

    public String getSitePhysicalPath() {
        return sitePhysicalPath;
    }

    public void setSitePhysicalPath(String sitePhysicalPath) {
        this.sitePhysicalPath = sitePhysicalPath;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public void setSiteDomain(String siteDomain) {
        this.siteDomain = siteDomain;
    }

    public void setSitePort(String sitePort) {
        this.sitePort = sitePort;
    }

    public void setSiteWebPath(String siteWebPath) {
        this.siteWebPath = siteWebPath;
    }

    public void setSiteCreateTime(Date siteCreateTime) {
        this.siteCreateTime = siteCreateTime;
    }

    public String getSiteId() {
        return siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public String getSiteDomain() {
        return siteDomain;
    }

    public String getSitePort() {
        return sitePort;
    }

    public String getSiteWebPath() {
        return siteWebPath;
    }

    public Date getSiteCreateTime() {
        return siteCreateTime;
    }
}
