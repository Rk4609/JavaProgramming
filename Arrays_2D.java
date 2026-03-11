// import java.util.*;

// public class Arrays_2D {
//     // Searching
//     public static boolean search(int matrix[][], int key) {

//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 if (matrix[i][j] == key) {
//                     System.out.println("Found at cell (" + i + "," + j +")");
//                     return true;
//                 }
//             }
//         }
//         System.out.println("Key is found");
//         return false;
//     }

//     public static void main(String[] args) {

//         int matrix[][] = new int[3][3];
//         Scanner sc = new Scanner(System.in);

//         int n = matrix.length, m = matrix[0].length;

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         //output
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//         search(matrix, 5);
//     }

// }

//----------------------------------------------------------------------------------------

// {-- Spiral Matrix -- }

// import java.util.*;

// public class Arrays_2D {

//     public static void spiralMatrix(int matrix[][]) {
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length-1;
//         int endCol = matrix[0].length-1;

//         while (startRow <= endRow && startCol <= endCol) {
//             // top
//             for (int j = startCol; j <= endCol; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }
//             // right
//             for (int i = startRow+1; i <=endRow; i++) {
//                 System.out.print(matrix[i][endCol] + " ");
//             }
//             // bottom
//             for (int j = endCol-1; j >=startCol; j--) {
//                 if (startRow == endRow) {
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j] + " ");
//             }
//             // left
//             for (int i = endRow - 1; i >= startRow + 1; i--) {
//                 if (startCol == endCol) {
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol] + " ");
//             }
//             startCol++;
//             startRow++;
//             endCol--;
//             endRow--;

//         }
//         System.out.println();

//     }

//     public static void main(String[] args) {
//         int matrix[][] = { { 1, 2, 3, 4 },
//                 { 5, 6, 7, 8 },
//                 { 9, 10, 11, 12 },
//                 { 13, 14, 15, 16 } };

//         spiralMatrix(matrix);
//     }
// }

//--------{Diagonal sum }-----------------------------------------------------------------------

// import java.util.*;

// public class Arrays_2D {

//     public static int diagonalSum(int matrix[][]) {
//         int sum = 0;
//         for (int i = 0; i < matrix.length; i++) {

//             // primary
//             sum += matrix[i][i];
//             // secondary
//             if (i != matrix.length - 1 - i) {
//                 sum += matrix[i][matrix.length - i - 1];
//             }

//         }
//         return sum;
//     }

//     public static void main(String[] args) {

//         int matrix[][] = { { 1, 2, 3, 4 },
//                 { 5, 6, 7, 8 },
//                 { 9, 10, 11, 12 },
//                 { 13, 14, 15, 16 } };

//         System.out.println(diagonalSum(matrix));
//     }
// }

//-------------------------------------------------------------------------------------
// import java.util.*;

// public class Arrays_2D {

//     public static boolean staircaseSearch(int matrix[][], int key) {
//         int row = 0, col = matrix[0].length - 1;

//         while (row < matrix.length && col >= 0) {
//             if (matrix[row][col] == key) {
//                 System.out.println("Found key at (" + row + "," + col + ")");
//                 return true;
//             } else if (key < matrix[row][col]) {
//                 col--;
//             } else {
//                 row++;
//             }
//         }
//         System.out.println(" Key is not found");
//         return false;

//     }

//     public static void main(String[] args) {
//         int matrix[][] = { { 10, 20, 30, 40 },
//                 { 15, 25, 35, 45 },
//                 { 27, 29, 37, 48 },
//                 { 32, 33, 39, 50 } };

//         int key = 33;
//         staircaseSearch(matrix, key);
//     }
// }

//------{Palindrome}------------------------------------------------------------------------------

// import java.util.*;

// public class Arrays_2D {
//     public static boolean isPalindrome(String str) {
//         for (int i = 0; i < str.length() / 2; i++) {
//             int n = str.length();

//             if (str.charAt(i) != str.charAt(n - 1 - i)) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String str = "racecar";
//         System.out.println(isPalindrome(str));
//     }
// } 

//---------{Shortest path in string}------------------------------------------------------------------------

// import java.util.*;

// public class Arrays_2D {
//     public static float getShortestpath(String path) {
//         int x = 0, y = 0;
//         for (int i = 0; i < path.length(); i++) {
//             char dir = path.charAt(i);

//             // South
//             if (dir == 'S') {
//                 y--;
//             }
//             // North
//             else if (dir == 'N') {
//                 y++;
//             } else if (dir == 'W') {
//                 x--;
//             } else {
//                 x++;
//             }
//         }
//         int X2 = x * x;
//         int Y2 = y * y;
//         return (float) Math.sqrt(X2 + Y2);
//     }

//     public static void main(String[] args) {
//         String path = "WNEENESENNN";
//         System.out.println(getShortestpath(path));
//     }
// }
