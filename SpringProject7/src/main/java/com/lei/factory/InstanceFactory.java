package com.lei.factory;

import com.lei.entity.Grade;

import java.util.HashMap;
import java.util.Map;

public class InstanceFactory {

    private static Map<Integer,Grade> map;
    static {

        map=new HashMap<>();
        map.put(1,new Grade(1,90,97));
        map.put(2,new Grade(2,93,95));
        map.put(3,new Grade(3,96,92));

    }
    public Grade getGrade(int id){

        return map.get(id);
    }
}
