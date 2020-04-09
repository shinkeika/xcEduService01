package com.xuecheng.framework.domain.course;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by admin on 2018/2/10.
 */
@Data
@ToString
@Entity
@Table(name="course_base")
//@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class CourseBase implements Serializable {
    private static final long serialVersionUID = -916357110051689486L;
    @Id
    @GeneratedValue(generator = "jpa-uuid")
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
    private String status;
    @Column(name="company_id")
    private String companyId;
    @Column(name="user_id")
    private String userId;

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

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getStatus() {
        return status;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getUserId() {
        return userId;
    }
}
