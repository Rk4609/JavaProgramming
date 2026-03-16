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

//--Print factorial numbers n

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
//  {Print sum of natural numbers first n}
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