package com.fun.uncle.excel.dao;

import com.fun.uncle.excel.dto.PersonExcelDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2020/5/7 11:16 上午
 * @Version: 0.0.1-SNAPSHOT
 */
@Repository
public class DemoDAO {
    public void save(List<PersonExcelDTO> list) {
        // 如果是mybatis,尽量别直接调用多次insert,自己写一个mapper里面新增一个方法batchInsert,所有数据一次性插入
    }
}
