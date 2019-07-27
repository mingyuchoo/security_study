package com.mgchoo.security2.admin.service;

import java.util.List;

import com.mgchoo.security2.admin.entity.Admin;

public interface AdminService {
    List<Admin> selectAll();

    Admin selectOne(Integer idx);

    void insert(Admin message);

    void update(Admin message);

    void delete(Admin message);

}
