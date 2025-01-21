//WAP in java on use of single and multi dimensional array
//single-dimensional array
class Singled {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Elements in the single-dimensional array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}

//multi-dimensional array
class Multid {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };
        System.out.println("Elements in multi-dimensional array: ");
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at [" + i + "][" + j + "]: " + matrix[i][j]);
            }
        }
    }
}