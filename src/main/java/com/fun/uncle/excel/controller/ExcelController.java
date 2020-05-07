package com.fun.uncle.excel.controller;

import com.alibaba.excel.EasyExcel;
import com.fun.uncle.excel.dao.DemoDAO;
import com.fun.uncle.excel.dto.DownloadExcelDTO;
import com.fun.uncle.excel.dto.PersonExcelDTO;
import com.fun.uncle.excel.listener.PersonExcelListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2020/5/7 1:53 下午
 * @Version: 0.0.1-SNAPSHOT
 */
@RestController
@RequestMapping(value = "/excel")
public class ExcelController {

    @Autowired
    private DemoDAO demoDAO;

    @PostMapping("upload")
    public String upload(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), PersonExcelDTO.class, new PersonExcelListener(demoDAO)).sheet().doRead();
        return "success";
    }

    @GetMapping("download")
    public void download(HttpServletResponse response) throws IOException {
        // 这里注意 有同学反应使用swagger 会导致各种问题，请直接用浏览器或者用postman
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        String fileName = URLEncoder.encode("测试", "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), DownloadExcelDTO.class).sheet("模板").doWrite(data());
    }


    private List<DownloadExcelDTO> data() {
        List<DownloadExcelDTO> list = new ArrayList<DownloadExcelDTO>();
        for (int i = 0; i < 10; i++) {
            DownloadExcelDTO data = new DownloadExcelDTO();
            data.setName("阮" + i);
            data.setTime(new Date());
            list.add(data);
        }
        return list;
    }


}
