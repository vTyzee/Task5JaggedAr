import java.util.Arrays;
import java.util.Random;

public class JaggedAr {
    public static void main(String[] args) {
        int[][] jaggedArray = {
                new int[3],
                new int[5],
                new int[7],
                new int[8],
                new int[9]
        };

        Random random = new Random();

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = 50 + random.nextInt(51);
            }
        }

        System.out.println("Несортированный массив:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < jaggedArray.length; i++) {
            Arrays.sort(jaggedArray[i]);
        }


        System.out.println("\nОтсортированный массив:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
        }
    }
}
