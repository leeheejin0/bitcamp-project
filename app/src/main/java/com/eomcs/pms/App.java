package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner keyboardScan = new Scanner(System.in);
    // 회원
    final int LENGTH = 100;
    int[] no = new int[LENGTH];
    String[] name = new String[LENGTH];
    String[] email = new String[LENGTH];
    String[] password = new String[LENGTH];
    String[] photo = new String[LENGTH];
    String[] tel = new String[LENGTH];
    Date[] registeredDate = new Date[LENGTH];
    int size = 0;

    //프로젝트
    final int PROJECT_LENGTH = 100;
    int[] pno = new int[PROJECT_LENGTH];
    String[] ptitle = new String[PROJECT_LENGTH];
    String[] pcontent = new String[PROJECT_LENGTH];
    Date[] pstartDate = new Date[PROJECT_LENGTH];
    Date[] pendDate = new Date[PROJECT_LENGTH];
    String[] powner = new String[PROJECT_LENGTH];
    String[] pmembers = new String[PROJECT_LENGTH];
    int psize = 0;

    //작업
    final int TASK_LENGTH = 100;
    int[] tno = new int[TASK_LENGTH];
    String[] tcontent = new String[TASK_LENGTH];
    Date[] tdeadline = new Date[TASK_LENGTH];
    String[] towner = new String[TASK_LENGTH];
    int[] tstatus = new int[TASK_LENGTH];
    int tsize = 0;

    //명령 프롬프트 실행
    while (true) {
      System.out.print("명령> ");
      String input = keyboardScan.nextLine();
      if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("quit")) {
        break;
      } else if (input.equalsIgnoreCase("/member/add")) {
        System.out.println("[회원 등록]");

        System.out.print("번호? ");
        no[size] = Integer.parseInt(keyboardScan.nextLine());

        System.out.print("이름? ");
        name[size] = keyboardScan.nextLine();

        System.out.print("이메일? ");
        email[size] = keyboardScan.nextLine();

        System.out.print("암호? ");
        password[size] = keyboardScan.nextLine();

        System.out.print("사진? ");
        photo[size] = keyboardScan.nextLine();

        System.out.print("전화? ");
        tel[size] = keyboardScan.nextLine();

        registeredDate[size] = new java.sql.Date(System.currentTimeMillis());

        size++;

      } else if (input.equalsIgnoreCase("/member/list")) {
        System.out.println("[회원 목록]");

        for (int i = 0; i < size; i++) {
          System.out.printf("%d, %s, %s, %s, %s\n", 
              no[i], name[i], email[i], tel[i], registeredDate[i]);
        }

      } else if (input.equalsIgnoreCase("/project/add")) {
        System.out.println("[프로젝트 등록]");

        System.out.print("번호? ");
        no[psize] = Integer.valueOf(keyboardScan.nextLine());

        System.out.print("프로젝트명? ");
        ptitle[psize] = keyboardScan.nextLine();

        System.out.print("내용? ");
        pcontent[psize] = keyboardScan.nextLine();

        System.out.print("시작일? ");
        pstartDate[psize] = Date.valueOf(keyboardScan.nextLine());

        System.out.print("종료일? ");
        pendDate[psize] = Date.valueOf(keyboardScan.nextLine());

        System.out.print("만든이? ");
        powner[psize] = keyboardScan.nextLine();

        System.out.print("팀원? ");
        pmembers[psize] = keyboardScan.nextLine();

        psize++;

      } else if (input.equalsIgnoreCase("/project/list")) {
        System.out.println("[프로젝트 목록]");

        for (int i = 0; i < psize; i++) {
          // 번호, 프로젝트명, 시작일, 종료일, 만든이
          System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
              pno[i], ptitle[i], pstartDate[i], pendDate[i], powner[i]);
        }

      } else if (input.equalsIgnoreCase("/task/add")) {
        System.out.println("[작업 등록]");

        System.out.print("번호? ");
        tno[tsize] = Integer.parseInt(keyboardScan.nextLine());

        System.out.print("내용? ");
        tcontent[tsize] = keyboardScan.nextLine();

        System.out.print("마감일? ");
        tdeadline[tsize] = Date.valueOf(keyboardScan.nextLine());

        System.out.println("상태?");
        System.out.println("0: 신규");
        System.out.println("1: 진행중");
        System.out.println("2: 완료");
        System.out.print("> ");
        tstatus[tsize] = Integer.valueOf(keyboardScan.nextLine());

        System.out.print("담당자? ");
        towner[tsize] = keyboardScan.nextLine();

        tsize++;

      } else if (input.equalsIgnoreCase("/task/list")) {
        System.out.println("[작업 목록]");

        for (int i = 0; i < tsize; i++) {
          String stateLabel = null;
          switch (tstatus[i]) {
            case 1:
              stateLabel = "진행중";
              break;
            case 2:
              stateLabel = "완료";
              break;
            default:
              stateLabel = "신규";
          }
          // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
          System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
              tno[i], tcontent[i], tdeadline[i], stateLabel, towner[i]);
        }

      } else {
        System.out.println("명령어가 올바르지 않습니다. ");
      }
      System.out.println();
    }
    keyboardScan.close();

  }
}
