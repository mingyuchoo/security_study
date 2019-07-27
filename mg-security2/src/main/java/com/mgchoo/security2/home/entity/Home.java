package com.mgchoo.security2.home.entity;

import java.io.Serializable;
import java.util.Date;

public class Home implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -7585289067685769485L;
    private Integer  idx;
    private String   name;
    private Date     accessDate;
    
    public Home(String name) {
        this.setName(name);
    }
    public Integer getIdx() {
        return idx;
    }
    public void setIdx(Integer idx) {
        this.idx = idx;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getAccessDate() {
        return accessDate;
    }
    public void setAccessDate(Date accessDate) {
        this.accessDate = accessDate;
    }
}
