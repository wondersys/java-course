package it.wondersys.example.types;

import java.util.Arrays;

public class WorkingWithArrays {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        // This next statement will throw an exception as index reference a non existing cell
//        numbers[5] = 100;

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers)); //Utility class arrays helps handling arrays
        //Check the values that weren't initialized, why zero? Because of defaults

        int[] newNumbers = {2, 3, 5, 1, 4};
        System.out.println(Arrays.toString(newNumbers));
        Arrays.sort(newNumbers);
        System.out.println(Arrays.toString(newNumbers));

        //Multi dimensional arrays
        int[][] matrix = new int[5][5];
        matrix[0][0] = 1;

        System.out.println(matrix); //Still won't work
        System.out.println(Arrays.toString(matrix));
        System.out.println(Arrays.deepToString(matrix));

        //Initialize matrix with literals
        int [][] anotherMatrix = { {1 , 2}, {3, 4}};
        System.out.println(Arrays.deepToString(anotherMatrix));

    }
}
