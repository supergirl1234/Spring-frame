package com.lei.po;
import lombok.Data;
import javax.persistence.*;
import java.util.Date;
@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private Double score;
    @Column
    private Date birthday;
}
