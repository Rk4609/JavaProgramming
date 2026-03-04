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

//--------Print SubArrays -----------------------------------------------------------------------------

// import java.util.*;

// public class ArraysPart {

//     public static void printSubArray(int numbers[]){ 
//         int ts=0;
//         for(int i=0; i<numbers.length; i++){
//             int start= i;
//             for(int j=i; j<numbers.length; j++){
//                 int end = j;
//                 for(int k= start; k<=end; k++){
//                      System.out.print(numbers[k]+ " ");
//                 }
//                  ts++;
//                 System.out.println();
//             }
//               System.out.println();
//         }
//         System.out.println("total subarray: "+ts);
//     }
//     public static void main(String[] args) {
//        int numbers[]={2,4,6,8,10};
//        printSubArray(numbers);

//     }

// } 

//----------SubArraysSum- Brute force (concept)----------------------------------------------------

// import java.util.*;

// public class ArraysPart {

//     public static void SubArraysSum(int numbers[]) {
//         int CurrSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < numbers.length; i++) {
//             int start = i;
//             for (int j = i; j < numbers.length; j++) {
//                 int end = j;
//                 CurrSum = 0;
//                 for (int k = start; k <= end; k++) {
//                     CurrSum += numbers[k];
//                 }
//                 System.out.println(CurrSum);
//                 if (maxSum < CurrSum) {
//                     maxSum = CurrSum;
//                 }
//             }
//         }
//         System.out.println("max sum : " + maxSum);
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 1, -2, 6, -1, 3 };
//         SubArraysSum(numbers);
//     }
// }

//-------SubArrays Prefix (optimization)---------------------------------------------------------------------

// import java.util.*;

// public class ArraysPart {

//     public static void SubArraysSum(int numbers[]) {
//         int CurrSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];

//         prefix[0] = numbers[0];
//         // Calculate prefix arraysfor
//         for (int i = 1; i < prefix.length; i++) {
//             prefix[i] = prefix[i - 1] + numbers[i];

//         }
//         for (int i = 0; i < numbers.length; i++) {
//             int start = i;
//             for (int j = i; j < numbers.length; j++) {
//                 int end = j;

//                 CurrSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

//                 if (maxSum < CurrSum) {
//                     maxSum = CurrSum;
//                 }
//             }
//         }
//         System.out.println("max sum is : " + maxSum);
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 1, -2, 6, -1, 3 };
//         SubArraysSum(numbers);
//     }
// }

//--------kadanes subarray-----------------------------------------------------------------

// import java.util.*;

// public class ArraysPart {

//     public static void kadanes(int numbers[]) {
//         // ms-maxSum cs-CurrSum
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for (int i = 0; i < numbers.length; i++) {
//             cs = cs + numbers[i];
//             if (cs < 0) {
//                 cs = 0;
//             }
//             ms = Math.max(cs, ms);
//         }
//         System.out.println("Our max SubArrays  sum is : " + ms);
//     }

//     public static void main(String[] args) {
//         int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
//         kadanes(numbers);
//     }
// }

//--------trappedrain water --------------------------------------------------------------------------------------

// import java.util.*;

// public class ArraysPart {

//     public static int trappedRainater(int height[]) {
//         int n = height.length;
//         // calculate left max boundry
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for (int i = 1; i < n; i++) {
//             leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//         }
//         // calculate right max boundry

//         int rightMax[] = new int[n];
//         rightMax[n - 1] = height[n - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             rightMax[i] = Math.max(height[i], rightMax[i + 1]);
//         }

//         int trappedWater = 0;
//         // loop
//         for (int i = 0; i < n; i++) {
//             // waterLevel= (leftmax bound,rightmax bound)
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);
//             // trapped = waterLevel- height[i]
//             trappedWater += waterLevel - height[i];
//         }
//         return trappedWater;

//     }

//     public static void main(String[] args) {
//         int height[] = { 4, 2, 0, 6, 3, 2, 5 };
//         System.out.println(trappedRainater(height));
//     }
// }


//-------constraintsDuplicate check Arrays Assignment questions-----------------------------------------------------------------------------------------------------------

// import java.util.*;

// public class ArraysPart {

//     public static boolean constraintsDuplicate(int num[]){
//         for(int i=0; i<num.length-1; i++){
//             for(int j=i+1; j<num.length; j++){
//                 if (num[i]==num[j]) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//  public static void main(String[] args) {
//     int num[]={1,2,3,4,6,8,9,1};
//        System.out.println( constraintsDuplicate(num));

// }
// }

//---------2. question binary seach --------------------------------------------------------------------------------

// import java.util.*;

// public class ArraysPart {
//     public static int BinarySearch(int nums[],int target){
//         int start=0;
//         int end = nums.length-1;

//         while (start <=end) {
//             int mid = start + (end - start) / 2;

//             //target Found

//             if (nums[mid] == target) {
//                 return mid;
//             }
//             //check it left half is sorted

//             if (nums[start] <= nums[mid]) {
//                 if (nums[start] <= target && target < nums[mid]) {
//                     end = mid-1;
//                 }
//                 else{
//                     start = mid+1;
//                 }
//             }
//             else{
//                 //otherwise right half sorted

//                 if (nums[mid] < target && target <= nums[end]) {
//                     start = mid +1;
//                 }else{
//                     end
//                     = mid-1;
//                 }
//             }
//         }
//         // target is not Found  
//         return -1;
//     }


// public static void main(String[] args) {
//     int nums[]={4,5,6,7,0,1,2};
//     System.out.println(BinarySearch(nums,0));
//     System.out.println(BinarySearch(nums,3));

// }

// }

//---3.buy sell stock prices-------------------------------------------------------------------------------------------


// import java.util.*;

// public class ArraysPart {

//     public static int maxProfit(int prices[]){
//          int buy=prices[0];
//          int profit=0;

//          for(int i=1; i<prices.length; i++){
//             if (buy< prices[i]) {
//                 profit = Math.max(prices[i]- buy, profit);
//             }
//             else{
//                 buy=prices[i];
//             }
//          }
//          return profit;
//     }

//  public static void main(String[] args) {
//     int prices[]={7,1,5,3,6,4};
//     System.out.println(maxProfit(prices));
//  }
// }  

