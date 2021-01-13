package com.eomcs.pms;

public class App2 {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);


    System.out.println("[프로젝트]");
    System.out.print("번호?");
    int id = keyboard.nextInt();
    keyboard.nextLine();
    System.out.print("프로젝트명? ");
    String title = keyboard.nextLine();
    System.out.print("내용? ");
    String content = keyboard.nextLine();
    System.out.print("시작일? ");
    String startDate = keyboard.nextLine();
    System.out.print("종료일? ");
    String endDate = keyboard.nextLine();
    System.out.print("만든이? ");
    String madeBy = keyboard.nextLine();
    System.out.print("팀원? ");
    String member = keyboard.nextLine();
    keyboard.close();
    System.out.println("----------------------------");
    System.out.printf("번호: %d\n", id);
    System.out.printf("프로젝트명: %s\n", title);
    System.out.printf("내용: %s\n", content);
    System.out.printf("시작일: %s\n", startDate);
    System.out.printf("종료일: %s\n", endDate);
    System.out.printf("만든이: %s\n", madeBy);
    System.out.printf("팀원: %s\n", member);
  }
}
