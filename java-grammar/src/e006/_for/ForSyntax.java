package e006._for;

public class ForSyntax {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5};

        // 보통
        // for(첫 값; 반복조건 ; 증감식) {  }
        for (int i = 0; i < arr.length; i++) {
            // 실행문
            System.out.println(arr[i]);
        }

        System.out.println("반복 끝.");

        // 2차원 배열: 1차원 배열의 배열
        int[][] arr2nd = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // 줄바꿈 하면서 출력하고 싶다.
        for (int i = 0; i < arr2nd.length; i++) {

            for (int j = 0; j < arr2nd.length; j++) {
                System.out.print(" " + arr2nd[i][j]);
                // 순서: 
                // arr2nd[0][0]
                // arr2nd[0][1]
                // arr2nd[0][2]
                // arr2nd[0][3]

                // arr2nd[1][0]
                // arr2nd[1][1]
                // ...
            }
            System.out.println();
        }
    }
}
