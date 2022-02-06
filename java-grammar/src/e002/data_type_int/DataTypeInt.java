package e002.data_type_int;

public class DataTypeInt {
    public static void main(String[] args) {
        // javasciprt: let(변경 가능), const(변경 불가)
        // java: 데이터 타입.
        // 원시타입 8가지.

        // 선언은 한 번만.
        int a;  // 선언
        a = 3;  // 값 대입.(초기화: 값을 넣어야 언젠가 사용 가능.)

        // 동적 타입 var 비권장.
        var b = 4;

        int a1, a2; // 여러 변수 동시에 선언
        int c;      // (권장) 하나씩 선언

        /* int 타입
         *  - 메모리에 각각 4 바이트씩 할당
         *  - 메모리에서 이 변수를 읽을 때 '정수'로 읽음.
         * 
         * 컴퓨터와 우리 사이에 이 이진수 값을 어떻게 읽을지에 대한 약속: 데이터 타입
        */

        /* === 배열 선언 ===
         * int []arr;   // 권장
         * int[] arr;   // 권장
         * int arr[];   // 비권장
         * 
         * 배열은 반복문에 사용하기 좋다.
         */

        int []arr = new int[5]; // 크기가 5개인 배열.

        // 배열 선언과 동시에 초기화
        int []arrInitialized = {1, 2, 3, 4, 5}; // 5칸 예시

        // ★ 배열은 크기를 바꿀 수 없음.

        // 정수의 사칙연산: 결과도 정수로 나옴.(※ 나눗셈도.)
        a = 10;
        b = 3;
        System.out.println("두 정수 10, 3의 덧셈, 뺄셈, 곱셈, 나눗셈: ");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);  // 몫(양수 간)

        // 변수의 수명(중괄호)
        {
            int nestedValue = 100;
        }
        // 여기서는 nestedValue의 수명이 끝나 있음.
    }
}
