package com.lei.factory;

import com.lei.entity.Car;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {

    private static Map<Integer,Car> carMap;
    static {

        carMap=new HashMap<>();
        carMap.put(1,new Car(1,"宝马"));
        carMap.put(2,new Car(2,"奔驰"));
    }

    public static  Car getCar(int id){

        return  carMap.get(id);
    }
}
