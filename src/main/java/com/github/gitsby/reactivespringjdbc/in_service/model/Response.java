package com.github.gitsby.reactivespringjdbc.in_service.model;

public class Response<T> {

  public String url;
  
  public boolean isOk;
  
  public T body;

  @Override
  public String toString() {
    return "Response{" +
        "url='" + url + '\'' +
        ", isOk=" + isOk +
        ", body=" + body +
        '}';
  }

}
