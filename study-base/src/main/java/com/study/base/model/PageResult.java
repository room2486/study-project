package com.study.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
public class PageResult<T> implements Serializable {
    private List<T>  items;

    //记录数
    private Long counts;

    //当前页码
    private Long page;

    //每页记录数
    private Long pageSize;


}
