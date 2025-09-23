
public class dv {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 9;  // You can adjust the width

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // For this pattern, print stars at these positions:
                if (i == 1 && (j == 5 || j == 9)) {
                    System.out.print("*");
                } else if (i == 2 && (j == 4 || j == 6 || j == 8 || j == 10)) {
                    System.out.print("*");
                } else if (i == 3 && (j == 3 || j == 7 || j == 11)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
