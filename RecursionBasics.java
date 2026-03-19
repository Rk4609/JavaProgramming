//---------------------------------------------
//-----------Problem -1 [print numbers from n to 1(Decresing order)]
// import java.util.*;
// public class RecursionBasics {

//     public static void printDec(int n) {
//         if (n == 1) {
//             System.out.print(1);
//             return;
//         }
//         System.out.print(n + " ");
//         printDec(n-1);

//     }

//     public static void main(String[] args) {
//         int n = 10;
//         printDec(n);
//     }
// }

//--------------------------------------------------------------------------------------------------------------------
//-----------Problem -2 [print numbers from n to 1(Incresing order)]

// import java.util.*;

// public class RecursionBasics {

//     public static void printIncre(int n) {
//         if (n == 1) {
//             System.out.print(n+" ");
//             return;
//         }

//         printIncre(n - 1);
//         System.out.print(n + " ");

//     }

//     public static void main(String[] args) {
//         int n = 10;
//         // printDec(n);
//         printIncre(n);
//     }
// }

//------------------------------------------------------------------------------------------------

//--Problem -3 Print factorial numbers n

// import java.util.*;

// public class RecursionBasics {

//     public static int fact(int n) {

//         if (n == 0) {
//             return 1;
//         }

//         int nm1 = fact(n - 1); // --nm1(n-1)= n
//         int fn = n * fact(n - 1);
//         return fn;
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(fact(n));
//     }
// }

//--------------------------------------------------------------------------------------------
// Problem -4 {Print sum of natural numbers first n}
// import java.util.*;

// public class RecursionBasics {

//     public static int calcSum(int n) {
//         if (n == 1) {
//             return 1;
//         }

//         int snm1 = calcSum(n - 1);
//         int sn = n + snm1;
//         return sn;

//     }

//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(calcSum(n));
//     }
// }

//-------------------------------------------------------------------------------------------

// Problem -5 {Print Nth fibonaci numbers}
// import java.util.*;

// public class RecursionBasics {

//     public static int fibonacci(int n) {
//         if (n == 0 || n == 1) {
//             return n;
//         }
//         int fnm1 = fibonacci(n - 1);
//         int fnm2 = fibonacci(n - 2);
//         int fn = fnm1 + fnm2;
//         return fn;

//     }

//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(fibonacci(n));

//     }
// }

//--------------------------------------------------------------------------------
// //Problem -6 {Check if a given array is sorted or Not}
// import java.util.*;

// public class RecursionBasics {

//     public static boolean isSorted(int arr[], int i) {
//         if (i == arr.length - 1) {
//             return true;
//         }
//         if (arr[i] > arr[i + 1]) {
//             return false;
//         }
//         return isSorted(arr, i + 1);

//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5 };

//         System.out.println(isSorted(arr, 0));

//     }
// }

//-------------------------------------------------------------------------------------------
//Problem -7 {First occurence of an element in an array}}
// import java.util.*;

// public class RecursionBasics {

//     public static int firstOccurence(int arr[], int key ,int i) {
//        if (i==arr.length) {
//         return -1;
//        }
//        if (arr[i]== key) {
//         return i;
//        }

//        return firstOccurence(arr, key, i+1);

//     }

//     public static void main(String[] args) {
//         int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
//         System.out.println(firstOccurence(arr, 5, 0));

//     }
// }

//---------------------------------------------------------------------------------------

//Problem -8 {last occurence of an element in an array}}
// import java.util.*;

// public class RecursionBasics {

//     public static int lastOccurence(int arr[], int key, int i) {
//         if (i == arr.length) {
//             return -1;
//         }
//         int isFound = lastOccurence(arr, key, i + 1);
//         if (isFound == -1 && arr[i] == key) {
//             return i;
//         }

//         return isFound;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
//         System.out.println(lastOccurence(arr, 5, 0));

//     }
// }

//---------------------------------------------------------------------------------
//Problem -9 {print X^N}}   
// import java.util.*;

// public class RecursionBasics {

//     public static int power(int x, int n) {
//         if (n == 0) {
//             return 1;
//         }

//         // int xnm1 = power(x, n - 1);
//         // int xn = x * xnm1;
//         // return xn;
//          return x * power(x, n-1);

//     }

//     public static void main(String[] args) {
//         System.out.println(power(2, 10));

//     }
// }
//--------------------------------------------------------------------------------------------

// Problem -10 {print x^N in O(logN)}{optimized}}   
// import java.util.*;

// public class RecursionBasics {

//     public static int optimizedPower(int a, int n) {
//         // /base case
//         if (n == 0) {
//             return 1;
//         }
//         int halfpower = optimizedPower(a, n / 2);
//         int halfpowersq = halfpower * halfpower;

//         // n is odd

//         if (n % 2 != 0) {
//             halfpowersq = a * halfpowersq;
//         }
//         return halfpowersq;
//     }

//     public static void main(String[] args) {
//         System.out.println(optimizedPower(2, 5));

//     }
// }
// --------------------------------------------------------------------------------------------

//==============================================================================================

// ======={RecursionBasics Part 2}======

// Problem -11 {Tile problem 2*1 vertical or horizontal }}   
// import java.util.*;

// public class RecursionBasics {

//     public static int tileProblem(int n) {
//         // base case
//         if (n == 0 || n == 1) {
//             return 1;
//         }

//         // Work
//         // vertical
//         int fnm1 = tileProblem(n - 1);
//         int fnm2 = tileProblem(n - 2);
//         int totalWays = fnm1 + fnm2;
//         return totalWays;

//     }

//     public static void main(String[] args) {
//         System.out.println(tileProblem(3));

//     }
// }

//-----------------------------------------------------------------------------------------

// // Problem -12 { remove duplicate string}} 
// import java.util.*;

// public class RecursionBasics {

//     public static void removeDuplicates(String str, int idx, boolean[] map, StringBuilder newStr) {
//         // base case
//         if (idx == str.length()) {
//             System.out.println(newStr);
//             return;
//         }
//         // Work
//         char currChar = str.charAt(idx);
//         if (map[currChar - 'a'] == true) {
//             removeDuplicates(str, idx + 1, map, newStr);
//         } else {
//             map[currChar - 'a'] = true;
//             removeDuplicates(str, idx + 1, map, newStr.append(currChar));
//         }

//     }

//     public static void main(String[] args) {
//         String str = "appnnacollege";

//         removeDuplicates(str, 0, new boolean[26], new StringBuilder(""));
//     }
// }

//------------------------------------------------------------------------------------

// // Problem -13 {Friend pairing problem}} 
// import java.util.*;

// public class RecursionBasics {

//     public static int friendPairs(int n) {
//         // base case
//         if (n == 1 || n == 2) {
//             return n;
//         }
//         // single
//         int fnm1 = friendPairs(n - 1);
//         // pair
//         int fnm2 = friendPairs(n - 2);
//         int pairWays = (n - 1) * fnm2;

//         // totalways
//         int totalWays = fnm1 + pairWays;
//         return totalWays;

//     }

//     public static void main(String[] args) {
//         System.out.println(friendPairs(3));
//     }
// }

//--------------------------------------------------------------------------------------

// Problem -14 {print binary strings (0,1)}} 
// import java.util.*;

// public class RecursionBasics {

//     public static void binaryString(int n, int lastPlace, String str) {
//         // base case
//         if (n == 0) {
//             System.out.println(str);
//             return;
//         }

//         // Work
//         binaryString(n - 1, 0, str + "0");
//         if (lastPlace == 0) {
//             binaryString(n - 1, 1, str + "1");
//         }

//     }

//     public static void main(String[] args) {
//         binaryString(3, 0, "");
//     }
// }
