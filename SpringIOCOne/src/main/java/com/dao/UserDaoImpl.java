package com.dao;

import com.po.User;
import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.HashMap;


@Repository
public class UserDaoImpl implements UserDao {
     static HashMap<Integer,User> map=new HashMap<>();
    static {


        map.put(1,new User(1,"张三","北京"));
        map.put(2,new User(2,"lucky","河南"));
        map.put(3,new User(3,"小撒","河北"));
        map.put(4,new User(4,"李四","北京"));

    }
    @Override
    public User getUserById(int id) {
        return map.get(id);
    }

    @Override
    public Collection<User> getAllUser() {
        return map.values();
    }
}
