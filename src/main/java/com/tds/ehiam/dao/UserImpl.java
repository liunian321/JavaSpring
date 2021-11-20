package com.tds.ehiam.dao;

import com.tds.ehiam.bean.User;

public class UserImpl implements UserMapper{

    public void init(){
        System.out.println("init run...");
    }

    public void printUser(User user){
        System.out.println(user);
    }

    public void destroy(){
        System.out.println("destroy run...");
    }
}
