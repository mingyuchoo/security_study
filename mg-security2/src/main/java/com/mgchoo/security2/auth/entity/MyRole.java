package com.mgchoo.security2.auth.entity;

import org.springframework.security.core.GrantedAuthority;

public class MyRole implements GrantedAuthority {
    private static final long serialVersionUID = -4745789264673159360L;
    private Integer id;
    private String  name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return this.name;
    }
}
