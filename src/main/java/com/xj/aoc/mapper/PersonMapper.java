package com.xj.aoc.mapper;

import com.xj.aoc.entity.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PersonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
    Integer countAll();
    List<Person> selectAllPerson();

}