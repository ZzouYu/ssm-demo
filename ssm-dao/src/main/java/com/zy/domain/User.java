package com.zy.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author zouyu
 * @description
 * @date 2020/4/23
 */
@Getter
@Setter
@ToString
public class User {

    private Integer id;

    private String name;

    private double money;

}
