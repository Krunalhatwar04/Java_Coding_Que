public class Que_1 {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the triangle
            for (int k = 1; k <= i; k++) {
                // For the last row, print a full horizontal line of asterisks
                if (i == rows || k == 1 || k == i) {
                    System.out.print("*");
                } else {
                    // For other rows, print asterisks only at the beginning and end
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    }
