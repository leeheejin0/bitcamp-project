package com.eomcs.pms;

import java.sql.Date;

public class App2 {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    final int SIZE = 5;

    int[] ids = new int[SIZE];
    String[] titles = new String[SIZE];
    String[] contents = new String[SIZE];
    Date[] startDates = new Date[SIZE];
    Date[] endDates = new Date[SIZE];
    String[] owners = new String[SIZE];
    String[] teams = new String[SIZE];

    int count = 0;

    System.out.println("[프로젝트]");

    for (int i = 0; i < SIZE; i++) {
      System.out.print("번호? ");
      ids[i] = keyboard.nextInt();

      keyboard.nextLine();
      System.out.print("프로젝트명? ");
      titles[i] = keyboard.nextLine();

      System.out.print("내용? ");
      contents[i] = keyboard.nextLine();

      System.out.print("시작일? ");
      startDates[i] = Date.valueOf(keyboard.nextLine());

      System.out.print("종료일? ");
      endDates[i] = Date.valueOf(keyboard.nextLine());

      System.out.print("만든이? ");
      owners[i] = keyboard.nextLine();

      System.out.print("팀원? ");
      teams[i] = keyboard.nextLine();

      count++;

      System.out.println();
      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyboard.nextLine();
      if (response.length() == 0 | response.equalsIgnoreCase("n") | response.equalsIgnoreCase("N")) {
        break;
      }
      System.out.println();


    }
    keyboard.close();
    System.out.println("------------------------------------");

    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", 
          ids[i], titles[i], contents[i], startDates[i], endDates[i], owners[i], teams[i]);
    }
  }
}
