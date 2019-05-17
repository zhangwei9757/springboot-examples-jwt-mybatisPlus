package com.example.mybatiplus.service.impl;

import com.example.mybatiplus.entity.User;
import com.example.mybatiplus.mapper.UserMapper;
import com.example.mybatiplus.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zw
 * @since 2019-05-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
