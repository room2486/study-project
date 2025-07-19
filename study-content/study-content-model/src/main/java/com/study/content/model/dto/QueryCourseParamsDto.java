package com.study.content.model.dto;

import lombok.Data;

/**
 * 课程查询参数Dto
 */
@Data
public class QueryCourseParamsDto {
    //课程名称
    private String courseName;
    //审核状态
    private String auditStatus;
    //发布状态
    private String publishStatus;
}
