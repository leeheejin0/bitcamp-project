package com.eomcs.pms;

public class App {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    java.util.Date today = new java.util.Date();

    System.out.println("[회원]");
    System.out.println("번호? ");
    int id = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("이름? ");
    String name = keyboard.nextLine();
    System.out.println("이메일? ");
    String email = keyboard.nextLine();
    System.out.println("암호? ");
    int pw = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("사진? ");
    String photo = keyboard.nextLine();
    System.out.println("전화? ");
    String phoneNum = keyboard.nextLine();
    keyboard.close();
    System.out.println("----------------------------");
    System.out.printf("번호: %d\n", id);
    System.out.printf("이름: %s\n", name);
    System.out.printf("이메일: %s\n", email);
    System.out.printf("암호: %d\n", pw);
    System.out.printf("사진: %s\n", photo);
    System.out.printf("전화: %s\n", phoneNum);
    System.out.printf("가입일: %1$tY-%1$tm-%1$td", today);

  }
}
