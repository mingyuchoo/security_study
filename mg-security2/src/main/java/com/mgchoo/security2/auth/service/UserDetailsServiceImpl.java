package com.mgchoo.security2.auth.service;

import java.util.Collection;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mgchoo.security2.auth.entity.MyRole;
import com.mgchoo.security2.auth.entity.MyUser;
import com.mgchoo.security2.auth.mapper.RoleMapper;
import com.mgchoo.security2.auth.mapper.UserMapper;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    UserMapper  userMapper;
    
    @Resource
    RoleMapper  roleMapper;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("loadUserByUsername - username: {}", username);
        
        MyUser userInfo = null;
        Collection<MyRole> roleInfo = null;
        
        try {
            userInfo = userMapper.select(username);
            logger.info("userMapper username: {}", userInfo.getUsername());

        } catch (NullPointerException e) {
            logger.debug(e.toString());
        }

        try {
            roleInfo = roleMapper.selectAllbyUser(userInfo);
            
        } catch (NullPointerException e) {
            logger.debug(e.toString());
        }
        
        User user = new User(userInfo.getUsername(),
                             userInfo.getPassword(), 
                             userInfo.isEnabled(),
                             userInfo.isAccountNonExpired(),                             
                             userInfo.isCredentialsNonExpired(),
                             userInfo.isAccountNonLocked(),
                             roleInfo);
        
        logger.info("loadUserByUsername - user.username: {}, user.passowrd: {}", user.getUsername(), user.getPassword());
        return user;

    }
}
