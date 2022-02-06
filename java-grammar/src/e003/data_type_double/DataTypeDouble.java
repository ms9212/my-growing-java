package e003.data_type_double;

public class DataTypeDouble {
    public static void main(String[] args) {
        double db1 = 10.0;  // 10.  10.0  10d 등으로 표기
        double db2 = 3.;
        System.out.println("-두 실수 10.0, 3.0 사이의 덧셈, 뺄셈, 곱셈, 나눗셈: ");
        System.out.println(db1 + db2);
        System.out.println(db1 - db2);
        System.out.println(db1 * db2);
        System.out.println(db1 / db2);
        
        // 캐스팅(형 변환)
        int a1 = 10;
        int a2 = 3;
        System.out.println("-두 정수 10, 3 사이의 덧셈, 뺄셈, 곱셈, 나눗셈: ");
        System.out.println(a1 + a2);
        System.out.println(a1 - a2);
        System.out.println(a1 * a2);
        // 나눗셈에서만 실수형으로 처리
        System.out.println((double)(a1 / a2));          // Wrong(순서 잘못)
        System.out.println((double)a1 / (double)a2);    // Correct

    }
}
