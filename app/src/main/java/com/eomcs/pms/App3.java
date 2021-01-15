package com.eomcs.pms;

import java.sql.Date;

public class App3 {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    final int SIZE = 5;

    int[] ids = new int[SIZE];
    String[] contents = new String[SIZE];
    Date[] dDates = new Date[SIZE];
    int[] nowStatus = new int[SIZE];
    String[] managers = new String[SIZE];

    int count = 0; 

    System.out.println("[작업]");
    System.out.print("프로젝트? ");
    String title = keyboard.nextLine();

    for (int i = 0; i < 3; i++) {
      System.out.print("번호? ");
      ids[i] = Integer.parseInt(keyboard.nextLine());

      System.out.print("내용? ");
      contents[i] = keyboard.nextLine();

      System.out.print("완료일? ");
      dDates[i] = Date.valueOf(keyboard.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      nowStatus[i] = Integer.valueOf(keyboard.nextLine());

      System.out.print("담당자? ");
      managers[i] = keyboard.nextLine();

      count++;

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyboard.nextLine();
      if (response.length() == 0 | response.equalsIgnoreCase("n") | response.equalsIgnoreCase("N")) {
        break;
      }
    }
    keyboard.close();
    System.out.println("--------------------------");
    System.out.printf("%s\n", title);

    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, ", ids[i], contents[i], dDates[i]);
      switch(nowStatus[i]) {
        case 1:
          System.out.print("신규");
          break;
        case 2:
          System.out.print("진행중");
          break;
        default: 
          System.out.print("완료");
          break;
      }
      System.out.printf(", %s\n", managers[i]);
    }

  }
}
