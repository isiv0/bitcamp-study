package com.eomcs.lang.ex05;

//# 증감 연산자 : 전위(pre-fix) 증감 연산자 응용 II
//
public class Exam0682 {
  public static void main(String[] args) {
    // 주의!
    // 1) pre-fix 연산자나 post-fix 연산자를 리터럴에 적용할 수 없다.
    //    int x = ++100; // 컴파일 오류!
    //    x = 100++; // 컴파일 오류!

    // 2) 변수에 동시에 적용할 수 없다!!!!!!!1 동시같은 이상한거 하지말자
    int y = 100;
    //    ++y++; // 컴파일 오류! 요딴거 안된다
    //    (++y)++; // 컴파일 오류! 앞뒤로 못붙인다₩!~!~!~!
    //    ++(y++); // 컴파일 오류! 괄호 쳐봐도 의미없다!@!@!@
  }
}






