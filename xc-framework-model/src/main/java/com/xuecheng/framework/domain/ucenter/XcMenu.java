package com.xuecheng.framework.domain.ucenter;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by admin on 2018/3/19.
 */
@Data
@ToString
@Entity
@Table(name="xc_menu")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class XcMenu {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    private String code;
    @Column(name="p_code")
    private String pCode;
    @Column(name="p_id")
    private String pId;
    @Column(name="menu_name")
    private String menuName;
    private String url;
    @Column(name="is_menu")
    private String isMenu;
    private Integer level;
    private Integer sort;
    private String status;
    private String icon;
    @Column(name="create_time")
    private Date createTime;
    @Column(name="update_time")
    private Date updateTime;

    public void setId(String id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setIsMenu(String isMenu) {
        this.isMenu = isMenu;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getpCode() {
        return pCode;
    }

    public String getpId() {
        return pId;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getUrl() {
        return url;
    }

    public String getIsMenu() {
        return isMenu;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getSort() {
        return sort;
    }

    public String getStatus() {
        return status;
    }

    public String getIcon() {
        return icon;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
}
