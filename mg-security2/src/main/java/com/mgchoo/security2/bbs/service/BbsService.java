package com.mgchoo.security2.bbs.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mgchoo.security2.bbs.entity.Bbs;
import com.mgchoo.security2.bbs.mapper.BbsMapper;

@Service
public class BbsService {
    @Resource
    private BbsMapper bbsMapper;

    public List<Bbs> getSelect() {
        return this.bbsMapper.select();
    }

    public Bbs getSelectOne(int idx) {
        return this.bbsMapper.selectOne(idx);
    }

    public void insert(Bbs bbsVo) {
        this.bbsMapper.insert(bbsVo);
    }

    public void update(Bbs bbsVo) {
        this.bbsMapper.update(bbsVo);
    }

    public void delete(int idx) {
        this.bbsMapper.delete(idx);
    }
}
