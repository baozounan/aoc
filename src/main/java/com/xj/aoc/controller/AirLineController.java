package com.xj.aoc.controller;

import com.xj.aoc.entity.AirLine;
import com.xj.aoc.entity.Person;
import com.xj.aoc.service.AirLineService;
import com.xj.aoc.service.PersionService;
import com.xj.aoc.util.ResponseUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/airLinePre")
public class AirLineController {
    @Autowired
    private AirLineService airLineService;
    @RequestMapping(value = "/{id}")
    public AirLine getByid(@PathVariable Integer id){
        return airLineService.findById(id);
    }

    @RequestMapping(value = "/all")
    public String getallAirline(Model model){
        List<AirLine> airLineList = airLineService.getall();
        JsonConfig jsonConfig=new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class,new DateJsonValueProcessor("yyyy-MM-dd"));
        JSONArray jsonArray=JSONArray.fromObject(airLineList,jsonConfig);
        model.addAttribute("airLineList",jsonArray);
        return "airLinePre";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveAirLine(AirLine airLine, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        int  totalResult = 0;
        if (airLine.getId()==null){
            totalResult = airLineService.insert(airLine);
        }else{
            totalResult = airLineService.update(airLine);
        }
        JSONObject result=new JSONObject();
        if(totalResult>0){
            result.put("success",true);
        }else{
            result.put("success",false);
        }
        model.addAttribute("result",result);
        ResponseUtil.write(response,result);
        return "airLinePre";
    }
    @RequestMapping(value = "/delete")
    public String delete(@RequestParam("ids") String ids, HttpServletResponse response)throws Exception{
        String[] idsStr=ids.split(",");
        for (int i = 0; i < idsStr.length; i++) {
            airLineService.delete(Integer.parseInt(idsStr[i]));
        }
        JSONObject result=new JSONObject();
        result.put("success",true);
        ResponseUtil.write(response,result);
        return "airLinePre";
    }
    @RequestMapping(value = "/all0")
    public String getall0Airline(Model model){
        List<AirLine> airLineList = airLineService.getall0();
        JsonConfig jsonConfig=new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class,new DateJsonValueProcessor("yyyy-MM-dd"));
        JSONArray jsonArray=JSONArray.fromObject(airLineList,jsonConfig);
        model.addAttribute("airLineList",jsonArray);
        return "personPre";
    }

}
