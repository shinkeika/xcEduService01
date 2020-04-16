package com.xuecheng.framework.domain.course;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@ToString
@Entity
@Table(name="teachplan_media_pub")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class TeachplanMediaPub implements Serializable {
    private static final long serialVersionUID = -916357110051689485L;
    @Id
    @GeneratedValue(generator = "jpa-assigned")
    @Column(name="teachplan_id")
    private String teachplanId;

    @Column(name="media_id")
    private String mediaId;

    @Column(name="media_fileoriginalname")
    private String mediaFileOriginalName;

    @Column(name="media_url")
    private String mediaUrl;

    @Column(name="courseid")
    private String courseId;

    @Column(name="timestamp")
    private Date timestamp;

    public void setTeachplanId(String teachplanId) {
        this.teachplanId = teachplanId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public void setMediaFileOriginalName(String mediaFileOriginalName) {
        this.mediaFileOriginalName = mediaFileOriginalName;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTeachplanId() {
        return teachplanId;
    }

    public String getMediaId() {
        return mediaId;
    }

    public String getMediaFileOriginalName() {
        return mediaFileOriginalName;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}
