package com.study.springmybaties.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author
 * @Date 2019/7/23
 */
public interface SongDao {

    @Select("select  * from user")
    List<Map<String,String>> query();
}
