
// // ------------------------------------------------------------------
// // Classe and Objects
// import java.util.*;

// public class OOPS {

//     public static void main(String[] args) {

//         // Pen p1 = new Pen(); // created a object
//         // p1.setColor("blue");
//         // System.out.println(p1.color);
//         // p1.setTip(5);
//         // System.out.println(p1.tip);
//         // p1.color = "yellow";
//         // System.out.println(p1.color);

//         // Access modifier

//         // BankAccount myAcc = new BankAccount();
//         // myAcc.username = "rk";
//         // System.out.println(myAcc.username);
//         // myAcc.setPassword("rakesh");

//         // Copy constructor

//         Student s1 = new Student("rakesh", 123);
//         Student s2 = new Student(s1);
//         System.out.println(s2.name);
//         System.out.println(s2.age);

//     }
// }

// // Copy constructor

// class Student {
//     String name;
//     int age;

//     Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     Student(Student s1) {
//         this.name = s1.name;
//         this.age = s1.age;
//     }

// }

// // class Pen {
// //     String color;
// //     int tip;

// //     void setColor(String newColor) {
// //         color = newColor;
// //     }

// //     void setTip(int newTip) {
// //         tip = newTip;
// //     }
// // }

// // Access modifier

// // class BankAccount {
// //     public String username;
// //     private String password;

// //     void setPassword(String pwd) {
// //         password = pwd;
// //     }
// // }

///-----------{ INHERITANCE }---------------------------------------------

// import java.util.*;

// public class OOPS {

//     public static void main(String[] args) {

//         Fish shark = new Fish();
//         shark.eats();
//         shark.breathes();

//     }
// }

// class Animal {
//     String color;

//     void eats() {
//         System.out.println("Eats");
//     }

//     void breathes() {
//         System.out.println("Breathes");
//     }
// }

// class Fish extends Animal {
//     int fins;

//     void swims() {
//         System.out.println("Swms in water");
//     }
// }

//--------{ Method Overloading & Overriding(Compile time Polymorphism , run time}-------------------------------------------------------------------------
// import java.util.*;

// public class OOPS {

//     public static void main(String[] args) {
//             //Method Overloading
//         Calculator calc = new Calculator();
//         System.out.println(calc.sum(5,15 ));
//         System.out.println(calc.sum((float)5.2,(float)15.7 ));
//         System.out.println(calc.sum(5,15,12 ));

//         //Method Overriding
//         Deer d = new Deer();
//         d.eat();

//     }
// }

// //Method Overriding
// class Animal{
//     void eat(){
//         System.out.println("Eat everything");
//     }
// }

// class Deer{
//     void eat(){
//         System.out.println("eat grasss");
//     }
// }


// //-Method Overloading
// class Calculator {
//     int sum(int a, int b) {
//         return a + b;
//     }

//     float sum(float a, float b) {
//         return a + b;
//     }

//     int sum(int a, int b, int c) {
//         return a + b + c;
//     }
// }


//---------{Interfaces}-------------------------------------------------------------------------

// import java.util.*;

// public class OOPS {

//     public static void main(String[] args) {
//         Queen q = new Queen();
//         q.moves();

//         Rook r = new Rook();
//         r.moves();
//     }
// }

// interface CheesPlayer{
//     void moves();
// }

// class Queen implements CheesPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right,diagnal");
//     }
// }
// class Rook implements CheesPlayer{
//     public void moves(){
//         System.out.println("up down left right");
//     }
// }