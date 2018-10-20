package com.data.weblog.service.impl;

import com.data.weblog.mapper.TAvgpvNumMapper;
import com.data.weblog.pojo.AvgToBean;
import com.data.weblog.pojo.TAvgpvNum;
import com.data.weblog.service.AvgPvService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AvgPvServiceImpl implements AvgPvService {
    @Autowired
    private TAvgpvNumMapper tAvgpvNumMapper;

    @Override
    public String getAvgJson() {
        //查询最近七天的所有数据，指定起始日期和结束日期
        List<TAvgpvNum> tAvgpvNums = tAvgpvNumMapper.selectLastSeven("20130919","20130925");
        AvgToBean avgToBean = new AvgToBean();
       List<String> dateStrs = new ArrayList<String>();
       List<BigDecimal> datas = new ArrayList<BigDecimal>();

        for (TAvgpvNum tAvgpvNum : tAvgpvNums) {
            dateStrs.add(tAvgpvNum.getDatestr());
            datas.add(tAvgpvNum.getAvgpvnum());
        }
        avgToBean.setDates(dateStrs);
        avgToBean.setData(datas);
        String jsonString = JSONObject.toJSONString(avgToBean);
        return jsonString;
    }
}
