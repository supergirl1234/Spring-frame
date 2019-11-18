package com.lei.po;


import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class Teacher {

    @NotNull(message = "id不能为空")
    private Integer id;
    @NotEmpty(message ="姓名不能为空" )
    private String username;
    @Length(min = 6,max = 12,message = "密码长度在[6,12]之间")
    private String password;
}
