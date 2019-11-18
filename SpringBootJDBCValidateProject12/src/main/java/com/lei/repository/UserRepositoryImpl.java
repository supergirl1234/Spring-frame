package com.lei.repository;

import com.lei.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    public JdbcTemplate jdbcTemplate;
    @Override
    public Collection<User> findAll() {
        return jdbcTemplate.query("select * from user",new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public User findById(Integer id) {
        return jdbcTemplate.queryForObject("select * from user where id=?",new Object[]{id},new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public void Insert(User user) {
        jdbcTemplate.update("insert user (id,name,score) values(?,?,?)",user.getId(),user.getName(),user.getScore());

    }

    @Override
    public void update(User user) {

        jdbcTemplate.update("update user set name=?,score=? where id=?",user.getName(),user.getScore(),user.getId());
    }

    @Override
    public void deleteById(Integer id) {

        jdbcTemplate.update("delete from user where id=?",id);
    }
}
