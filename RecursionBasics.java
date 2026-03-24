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

//----------------------------------------------------------------------------------------
// 24. {divide and Conquer}

// import java.util.*;

// public class RecursionBasics {

//     public static void printArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void mergeSort(int arr[], int si, int ei) {
//         if (si >= ei) {
//             return;
//         }
//         // Work
//         int mid = si + (ei - si) / 2; // (si+ei)/2
//         mergeSort(arr, si, mid);// left part
//         mergeSort(arr, mid + 1, ei); // right part
//         merge(arr, si, mid, ei);
//     }

//     public static void merge(int arr[], int si, int mid, int ei) {
//         int temp[] = new int[ei - si + 1];
//         int i = si; // iteration of left
//         int j = mid + 1; // iteration of right
//         int k = 0; // iteration of temp arr

//         while (i <= mid && j <= ei) {
//             if (arr[i] < arr[j]) {
//                 temp[k] = arr[i];
//                 i++;
//             } else {
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }
//         // left part
//         while (i <= mid) {
//             temp[k++] = arr[i++];
//         }

//         // right part
//         while (j <= ei) {
//             temp[k++] = arr[j++];
//         }

//         // Copy temp to Original array
//         for (k = 0, i = si; k < temp.length; k++, i++) {
//             arr[i] = temp[k];
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 6, 3, 9, 5, 2, 8 };
//         mergeSort(arr, 0, arr.length - 1);
//         printArr(arr);
//     }
// }

// ---------------------------------------------------------------------------------------------------

//---{Quick sort }-------------------------------------------------------------------------------------

// import java.util.*;

// public class RecursionBasics {

//     public static void printArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void quickSort(int arr[], int si, int ei) {
//         if (si >= ei) {
//             return;
//         }
//         // last element
//         int pIdx = partition(arr, si, ei);
//         quickSort(arr, si, pIdx - 1);// left part
//         quickSort(arr, pIdx + 1, ei);// right

//     }

//     public static int partition(int arr[], int si, int ei) {
//         int pivot = arr[ei];
//         int i = si - 1;

//         for (int j = si; j < ei; j++) {
//             if (arr[j] <= pivot) {
//                 i++;
//                 // swap
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }
//         }
//         i++;
//         int temp = pivot;
//         arr[ei] = arr[i];
//         arr[i] = temp;
//         return i;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 3, 2, 9, 8, 6, 5 };
//         quickSort(arr, 0, arr.length - 1);
//         printArr(arr);
//     }
// }

//-------{Search in rotated sorted array}-----------------------------------------------------------------------------------

// import java.util.*;

// public class RecursionBasics {

//     public static int search(int arr[], int target) {
//         int si = 0;
//         int ei = arr.length - 1;

//         while (si <= ei) {
//             int mid = si + (ei - si) / 2;

//             if (arr[mid] == target) {
//                 return mid;
//             }

//             // left sorted
//             if (arr[si] <= arr[mid]) {
//                 if (arr[si] <= target && target < arr[mid]) {
//                     ei = mid - 1;
//                 } else {
//                     si = mid + 1;
//                 }
//             }

//             // right sorted
//             else {
//                 if (arr[mid] < target && target <= arr[ei]) {
//                     si = mid + 1;
//                 } else {
//                     ei = mid - 1;
//                 }
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
//         int target = 1;
//         int idx = search(arr, target);
//         System.out.println(idx);

//     }
// }

// ------------------------------------------------------------------------------------------

// --{1.Practice questions --:Apply Mergesort to sort an array of Strings.(Assume that all the characters in all the Strings are in lowercase). (EASY}
// import java.util.*;

// public class RecursionBasics {
//     public static void printArr(String arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void mergeSort(String arr[], int si, int ei) {
//         if (si >= ei) {
//             return;
//         }
//         // mid
//         int mid = si + (ei - si) / 2;
//         // left sort
//         mergeSort(arr, si, mid);
//         // right sort
//         mergeSort(arr, si + 1, ei);
//         // merge
//         merge(arr, si, mid, ei);
//     }

//     public static void merge(String arr[], int si, int mid, int ei) {
//         String temp[] = new String[ei - si + 1];

//         int i = si; // left pointer
//         int j = mid + 1; // right pointer
//         int k = 0; // temp array

//         while (i <= mid && j <= ei) {
//             if (arr[i].compareTo(arr[j]) < 0) {
//                 temp[k] = arr[i];
//                 i++;
//             } else {
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }

//         // remaining left
//         while (i <= mid) {
//             temp[k++] = arr[i++];
//         }
//         // remaining right
//         while (j <= ei) {
//             temp[k++] = arr[j++];
//         }

//         // copy arr to original array
//         for (k = 0, i = si; k < temp.length; k++, i++) {
//             arr[i] = temp[k];
//         }

//     }

//     public static void main(String[] args) {
//         String arr[] = { "sun", "earth", "mars", "mercury" };
//         mergeSort(arr, 0, arr.length - 1);
//         printArr(arr);

//     }
// }
