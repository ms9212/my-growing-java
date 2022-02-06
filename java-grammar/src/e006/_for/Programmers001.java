package e006._for;

public class Programmers001 {
    public static void main(String[] args) {
        int [][]arr1 = {{1, 2}, {2, 3}};
        int [][]arr2 = {{3, 4}, {5, 6}};
        int [][]answer = new int[2][2];

        // ... (code)

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                System.out.print(" " + answer[i][j]);
            }
            System.out.println();
        }
    }
}