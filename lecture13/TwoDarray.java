package dsa.com.lecture13;

public class TwoDarray {
    public static void main(String[] args) {
        int[][] arr;
        arr = new int[3][4];

        int[][] brr = {{1,2},
                       {2,3,4,5},
                       {3,4,5,6,7,8},
                       {4}};

//        System.out.println(brr[2][0]);
//        System.out.println(brr[3][0]);

        int rowlength = brr.length;
      //  int collength = brr[0].length; // if having same number of row and column

        System.out.println("Printing full 2- D array : " );
        for (int row = 0; row < rowlength; row++) {
            int collength = brr[row].length; // when having zig-zagged array then for column size will use this

            for (int col = 0; col < collength; col++) {
                System.out.print(brr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
