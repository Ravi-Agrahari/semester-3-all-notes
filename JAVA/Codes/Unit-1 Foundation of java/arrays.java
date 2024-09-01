/*

 Arrays & Its Types
 ******************
    An array is a data structure that stores a fixed-size sequential collection of elements of the same type.

    Types of arrays in Java include:


    Single-dimensional Array:
    -------------------------
         A list of elements of the same type.

         example:
             int[] numbers = {1, 2, 3, 4, 5};
             or
             int[] numbers = new int[5];
                numbers[0] = 1;
                ...

    Multi-dimensional Array:
    -------------------------
         An array of arrays used to store data in a tabular form.

         example:
             int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
             or
                int[][] matrix = new int[3][3];
                    matrix[0][0] = 1;
                    ...

    Jagged Array:
    -------------
         An array of arrays with different lengths.

         example:
             int[][] jaggedArray = new int[3][];
             jaggedArray[0] = new int[]{1, 2, 3};
             jaggedArray[1] = new int[]{4, 5};
             jaggedArray[2] = new int[]{6, 7, 8, 9};


    Arrays class:(java.util.Arrays)
    -------------
         The Arrays class in Java provides various utility methods for working with arrays.

         example:
             int[] numbers = {1, 2, 3, 4, 5};
             Arrays.sort(numbers); // sorts the array in ascending order
             System.out.println(Arrays.toString(numbers)); // prints the array


    
 */