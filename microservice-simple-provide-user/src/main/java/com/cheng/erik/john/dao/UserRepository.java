package com.cheng.erik.john.dao;

import com.cheng.erik.john.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName ：UserRepository
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2019/8/26 17:21
 * @Description: 用户-数据操作类。
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
