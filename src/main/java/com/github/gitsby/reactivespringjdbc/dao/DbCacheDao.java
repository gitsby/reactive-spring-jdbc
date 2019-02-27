package com.github.gitsby.reactivespringjdbc.dao;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface DbCacheDao {

  @Select("select value::text from service_last_result where hash = #{hash}")
  String getLastResult(@Param("hash") String hash);

}