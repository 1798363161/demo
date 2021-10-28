package com.demo.servicedemoq.service.impl;

import com.demo.servicedemoq.entity.User;
import com.demo.servicedemoq.mapper.UserMapper;
import com.demo.servicedemoq.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author demo
 * @since 2021-10-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
