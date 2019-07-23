package com.study.springmybaties.service;

import com.study.springmybaties.dao.SongDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Desc
 * @Author
 * @Date 2019/7/23
 */
@Component
public class UserService {

    @Autowired
    SongDao songDao;

    public Object getObejct(){
        songDao.query();
        return null;
    }

}
