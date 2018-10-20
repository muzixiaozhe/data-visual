package com.data.weblog.pojo;

import java.math.BigDecimal;
import java.util.List;

public class AvgToBean {
    private List<String > dates;
    private List<BigDecimal> data;

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }

    public List<BigDecimal> getData() {
        return data;
    }

    public void setData(List<BigDecimal> data) {
        this.data = data;
    }
}
