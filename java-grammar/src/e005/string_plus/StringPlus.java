package e005.string_plus;

public class StringPlus {
    public static void main(String[] args) {
        // 문자열: 원시자료형이 아님.
        // 문자형과 문자열의 차이

        // char 문자형      ''
        // String 문자열    ""

        char ch = 'a';   // char는 무조건 한 글자. (0글자 안 됨, 2 글자 이상도 안 됨. 무조건 1 글자)
        String str = "aa";    // 0글자도 됨. 1글자도 됨. 2글자도 됨.

        ch++;   // ch = (char)(ch + 1);
        System.out.println(ch); // 아스키코드표에서 'a'는 97, 'b'는 98. 대문자는 'A'가 65
        // 이렇게 다룰 땐 char 타입 잘 쓰면 좋음.

        // String 덧셈은 좀 다름.
        System.out.println(str + 1);    // 문자열 이어 붙이기.

        int a= 10;
        int b= 3;
        System.out.println("두 정수 " + a + "와 " + b + "의 합은 " + (a + b) + "입니다.");
    }
}
