package com.xuecheng.framework.domain.cms;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Author: mrt.
 * @Description:
 * @Date:Created in 2018/1/24 10:00.
 * @Modified By:
 */
@Data
@ToString
@Document(collection = "cms_site_server")
public class CmsSiteServer {
    /**
     * 站点id、服务器IP、端口、访问地址、服务器类型（代理、静态、动态、CDN）、资源发布地址（完整的HTTP接口）、使用类型（测试、生产）
     */
    //站点id
    private String siteId;
    //服务器ID
    @Id
    private String serverId;
    //服务器IP
    private String ip;
    //端口
    private String port;
    //访问地址
    private String webPath;
    //服务器名称（代理、静态、动态、CDN）
    private String serverName;
    //资源发布地址（完整的HTTP接口）
    private String uploadPath;
    //使用类型（测试、生产）
    private String useType;

    public String getSiteId() {
        return siteId;
    }

    public String getServerId() {
        return serverId;
    }

    public String getIp() {
        return ip;
    }

    public String getPort() {
        return port;
    }

    public String getWebPath() {
        return webPath;
    }

    public String getServerName() {
        return serverName;
    }

    public String getUploadPath() {
        return uploadPath;
    }

    public String getUseType() {
        return useType;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setWebPath(String webPath) {
        this.webPath = webPath;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }
}
