package com.xuecheng.framework.domain.course;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Data
@ToString
@Entity
@Table(name="teachplan")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Teachplan implements Serializable {
    private static final long serialVersionUID = -916357110051689485L;
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String id;
    private String pname;
    private String parentid;
    private String grade;
    private String ptype;
    private String description;
    private String courseid;
    private String status;
    private Integer orderby;
    private Double timelength;
    private String trylearn;


    public void setId(String id) {
        this.id = id;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrderby(Integer orderby) {
        this.orderby = orderby;
    }

    public void setTimelength(Double timelength) {
        this.timelength = timelength;
    }

    public void setTrylearn(String trylearn) {
        this.trylearn = trylearn;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public String getPname() {
        return pname;
    }

    public String getParentid() {
        return parentid;
    }

    public String getGrade() {
        return grade;
    }

    public String getPtype() {
        return ptype;
    }

    public String getDescription() {
        return description;
    }

    public String getCourseid() {
        return courseid;
    }

    public String getStatus() {
        return status;
    }

    public Integer getOrderby() {
        return orderby;
    }

    public Double getTimelength() {
        return timelength;
    }

    public String getTrylearn() {
        return trylearn;
    }
}
