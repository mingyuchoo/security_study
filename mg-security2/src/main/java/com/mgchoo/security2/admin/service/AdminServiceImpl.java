package com.mgchoo.security2.admin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mgchoo.security2.admin.entity.Admin;
import com.mgchoo.security2.admin.mapper.AdminMapper;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    AdminMapper messageMapper;
    
    
    
    @Override
    public List<Admin> selectAll() {
        return messageMapper.selectAll();
    }

    @Override
    public Admin selectOne(Integer idx) {
        return messageMapper.selectOne(idx);
    }

    @Override
    public void insert(Admin message) {
        messageMapper.insert(message);
    }

    @Override
    public void update(Admin message) {
        messageMapper.update(message);
    }

    @Override
    public void delete(Admin message) {
        messageMapper.delete(message);
    }

}
