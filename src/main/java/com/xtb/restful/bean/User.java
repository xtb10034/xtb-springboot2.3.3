package com.xtb.restful.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private Integer id;
    private String name;
    private String sexual;
    private String dept;
    private Integer age;


}
