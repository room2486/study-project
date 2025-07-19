package com.study.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 分页查询通用参数
 */
@Data
@AllArgsConstructor
public class PageParams {
    //当前页码
    private Long pageNo = 1L;
    //记录数

    private Long pageSize = 10L;

    //
    public PageParams(){

    }
}
