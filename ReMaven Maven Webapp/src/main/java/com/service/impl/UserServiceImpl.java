package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
 
import com.dao.UserMapper;
import com.pojo.User;
import com.service.IUserService;
 
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userDao;
    @Override
    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }
 
}
