package com.xj.aoc.service;

import com.xj.aoc.entity.AirLine;
import com.xj.aoc.mapper.AirLineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirLineService {
    @Autowired
private AirLineMapper airLineMapper;

    public AirLine findById(Integer id){
        return airLineMapper.selectByPrimaryKey(id);
    }
    public List<AirLine> getall(){
        return  airLineMapper.selectAllAirline();
    }
    public List<AirLine> getall0(){
        return  airLineMapper.selectAll0Airline();
    }
    public Integer countAll(){
        return airLineMapper.countAll();
    }
    public int insert(AirLine airLine){
        return airLineMapper.insert(airLine);
    }
    public int update(AirLine airLine){
        return airLineMapper.updateByPrimaryKey(airLine);
    }
    public int delete(Integer id){

        return airLineMapper.deleteByPrimaryKey(id);
    }
}
