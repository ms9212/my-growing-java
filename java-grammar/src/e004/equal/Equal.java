package e004.equal;

public class Equal {
    public static void main(String[] args) {
        // 대입연산자
        // 연산자 우선순위가 매우 낮은 편.
        // 수학적 등호와 다름.
        // 우변에 있는 '값'을 좌변에 넣는 역할.
        //   좌변: 변수 하나 달랑.
        //   우변: 온갖 게. 결국 값 하나가 나옴.

        int a = 3;

        a = a + 1;
        // 순서:
        // 1) 연산자 +
        // 2) 연산자 = 대입연산자

        System.out.println(a);
    }
}
