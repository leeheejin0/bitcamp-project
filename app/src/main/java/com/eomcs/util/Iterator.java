package com.eomcs.util;

public interface Iterator<E> {
  // 인터페이스의 메서드는 기본이 public으로 공개된 추상 메서드이다. 
  // - public과 abstract는 생략 가능. 
  boolean hasNext();
  E next();
}
