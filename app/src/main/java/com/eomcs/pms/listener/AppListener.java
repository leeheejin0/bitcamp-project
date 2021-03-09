package com.eomcs.pms.listener;

import java.util.Map;
import com.eomcs.context.ApplicationContextListener;

public class AppListener implements ApplicationContextListener{

  @Override
  public void contextInitialized(Map<String,Object> context) {
    System.out.println("미니 프로젝트에 오신 것을 환영합니다! ");
  }

  @Override
  public void contextDestroyed(Map<String,Object> context) {
    System.out.println("미니 프로젝트 관리시스템 종료!");
  }
}
