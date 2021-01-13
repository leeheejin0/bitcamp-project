package com.eomcs.pms;

public class App3 {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    System.out.println("[작업]");
    System.out.print("프로젝트? ");
    String title = keyboard.nextLine();
    System.out.print("번호? ");
    int id = keyboard.nextInt();
    keyboard.nextLine();
    System.out.print("내용? ");
    String content = keyboard.nextLine();
    System.out.print("완료일? ");
    String dDate = keyboard.nextLine();
    System.out.println("상태? ");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    int state = keyboard.nextInt();
    keyboard.nextLine();
    System.out.print("담당자? ");
    String manager = keyboard.nextLine();
    keyboard.close();
    System.out.println("--------------------------");
    System.out.printf("프로젝트: %s\n", title);
    System.out.printf("번호: %d\n", id);
    System.out.printf("내용: %s\n", content);
    System.out.printf("완료일: %s\n", dDate);
    if(state == 0) {
      System.out.printf("상태: 신규\n");
    }else if(state == 1) {
      System.out.printf("상태: 진행중\n");
    }else if(state ==2) {
      System.out.printf("상태: 완료\n");
    }
    System.out.printf("담당자: %s\n", manager);

  }
}
