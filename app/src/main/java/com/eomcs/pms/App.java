package com.eomcs.pms;

public class App {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    java.util.Date today = new java.util.Date();

    final int SIZE = 5;

    int[] ids = new int[SIZE];
    String[] names = new String[SIZE];
    String[] emails = new String[SIZE];
    int[] pws = new int[SIZE];
    String[] photos = new String[SIZE];
    String[] tels = new String[SIZE];
    java.sql.Date[] nows = new java.sql.Date[SIZE];

    System.out.println("[회원]");

    for (int i = 0; i < SIZE; i++) {
      System.out.print("번호? ");
      ids[i] = keyboard.nextInt();

      keyboard.nextLine();
      System.out.print("이름? ");
      names[i] = keyboard.nextLine();

      System.out.print("이메일? ");
      emails[i] = keyboard.nextLine();

      System.out.print("암호? ");
      pws[i] = keyboard.nextInt();

      keyboard.nextLine();
      System.out.print("사진? ");
      photos[i] = keyboard.nextLine();

      System.out.print("전화? ");
      tels[i] = keyboard.nextLine();

      nows[i] = new java.sql.Date(System.currentTimeMillis());

      System.out.println();
      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyboard.nextLine();
      if(response == null)
        break;

    }
    keyboard.close();
    System.out.println("----------------------------------");
    for (int i = 0; i < SIZE; i++) {
      System.out.printf("%d, %s, %s, %d, %s, %s, %s\n", 
          ids[i], names[i], emails[i], pws[i], photos[i], tels[i], nows[i]);
    }


  }
}
