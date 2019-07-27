package com.mgchoo.security2.home.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mgchoo.security2.home.entity.Home;
import com.mgchoo.security2.home.mapper.HomeMapper;

/*
 * @Service를 적용한 Class는 비지니스 로직이 들어가는 Service로 등록이 된다.
 * Controller에 있는 @Autowired는 @Service("xxxService")에 등록된 xxxService와 변수명이 같아야 하며
 * Service에 있는 @Autowired는 @Repository("xxxDao")에 등록된 xxDao와 변수명이 같아야 한다.
 */
@Service
public class HomeServiceImpl implements HomeService {

    @Resource
    private HomeMapper homeMapper;

    @Override
    public void insert(Home home) {
        homeMapper.insert(home);
    }
}
