package com.crb.model.mapper;

import com.crb.model.TPointup;

public interface TPointupMapper {
    int deleteByPrimaryKey(Integer pointupId);

    int insert(TPointup record);

    int insertSelective(TPointup record);

    TPointup selectByPrimaryKey(Integer pointupId);

    int updateByPrimaryKeySelective(TPointup record);

    int updateByPrimaryKey(TPointup record);
}