package com.mgchoo.security2.home.mapper;

import org.springframework.stereotype.Repository;

import com.mgchoo.security2.home.entity.Home;

/*
 * org.springframework.stereotype 패키지에 존재한다. 
 * 스프링 2.0 부터 지원한다. 
 * @Repository는 일반적으로 DAO에 사용되며 DB Exception을 DataAccessException으로 변환한다.
 */
@Repository
public interface HomeMapper {
    public void insert(Home home);
}
