package com.fun.uncle.excel.dto;

import lombok.Data;

import java.util.Date;

/**
 * @Description: 下载excel 的相关格式
 * @Author: Summer
 * @DateTime: 2020/5/7 2:56 下午
 * @Version: 0.0.1-SNAPSHOT
 */
@Data
public class DownloadExcelDTO {

    /**
     * 用户名
     */
    private String name;

    /**
     * 时间
     */
    private Date time;
}
