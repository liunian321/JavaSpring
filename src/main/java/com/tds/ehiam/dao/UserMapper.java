package com.tds.ehiam.dao;


import com.tds.ehiam.bean.User;

public interface UserMapper {
    void init();

    void printUser(User user);

    void destroy();
}
