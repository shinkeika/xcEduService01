package com.xuecheng.framework.domain.course.ext;

import com.xuecheng.framework.domain.course.CourseBase;
import com.xuecheng.framework.domain.course.CourseMarket;
import com.xuecheng.framework.domain.course.CoursePic;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class CourseView implements java.io.Serializable {
    private CourseBase courseBase;
    private CoursePic coursePic;
    private CourseMarket courseMarket;
    private TeachplanNode teachplanNode;

    public TeachplanNode getTeachplanNode() {
        return teachplanNode;
    }

    public void setTeachplanNode(TeachplanNode teachplanNode) {
        this.teachplanNode = teachplanNode;
    }

    public void setCourseBase(CourseBase courseBase) {
        this.courseBase = courseBase;
    }

    public void setCoursePic(CoursePic coursePic) {
        this.coursePic = coursePic;
    }

    public void setCourseMarket(CourseMarket courseMarket) {
        this.courseMarket = courseMarket;
    }

    public CourseBase getCourseBase() {
        return courseBase;
    }

    public CoursePic getCoursePic() {
        return coursePic;
    }

    public CourseMarket getCourseMarket() {
        return courseMarket;
    }

}
