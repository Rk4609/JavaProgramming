// import java.util.*;

// public class JavaBasics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Input the first number : ");
//         double x = sc.nextDouble();

//         System.out.print("Input the second number : ");
//         double y = sc.nextDouble();

//         System.out.print("Input the third number : ");
//         double z = sc.nextDouble();

//         System.out.print("The average value is : " + average(x, y, z)/3 + "\n");
//     }

//     public static double average(double x, double y, double z) {
//         return (x + y + z) / 3;
//     }
// }

// import java.util.*;

// public class JavaBasics {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int num;

//         System.out.print("Enter an integer : ");
//         num = sc.nextInt();

//         if (isEven(num)) {
//             System.out.println("Number is Even");
//         }else{
//             System.out.println("Number is Odd");
//         }
//     }

//     public static boolean isEven(int number){
//         if (number % 2 == 0) {
//             return true;
//         }else{
//             return false;
//         }
//     }

// }

// import java.util.*;

// public class JavaBasics {

//     public static void main(String[] args) {

//         System.out.println("Please Enter a number : ");
//         Scanner sc = new Scanner(System.in);
//         int palindrome = sc.nextInt();

//         if (isPalindrome(palindrome)) {
//             System.out.println("Number : " + palindrome + "                                                                                                                    is a palindrome");
//         } else {
//             System.out.println("Number : " + palindrome + " is not a palindrome");
//         }
//     }

//     public static boolean isPalindrome(int number) {
//         int palindrome = number;
//         int reverse = 0;

//         while (palindrome != 0) {
//             int remainder = palindrome % 10;
//             reverse = reverse * 10 + remainder;
//             palindrome = palindrome / 10;
//         }
//         if (number == reverse) {
//             return true;
//         } else {
//             return false;
//         }
//     }

// }

// import java.util.*;

// public class JavaBasics {

//     public static void Hollow_Rectangle(int totalRow, int totalCols){
//            for(int i=1; i<=totalRow; i++){
//             for(int j=1; j<=totalCols; j++){

//                 if (i==1 || i == totalRow || j==1 || j== totalCols) {
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//               System.out.println();
//            }
//     }

//     public static void main(String[] args) {
//         Hollow_Rectangle(8,10);
//     }

// }

// import java.util.*;

// public class JavaBasics {

//     public static void Inverted_Rotated_Pyramid(int n) {
//           for(int i=1; i<=n; i++){
//              // spaces 
//              for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//              }
//              // starts
//              for(int j=1; j<=i; j++){
//                 System.out.print("*");
//              }
//                System.out.println();
//           }
//     }

//     public static void main(String[] args) {
//        Inverted_Rotated_Pyramid(4);
//     }

// }

// import java.util.*;

// public class JavaBasics {

//     public static void Inverted_half_Pyramid_withNumber(int n) {
//          for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//          }

//     }

//     public static void main(String[] args) {
//       Inverted_half_Pyramid_withNumber(10);
//     }

// }

// import java.util.*;

// public class JavaBasics {

//     public static void triangle(int n) {
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){

//                 if ((i+j) % 2 == 0) {
//                     System.out.print("1");
//                 }
//                 else{
//                     System.out.print("0");
//                 }

//             }
//              System.out.println();
//         }
//     }

// import java.util.*;

// public class JavaBasics{

// public static void butterfly(int n){
//     for(int i=1; i<=n; i++){
//         //  starts
//         for(int j=1; j<=i; j++){
//              System.out.print("*");
//         }
//         // spaces
//         for(int j=1; j<=2*(n-1); j++){
//             System.out.print(" ");
//         }
//         // Stars

//         for(int j=1; j<=i; j++){
//             System.out.print("*");
//         }

//         System.out.println();
//     }

// // Second half

// for(int i=n; i>=1; i--){
//     for(int i=1; i<=n; i++){
//         //  starts
//         for(int j=1; j<=i; j++){
//              System.out.print("*");
//         }
//         // spaces
//         for(int j=1; j<=2*(n-1); j++){
//             System.out.print(" ");
//         }
//         // Stars

//         for(int j=1; j<=i; j++){
//             System.out.print("*");
//         }

//         System.out.println();
//     }

// }
// public static void main(String[] args) {
// //    triangle(5);        
// butterfly(5);          
// }
// }

// import java.util.*;

// public class JavaBasics {

//     public static void butterfly(int n) {
//         for (int i = 1; i <= n; i++) {
//             // stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             // spaces
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.out.print(" ");
//             }
//             // stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         // second half

//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             // spaces
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.out.print(" ");
//             }
//             // stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }

//     public static void main(String[] args) {
//         butterfly(5);

//     }
// }


import java.util.*;

public class JavaBasics {

    public static void diamond(int n) {
      
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
           for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
      diamond(5);
        
    }
}