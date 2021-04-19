package com.fun.uncle.excel.dao;

import com.fun.uncle.excel.listener.ExcelListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: 数据保存
 * @Author: Summer
 * @DateTime: 2020/5/7 11:16 上午
 * @Version: 0.0.1-SNAPSHOT
 */
@Repository
public class DemoDAO<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelListener.class);

    public void save(List<T> list) {
        LOGGER.info("实际{}条数据，开始存储数据库！", list.size());
        LOGGER.info(String.valueOf(list));
        LOGGER.info("实际存储数据库成功！");
    }
}
