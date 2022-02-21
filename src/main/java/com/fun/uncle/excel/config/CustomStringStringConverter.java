package com.fun.uncle.excel.config;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2020/5/8 1:57 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class CustomStringStringConverter implements Converter<String> {
    @Override
    public Class supportJavaTypeKey() {
        return String.class;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }
}