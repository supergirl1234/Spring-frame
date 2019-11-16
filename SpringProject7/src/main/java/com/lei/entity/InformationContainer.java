package com.lei.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class InformationContainer {
    public List<User> list;
    public Set<User> set;
    public Map<Integer,User> map;
}
