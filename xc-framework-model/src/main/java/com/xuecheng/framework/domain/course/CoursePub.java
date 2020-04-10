package com.xuecheng.framework.domain.course;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by admin on 2018/2/10.
 */
@Data
@ToString
@Entity
@Table(name="course_pub")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class CoursePub implements Serializable {
    private static final long serialVersionUID = -916357110051689487L;
    @Id
    @GeneratedValue(generator = "jpa-assigned")
    @Column(length = 32)
    private String id;
    private String name;
    private String users;
    private String mt;
    private String st;
    private String grade;
    private String studymodel;
    private String teachmode;
    private String description;
    private String pic;//图片
    private Date timestamp;//时间戳
    private String charge;
    private String valid;
    private String qq;
    private Float price;
    private Float price_old;
    private String expires;
    private String teachplan;//课程计划
    @Column(name="pub_time")
    private String pubTime;//课程发布时间

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public void setMt(String mt) {
        this.mt = mt;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setStudymodel(String studymodel) {
        this.studymodel = studymodel;
    }

    public void setTeachmode(String teachmode) {
        this.teachmode = teachmode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setPrice_old(Float price_old) {
        this.price_old = price_old;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public void setTeachplan(String teachplan) {
        this.teachplan = teachplan;
    }

    public void setPubTime(String pubTime) {
        this.pubTime = pubTime;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsers() {
        return users;
    }

    public String getMt() {
        return mt;
    }

    public String getSt() {
        return st;
    }

    public String getGrade() {
        return grade;
    }

    public String getStudymodel() {
        return studymodel;
    }

    public String getTeachmode() {
        return teachmode;
    }

    public String getDescription() {
        return description;
    }

    public String getPic() {
        return pic;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getCharge() {
        return charge;
    }

    public String getValid() {
        return valid;
    }

    public String getQq() {
        return qq;
    }

    public Float getPrice() {
        return price;
    }

    public Float getPrice_old() {
        return price_old;
    }

    public String getExpires() {
        return expires;
    }

    public String getTeachplan() {
        return teachplan;
    }

    public String getPubTime() {
        return pubTime;
    }
}
