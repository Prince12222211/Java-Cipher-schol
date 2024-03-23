// import java.util.*;

// public class practice {

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scan.nextInt();
//         }
//         System.out.println("Enter the element you want to find");
//         int m = scan.nextInt();
//         boolean found=true;
//         for (int i = 0; i < n; i++) {
//             if(arr[i]==m){
//                 System.err.println("Element found in this array "+ i);
//                 found =true;
//                 break;
//             }

//         }
//         if(!found){
//             System.out.println("Elements not found ");
//         }

//     }
// }

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

// public class practice {

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int m = scan.nextInt();
//         int arr[][] = new int[n][m];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 arr[i][j] = scan.nextInt();

//             }

//         }
//         System.out.println("Enter the finding element you want: ");
//         int z = scan.nextInt();
//         boolean isFound = true;
//         // System.out.println("The elements are in the array is: ");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (arr[i][j] == m) {
//                     System.out.println("Element is found in the index at :" + i+j);
//                     isFound = true;
//                 }

//             }

//         }
//         if(!isFound){
//             System.out.println("Element not in the array");
//         }
//     }
// }

// public class practice {

//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         String str=scan.nextLine();
//         StringBuilder sb=new StringBuilder(str);
//         // System.out.println(sb);
//         System.out.println(sb.charAt(0));
//         // System.out.println(sb.setCharAt(0,'r'));
//         // sb.setCharAt(0,'r');
//         sb.insert(0, 'r');
//         System.out.println(sb);
//         sb.delete(0,1 );
//         System.out.println(sb);
//         sb.append(" verma");
//         System.out.println(sb);
//         System.out.println(sb.length());
//         for(int i=0;i<sb.length()/2;i++)
//     {
//         int front=i;
//         int back=sb.length()-1-i;
//         char frontChar=sb.charAt(front);
//         char backChar=sb.charAt(back);
//         sb.setCharAt(front, backChar);
//         sb.setCharAt(back, frontChar);

//     }
//     System.out.println(sb);

//     }
// }

// class Shape{
//     public void Areas(){
//         System.out.println("The area of the shape");
//     }
// }
// class Triangle extends Shape{
// public void Areas(int h, int l){
//     System.out.println((1.0/2)*h*l);

// }
// }
// public class practice {
//     public static void main(String args[]){
//         Triangle t1=new Triangle();
//         t1.Areas(45,5);
//     }

// }

// class Pen{
//     String color;
//     String type;
//     public void WriteSomething(){
//         System.out.println("Writing Something0");
//     }
//     public void printClr(){
//         System.out.println(this.color);
//     }
//     public void printType(){
//         System.out.println(this.type);
//     }
// }

// public class practice {
//     public static void main(String args[]){
//         Pen p1=new Pen();
//         // p1.printClr("Blue");
//         p1.color="blue";
//         p1.type="Gel";
//         // p1.color();
//         // p1.type();
//         p1.printClr();
//         p1.printType();

//     }

// }

// enum Week{
//     sun,mon,tue,wed,thurs,frid,sat;
// }
// public class practice{

//     public static void main(String args[]){
//         Week day1=Week.sun;
//         Week day2=Week.mon;
//         Week day3=Week.tue;
//         Week day4=Week.wed;
//         Week day5=Week.thurs;
//         Week day6=Week.frid;
//         Week day7=Week.sat;
//         System.out.println(day1);
//     }
// }

// class Student{
//     String name;
//     int age;
//     Student(String name, int age){
//         this.name=name;
//         this.age=age;
//     }
//     public void printInf(){
//         System.out.println(name);
//         System.out.println(age);
//     }
//     Student(Student s2){
//         this.name=s2.name;
//         this.age=s2.age;
//     }
// }
/**
 * practice
 */
// public class practice {

// public static void main(String args[]){
// // Student s1=new Stude
// Student s1=new Student("Prince", 20);
// s1.printInf();
// Student s2=new Student(s1);
// s2.printInf();

// }
// }

// public class practice {
// public void printInfo( int... x){
// for(int i:x){
// System.out.println(x);
// }
// }
// public static void main(String args[]){
// // printInfo(23,34,234,234,234);

// }

// }

// public class practice {
// public static void main(String args[]){
// Scanner scan=new Scanner(System.in);
// int n=scan.nextInt();
// int fact=1;

// for(int i=1;i<=n;i++){
// fact=fact*i;
// }
// System.out.println(fact);
// }

// }

public class practice {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a+" ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

}