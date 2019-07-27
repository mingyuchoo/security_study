package com.mgchoo.security2.bbs.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mgchoo.security2.bbs.entity.Bbs;

@Repository
public interface BbsMapper {
    List<Bbs> select();

    Bbs selectOne(int idx);

    void insert(Bbs bbsVo);

    void update(Bbs bbsVo);

    void delete(int idx);
}
