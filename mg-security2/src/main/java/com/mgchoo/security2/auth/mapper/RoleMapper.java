package com.mgchoo.security2.auth.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mgchoo.security2.auth.entity.MyRole;
import com.mgchoo.security2.auth.entity.MyUser;

@Repository
public interface RoleMapper {
    public List<MyRole> selectAllbyUser(MyUser user);
}
