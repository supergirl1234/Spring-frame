package com.lei.repository;

import com.lei.entity.Address;
import com.lei.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepositoryImpl implements  UserRepository{

    private  static  Map<Integer,User> map;
    static {

        map=new HashMap<>();
        map.put(1,new User(1,"张三",11,new Address("北京")));
        map.put(2,new User(2,"李四",12,new Address("深圳")));
        map.put(3,new User(3,"王五",13,new Address("上海")));
        map.put(4,new User(4,"Lucy",14,new Address("广州")));
        map.put(5,new User(5,"Lucky",15,new Address("杭州")));
    }
    @Override
    public Collection<User> findAll() {
        return  map.values();
    }

    @Override
    public User findById(Integer id) {
        return map.get(id);
    }

    @Override
    public void update(User user) {

        map.put(user.getId(),user);
    }

    @Override
    public void deleteById(Integer id) {

        map.remove(id);
    }
}
