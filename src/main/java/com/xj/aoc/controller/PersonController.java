package com.xj.aoc.controller;

import com.xj.aoc.entity.Person;
import com.xj.aoc.service.AirLineService;
import com.xj.aoc.service.PersionService;
import com.xj.aoc.util.ResponseUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersionService persionService;
    @Autowired
    AirLineService airLineService;
    @RequestMapping(value = "/{id}")
    public Person getByid(@PathVariable Integer id){
        return persionService.findById(id);
    }

    @RequestMapping(value = "/all")
    public String getallPerson(Model model){
    List<Person> personList = persionService.getall();
    model.addAttribute("personList",personList);
        return "personManage";
    }
    @RequestMapping("/save")
    public String savePerson(Person person, Model model,HttpServletRequest request,HttpServletResponse response) throws Exception {
        int  totalResult = 0;
        if (person.getId()==null){
            totalResult = persionService.insert(person);
        }else{
            totalResult = persionService.update(person);
        }
        JSONObject result=new JSONObject();
        if(totalResult>0){
            result.put("success",true);
        }else{
            result.put("success",false);
        }
        model.addAttribute("result",result);
        ResponseUtil.write(response,result);
        return "personManage";
    }

    @RequestMapping(value = "/delete")
    public String delete(@RequestParam("ids") String ids, HttpServletResponse response)throws Exception{
        String[] idsStr=ids.split(",");
        for (int i = 0; i < idsStr.length; i++) {
            persionService.delete(Integer.parseInt(idsStr[i]));
        }
        JSONObject result=new JSONObject();
        result.put("success",true);
        ResponseUtil.write(response,result);
        return "personManage";
    }
    @RequestMapping(value = "/pre")
    public String personPre(){
        return "personPre";
    }

    @RequestMapping(value = "/schedule")
    public String personSchedule(){
        return "personSchedule";
    }
@RequestMapping("/preCount")
    public  String personSchedulePre(){

        return "personSchedule";
}

}
