// To print the following pattern

//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *

public class diamond_pattern {
    public static void main(String args[]) {
        int n = 4;

        // upper half
        for(int i = 1; i <= n ; i++) {
            
            // spaces
            for(int j = 1 ; j <= n - i ; j++) {
                System.out.print(" ");
            }

            // upper half
            for(int j = 1; j <= 2 * i - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for(int i = n; i >= 1 ; i--) {
            
            // spaces
            for(int j = 1 ; j <= n - i ; j++) {
                System.out.print(" ");
            }

            // upper half
            for(int j = 1; j <= 2 * i - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
