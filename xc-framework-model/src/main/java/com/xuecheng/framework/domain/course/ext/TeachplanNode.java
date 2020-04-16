package com.xuecheng.framework.domain.course.ext;

import com.xuecheng.framework.domain.course.Teachplan;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class TeachplanNode extends Teachplan {

    List<TeachplanNode> children;

    //媒资文件id
    String mediaId;
    //媒资文件原始名称
    String mediaFileoriginalname;

    public void setChildren(List<TeachplanNode> children) {
        this.children = children;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public void setMediaFileoriginalname(String mediaFileoriginalname) {
        this.mediaFileoriginalname = mediaFileoriginalname;
    }

    public List<TeachplanNode> getChildren() {
        return children;
    }

    public String getMediaId() {
        return mediaId;
    }

    public String getMediaFileoriginalname() {
        return mediaFileoriginalname;
    }
}
