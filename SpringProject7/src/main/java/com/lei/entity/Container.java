package com.lei.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class Container {

    public List<String> stringList;
    public Set<Integer> stringSet;
    public Map<Integer,String> stringMap;
}
