package com.xuecheng.manage_course.dao;

import com.github.pagehelper.Page;
import com.xuecheng.framework.domain.course.CourseBase;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseMapper {
    CourseBase findCourseBaseById(String id);
    Page<CourseBase> findCourseList();
}
