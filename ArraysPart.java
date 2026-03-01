// import java.util.*;

// public class ArraysPart {

//  public static void main(String[] args) {
//     int marks[]= new int[50];

//     Scanner sc = new Scanner(System.in);
//     marks[0]= sc.nextInt();
//     marks[1]=sc.nextInt();
//     marks[2]=sc.nextInt();

//     System.out.println("phy : " + marks[0]);
//     System.out.println("che : " + marks[1]);
//     System.out.println("bio : " + marks[2]);

//     int percentage = (marks[0]+marks[1]+marks[2]) / 3;
//     System.out.println("percentage : "+percentage);

//     }
// }

//-----------------------------------------------------------------------------------------
//Arrays passing as argument -reference

// import java.util.*;

// public class ArraysPart {

//     public static void update(int marks[]) {
//         for (int i = 0; i < marks.length; i++) {
//             marks[i] = marks[i] + 1;
//         }
//     }

//     public static void main(String[] args) {
//         int marks[] = { 97, 98, 99 };
//         update(marks);

//         for (int i = 0; i < marks.length; i++) {
//             System.out.println(marks[i] + " ");
//         }
//         System.out.println();

//     }
// }

//---------- LinearSearch --------------------------------------------------------------------------

// import java.util.*;

// public class ArraysPart {

//     public static int LinearSearch(int numbers[], int key) {
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
//         int key = 16;

//         int index = LinearSearch(numbers, key);
//         if (index == -1) {
//             System.out.println("Not Found");
//         } else {
//             System.out.println(" Key is at index : " + index);
//         }
//     }
// }

//---------Largest Number Search----------------------------------------------------------------------------------------

// import java.util.*;

// public class ArraysPart {

//     public static int getLargest(int numbers[]){
//          int largest = Integer.MIN_VALUE;
//          int smallest= Integer.MAX_VALUE;
//         for(int i=0; i<numbers.length; i++){
//             if (largest < numbers[i]) {
//                 largest= numbers[i];
//             }
//             if (smallest > numbers[i]) {
//                 smallest=numbers[i];
//             }
//         }
//           System.out.println("Smallest value is : " + smallest);
//             return largest;
//     }
//     public static void main(String[]args){
//         int numbers[]={2,4,3,5,7,9,19,45};

//         System.out.println("largest value is : "+ getLargest(numbers));

//     }
// }

//--------Arrays reverse------------------------------------------------------------------------------------------------------
// import java.util.*;

// public class ArraysPart {

//     public static void Reverse(int numbers[]) {
//         int first = 0;
//         int last = numbers.length - 1;

//         while (first < last) {
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;

//             first++;
//             last--;
//         }
//     }

//     public static void main(String[] args) {

//         int numbers[] = { 2, 4, 6, 8, 10,12,14,16,17 };
//         Reverse(numbers);
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.print(numbers[i] + " ");
//         }
//         System.out.println();

//     }
// }

//-------------PrintPais of arrays--------------------------------------------------------------------

// import java.util.*;

// public class ArraysPart {

//     public static void printPairs(int numbers[]) {
//         int tp = 0;
//         for (int i = 0; i < numbers.length; i++) {
//             int curr = numbers[i]; /// 2,4,6,8,10,12
//             for (int j = i + 1; j < numbers.length; j++) {
//                 System.out.print("(" + curr + "," + numbers[j] + ")");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("total numbers of pais :" + tp);
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2, 4, 6, 8, 10 };
//         printPairs(numbers);
//     }
// }


//-------------------------------------------------------------------------------------

import java.util.*;

public class ArraysPart {

    public static void main(String[] args) {
        
    }

}