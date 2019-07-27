package com.mgchoo.security2.auth.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mgchoo.security2.auth.entity.MyUser;

@Repository
public interface UserMapper {
    public List<MyUser> selectList();

    public MyUser select(String username);

    public void insert(MyUser user);

    public void update(MyUser user);

    public void delete(MyUser user);
}
