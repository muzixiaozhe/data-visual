package com.data.weblog.mapper;

import com.data.weblog.pojo.TAvgpvNum;

import java.util.List;

public interface TAvgpvNumMapper {

    List<TAvgpvNum> selectLastSeven(String s, String s1);
}