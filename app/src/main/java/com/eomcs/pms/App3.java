package com.eomcs.pms;

import java.sql.Date;

public class App3 {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    System.out.println("[작업]");
    System.out.print("프로젝트? ");
    String title = keyboard.nextLine();

    System.out.print("번호? ");
    int id = Integer.parseInt(keyboard.nextLine());

    System.out.print("내용? ");
    String content = keyboard.nextLine();

    System.out.print("완료일? ");
    Date dDate = Date.valueOf(keyboard.nextLine());

    System.out.println("상태? ");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    int status = Integer.valueOf(keyboard.nextLine());

    System.out.print("담당자? ");
    String manager = keyboard.nextLine();
    keyboard.close();
    System.out.println("--------------------------");
    System.out.printf("프로젝트: %s\n", title);
    System.out.printf("번호: %d\n", id);
    System.out.printf("내용: %s\n", content);
    System.out.printf("완료일: %s\n", dDate);
    switch(status) {
      case 1:
        System.out.println("상태: 신규");
        break;
      case 2:
        System.out.println("상태: 진행중");
        break;
      default: 
        System.out.println("상태: 완료");
        break;
    }
    System.out.printf("담당자: %s\n", manager);

  }
}
