package com.github.gitsby.reactivespringjdbc.service;

public interface DbCacheRegister {

  String getLastResult(String hash);

  void add(String hash, String value);

  String getHash(String... params);
}
