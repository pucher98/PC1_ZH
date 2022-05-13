import java.util.ArrayList;

public class Matrix {
    /*Készítsen egy Matrix osztályt. Az osztályban írja meg a countNumbersDivisibleBySeven és a columnsWithMax metódusokat.
     Mindkét metódus meghatározza egy 2-dimenziós egész mátrixban: előbbi a 7-tel osztható számok számát,
      utóbbi azon oszlopok indexét, amelyben megtalálható a mátrix maximuma!*/
    public static int countNumbersDivisibleBySeven(int[][] matrix) {
        int result = 0;
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[j][i] % 7 == 0) {
                    result++;

                }
            }

        }
        return result;
    }

    public static ArrayList<Integer> keys = new ArrayList<>();

    public static ArrayList<Integer> columnsWithMax(int[][] matrix) {
        int maxValue = matrix[0][0];
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[j][i] > maxValue) {
                    if(!keys.contains(i)){
                        keys.add(i);
                    }
                }
            }
        }
        return keys;
        }
    }

