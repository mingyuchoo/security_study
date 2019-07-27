package com.mgchoo.security2.admin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mgchoo.security2.admin.entity.Admin;

@Repository
public interface AdminMapper {
    List<Admin> selectAll();

    Admin selectOne(Integer idx);

    void insert(Admin message);

    void update(Admin message);

    void delete(Admin message);

}
