package com.fun.uncle.excel.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import lombok.Data;


/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2020/5/8 10:16 上午
 * @Version: 0.0.1-SNAPSHOT
 */
@Data
public class IndexOrNameDataDTO {

    @ExcelProperty(index = 0)
    private String title;

    @ExcelProperty(value = "名字")
    private String name;

    @ExcelProperty(value = "年龄")
    private Integer number;

    @ExcelProperty(index = 3)
    private Integer grade;

    @ExcelProperty(index = 4)
    @DateTimeFormat("yyyyMM-dd HH时mm分ss秒")
    private String date;

}
