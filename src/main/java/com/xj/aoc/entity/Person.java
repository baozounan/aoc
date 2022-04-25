package com.xj.aoc.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class Person implements Serializable {
    private Integer id;

    private String jobNumber;

    private String name;

    private String edu;

    private String major;

    private String sex;

    private String english;

    private String qua;

    private String ability;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber == null ? null : jobNumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu == null ? null : edu.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english == null ? null : english.trim();
    }

    public String getQua() {
        return qua;
    }

    public void setQua(String qua) {
        this.qua = qua == null ? null : qua.trim();
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability == null ? null : ability.trim();
    }

    public Person(Integer id, String jobNumber, String name, String edu, String major, String sex, String english, String qua, String ability) {
        this.id = id;
        this.jobNumber = jobNumber;
        this.name = name;
        this.edu = edu;
        this.major = major;
        this.sex = sex;
        this.english = english;
        this.qua = qua;
        this.ability = ability;
    }

    public Person() {
    }
}