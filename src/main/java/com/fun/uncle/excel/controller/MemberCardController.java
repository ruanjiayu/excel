package com.fun.uncle.excel.controller;

import com.alibaba.excel.EasyExcel;
import com.fun.uncle.excel.dao.DemoDAO;
import com.fun.uncle.excel.dto.MemberCardDTO;
import com.fun.uncle.excel.listener.ExcelListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Description: 季卡话费优惠码控制层
 * @Author: Summer
 * @DateTime: 2021/4/19 10:49 上午
 * @Version: 0.0.1-SNAPSHOT
 */
@RestController
@RequestMapping(value = "member/card")
public class MemberCardController {


    @Autowired
    private DemoDAO demoDAO;


    @PostMapping("upload")
    public String upload(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), MemberCardDTO.class, new ExcelListener(demoDAO)).sheet().doRead();
        return "success";
    }

}
