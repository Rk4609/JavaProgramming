// import java.util.*;
// public class Backtracking {

//     public static void changeArr(int arr[],int i,int val){
//            //base case
//            if (i == arr.length) {
//               printArr(arr);
//               return;
//            }

//            //recursion work

//            arr[i] = val;
//            changeArr(arr, i+1, val+1);
//            arr[i]= arr[i]-2;
//     }

//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[]args){
//         int arr[]= new int[5];
//          changeArr(arr, 0, 1);
//          printArr(arr);

//     }
// }

//------------------------------------------------------
//--------{abc,----subsets backtracking}
// import java.util.*;
// public class Backtracking {

//     public static void findSubsets(String str, String ans, int i){
//         //base case 
//         if (i == str.length()) {
//             if(ans.length()== 0) {
//                 System.out.println("null");
//             }
//             else{
//                 System.out.println(ans);
//             }
//             return;
//         }
//         //yes choice{include}
//         findSubsets(str, ans+str.charAt(i), i+1);
//         //no -{exclude}
//         findSubsets(str, ans, i+1);
//     }
//  public static void main(String[]args){ 
//     String str = "abcdefg";
//     findSubsets(str, "", 0);
//  }
// }

//-------{1,2,3 subsets-----------------------------------------------------------------------------------
// import java.util.*;

// public class Backtracking {

//     public static void findSubsets(int arr[], int i, List<Integer> list) {
//         // base case
//         if (i == arr.length) {
//             System.out.println(list);
//             return;

//         }
//         // include
//         list.add(arr[i]);
//         findSubsets(arr, i + 1, list);
//         // backtracking remove
//         list.remove(list.size() - 1);
//         // exclude
//         findSubsets(arr, i + 1, list);

//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3 };
//         findSubsets(arr, 0, new ArrayList<>());
//     }
// }

//------------------------------------------------

// import java.util.*;

// public class Backtracking {
//     public static void findPermutations(String str, String ans) {

//         // base case
//         if (str.length() == 0) {
//             System.out.println(ans);
//             return;
//         }
//         // recursion
//         for (int i = 0; i < str.length(); i++) {
//             char curr = str.charAt(i);
//             String NewStr = str.substring(0, i) + str.substring(i + 1);
//             findPermutations(NewStr, ans + curr);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         findPermutations(str, "");
//     }
// }