package com.xj.aoc.service;

import com.xj.aoc.entity.Person;
import com.xj.aoc.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersionService {
    @Autowired
    private PersonMapper personMapper;
    public Person findById(Integer id){
        return personMapper.selectByPrimaryKey(id);
    }
    public List<Person> getall(){
    return  personMapper.selectAllPerson();
    }
    public Integer countAll(){
        return personMapper.countAll();
    }
    public int insert(Person person){
        return personMapper.insert(person);
    }
    public int update(Person person){
        return personMapper.updateByPrimaryKey(person);
    }
    public int delete(Integer id){

        return personMapper.deleteByPrimaryKey(id);
    }
}
