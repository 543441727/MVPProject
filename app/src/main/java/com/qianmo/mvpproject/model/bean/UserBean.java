package com.qianmo.mvpproject.model.bean;

/**
 * Created by Administrator on 2016/11/7 0007.
 */
public class UserBean {
    public UserBean(String name, String age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
