package com.music.service;

import com.laoxuai.ibatis.util.PageInfo;
import com.music.pojo.User;

import java.util.List;

public interface UserService {

    int insert(User user);
    
    int delete(Long id);

    int update(User user);

    User getByPrimaryKey(Long id);

    List<User> listPage(User user, int page, int size);

    PageInfo<User> listPageInfo(User user, int page, int size);

    List<User> selectByExample(User user);
}
