package com.xj.aoc.mapper;

import com.xj.aoc.entity.AirLine;
import com.xj.aoc.entity.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AirLineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AirLine record);

    int insertSelective(AirLine record);

    AirLine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AirLine record);

    int updateByPrimaryKey(AirLine record);
    Integer countAll();
    List<AirLine> selectAllAirline();
    List<AirLine> selectAll0Airline();
}