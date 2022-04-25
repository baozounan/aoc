package com.xj.aoc.entity;

import java.io.Serializable;

public class Test implements Serializable {
    private Integer id;

    private String testcol;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTestcol() {
        return testcol;
    }

    public void setTestcol(String testcol) {
        this.testcol = testcol == null ? null : testcol.trim();
    }
}