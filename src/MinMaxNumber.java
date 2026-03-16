public class MinMaxNumber {
    public static void main(String[] args) {
        int[][] numbers = {
                { 2, 11, 5 },
                { 3, 4, 7 },
                { 1, -1, 0 }
        };

        int minNum = numbers[0][0];
        int minNumCol = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] < minNum) {
                    minNum = numbers[i][j];
                    minNumCol = j;
                }
            }
        }

        System.out.println("Smallest Number is " + minNum);
        System.out.println("Smallest Number Column is " + minNumCol);

        // for (int i = 0; i < numbers.length; i++) {
        // for (int j = 0; j < numbers[i].length; j++) {
        // if (j == minNumCol) {
        // if (maxNum < numbers[i][j]) {
        // maxNum = numbers[i][j];
        // }
        // }
        // }
        // }

        // System.out.println("Maximum number from min number column is " + maxNum);

        int k = 0;
        int maxNum = numbers[k][minNumCol];
        while (k < 3) {
            if (maxNum < numbers[k][minNumCol]) {
                maxNum = numbers[k][minNumCol];
            }
            k++;
        }

        System.out.println("Maximum number from min number column is " + maxNum);
    }
}
