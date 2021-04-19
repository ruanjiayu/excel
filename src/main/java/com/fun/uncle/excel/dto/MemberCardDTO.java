package com.fun.uncle.excel.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.fun.uncle.excel.config.LocalDateTimeConverter;

import java.time.LocalDateTime;

/**
 * @Description: 会员季卡
 * @Author: Summer
 * @DateTime: 2021/4/19 10:50 上午
 * @Version: 0.0.1-SNAPSHOT
 */
public class MemberCardDTO {

    /**
     * 标题
     */
    private String title;

    /**
     * 券码
     */
    private String couponNo;

    /**
     * 开始时间
     */
    @ExcelProperty(converter = LocalDateTimeConverter.class)
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    @ExcelProperty(converter = LocalDateTimeConverter.class)
    private LocalDateTime endTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 经销商编号
     */
    private String saleNo;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCouponNo() {
        return couponNo;
    }

    public void setCouponNo(String couponNo) {
        this.couponNo = couponNo;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(String saleNo) {
        this.saleNo = saleNo;
    }
}
