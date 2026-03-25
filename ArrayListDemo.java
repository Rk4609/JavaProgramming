// // import java.util.*;

// // public class ArrayListDemo {
// //     public static void main(String[] args) {
// //         ArrayList<Integer> list = new ArrayList<>();
// //         ArrayList<String> list2 = new ArrayList<>();
// //         ArrayList<Boolean> list3 = new ArrayList<>();

// //         // add operations
// //         list.add(1);
// //         list.add(2);
// //         list.add(3);
// //         list.add(4);
// //         list.add(5);
// //         list.add(1, 12);
// //         // get operations -- O(1)
// //         // int a = list.get(2);
// //         // remove operations--O(n)
// //         // int b = list.remove(2);
// //         // update operations--O(n)
// //         // int c = list.set(2, 8);
// //         // contains operations
// //         // boolean d = list.contains(12);

// //         // System.out.println(a);
// //         // System.out.println(b);
// //         // System.out.println(c);
// //         // System.out.println(d);
// //         System.out.println(list);
// //     }
// // }

// //-----{size of ArrayList}---------------------------------------------------------------------------

// import java.util.*;

// public class ArrayListDemo {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         // add operations
//         list.add(5);
//         list.add(3);
//         list.add(9);
//         list.add(6);
//         list.add(8);

//         System.out.println(list.size());

//         // iteration ArrayList -12345
//         // for(int i=0; i<list.size(); i++){
//         // System.out.print(list.get(i)+ " ");
//         // }
//         // System.out.println();

//         // / iteration ArrayList -54321
//         // for(int i= list.size()-1; i>=0; i--){
//         // System.out.print(list.get(i)+" ");
//         // } System.out.println();

//         //-----------find maximum in ArrayList
//         // int max = Integer.MIN_VALUE;
//         // for(int i=0; i<list.size(); i++){
//         //     max = Math.max(max, list.get(i));
//         // }
//         // System.out.println("maximum number = "+ max);

//     }

// }
//-------------------------------------------
//{swap 2 number arraylist}

// import java.util.*;

// public class ArrayListDemo {
//     public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
//         int temp = list.get(idx1);
//         list.set(idx1, list.get(idx2));
//         list.set(idx2, temp);
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         // add operations
//         list.add(5);
//         list.add(3);
//         list.add(9);
//         list.add(6);
//         list.add(8);

//         int idx1 = 1, idx2 = 3;
//         System.out.println(list);
//         swap(list,idx1,idx2);
//         System.out.println(list);
//     }
// }
//---------{Sorting an ArrayList-Collections//Ascending and descending}---------------------------------------------------------------------
// import java.util.*;
// public class ArrayListDemo {
//         public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         // add operations
//         list.add(5);
//         list.add(3);
//         list.add(9);
//         list.add(6);
//         list.add(8);
//         System.out.println(list);

//         //Ascending order
//         Collections.sort(list);
//         System.out.println(list);

//         //descending order
//         Collections.sort(list,Collections.reverseOrder());
//         System.out.println(list);
//     }
// }

//-------------{ Multi dimentional aaray to main array to add other arrays} ------------------------------------------------------------------
// import java.util.*;

// public class ArrayListDemo {
//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         ArrayList<Integer> list3 = new ArrayList<>();

//         for (int i = 1; i <= 5; i++) {
//             list.add(i * 1);
//             list2.add(i * 2);
//             list3.add(i * 3);
//         }

//         mainList.add(list);
//         mainList.add(list2);
//         mainList.add(list3);
//         System.out.println(mainList);

//         // nestded loops for print List
//         for (int i = 0; i < mainList.size(); i++) {
//             ArrayList<Integer> currList = mainList.get(i);
//             for (int j = 0; j < currList.size(); j++) {
//                 System.out.print(currList.get(j) + " ");
//             }
//             System.out.println();
//         }

//     }
// }

//--------------------------------------------------------------------------
//--{pair sum 2 numbers to value 5===brute force approach}
// import java.util.*;

// public class ArrayListDemo {
//     public static boolean pairSum(ArrayList<Integer> list, int target) {
//         for (int i = 0; i < list.size(); i++) {
//             for (int j = i + 1; j < list.size(); j++) {
//                 if (list.get(i) + list.get(j) == target) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);

//         int target = 5;
//         System.out.println(pairSum(list, target));

//     }

// }
