
// // import java.util;
// import java.io.*;

// class Demo {

//     // private int x;
//     private int x;
//     public int y, z;
//     public void set_x(int val){ //Setter function
//         x=val;
//     }
//     public void get_x(){ //getter function
//         System.out.println(x);
//     }
//     public int get_val(){
//         return x;
//     }

//     void fun() {
//         System.out.println("Fun Fun Fun");
//     }
// }

// public class oops {
//     public static void main(String args[]) {
//         Demo obj = new Demo();
//         // obj.x = 12;
//         obj.set_x(12); //setter function
//         obj.y = 13;
//         obj.z = 14;
//         int valx=obj.get_val();
//         // System.out.println(obj.x);
//         obj.get_x(); //getter function
//         System.out.println(obj.y);
//         System.out.println(obj.z);
//         obj.fun();

//     }
// }

// import java.util.*;
/*package whatever //do not write package name here */

import java.io.*;
// class Car {
//     public int wheel ;
//     public String color;
//     public int price;
//     public void breakFunction(){
//         System.out.println("i am breaking system");
//     }
// }
// class SuperCar extends Car{
//     String MusicSystem;
//     public void power(){
//         System.out.println("i am power function for supercar");
//     }
// }
// class SimpleCar extends Car{
//     int airbag;
//     void safety(){
//         System.out.println("i am safety function in simple car");
//     }
// }
// class oops {

// 	public static void main (String[] args) {
//      SuperCar s1 = new SuperCar();
//      SimpleCar s2 = new SimpleCar();

// 	}
// }
// class parent{
//     public int x;
//     public int y;
// }
// class child extends parent{
//     public int z;
// }

// class grandchild extends child{
//     public int w;

// }
// /**
//  * oops
//  */
// public class oops {

//     public static void main(String args[]){
//         grandchild obj=new grandchild();
//     obj.x=12;
//     obj.x=13;
//     obj.x=14;
//     obj.x=15;
// // System.err.println("hello world");
//     }
// }
// class  Base{
//     public int val1;
//     public int val2;
//     public void fun(){
//  System.out.println("I am base class function");
//     }
// }
// class child1 extends Base{
//     public int val3;
//     public int val4;

// }
// public class oops {
//     public static void main(String args[]) {
//         public int val5;
//         public void fun2(){

//         }

//     }

// }

import java.util.*;
/**
 * oops
 */
class Base{
    public int val1;
    public int val2;
    Base(int x,int y){
        val1=x;
        val2=y;
    }
    Base(){
        System.out.println("Base class constructor");
    }
}
class child extends Base{
    public int val3;
    child(){
        super(2,3);
        System.out.println("child class constructor");
    }
}
public class oops {
    public static void main(String args[]){
        child c1= new child();
        System.out.println(c1.val1+" "+c1.val2);
    }

    
}