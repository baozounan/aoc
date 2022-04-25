package com.xj.aoc.entity;



import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;


import java.io.Serializable;
import java.util.Date;
@Data
public class AirLine implements Serializable {
    private Integer id;
@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date riqi;

    private Integer st1;

    private Integer st2;

    private Integer st3;

    private String st4;

    private Integer st5;

    private Integer st6;
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Date getRiqi() {
        return riqi;
    }

    public void setRiqi(Date riqi) {
        this.riqi = riqi;
    }

    public Integer getSt1() {
        return st1;
    }

    public void setSt1(Integer st1) {
        this.st1 = st1;
    }

    public Integer getSt2() {
        return st2;
    }

    public void setSt2(Integer st2) {
        this.st2 = st2;
    }

    public Integer getSt3() {
        return st3;
    }

    public void setSt3(Integer st3) {
        this.st3 = st3;
    }

    public String getSt4() {
        return st4;
    }

    public void setSt4(String st4) {
        this.st4 = st4 == null ? null : st4.trim();
    }

    public Integer getSt5() {
        return st5;
    }

    public void setSt5(Integer st5) {
        this.st5 = st5;
    }

    public Integer getSt6() {
        return st6;
    }

    public void setSt6(Integer st6) {
        this.st6 = st6;
    }

    public AirLine(Integer id, Date riqi, Integer st1, Integer st2, Integer st3, String st4, Integer st5, Integer st6, int status) {
        this.id = id;
        this.riqi = riqi;
        this.st1 = st1;
        this.st2 = st2;
        this.st3 = st3;
        this.st4 = st4;
        this.st5 = st5;
        this.st6 = st6;
        this.status = status;
    }

    public AirLine() {
    }
}