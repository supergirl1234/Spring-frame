package com.lei.po;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;
@Data
public class Student implements Serializable {

    private Integer id;
    private String name;
    private Double score;
    private Date birthday;
}
