// enum Salmaan{
//     karan,radhe,amit,rahul,ajay;
// }

// public class enum1 {
//     public static void main(String args[]){
//         Salmaan actor1=Salmaan.amit;
//         Salmaan actor2=Salmaan.radhe;
//         Salmaan actor3=Salmaan.amit;
//         Salmaan actor4=Salmaan.rahul;
//         Salmaan actor5=Salmaan.ajay;
//         System.out.println(actor1);
//         System.out.println(actor2);
//         System.out.println(actor3);
//         System.out.println(actor4);
//         System.out.println(actor5);

//     }

// }

// enum week{
//     sunday,monday,tuesday,wednesday,thursday,friday, saturday
// }
// /**
//  * enum1
//  */
// public class enum1 {

//     public static void main(String args[]){
//         week day1=week.sunday;
//     }
// }

/**
 * enum1
 */

// class enum1 {
// static void fun(int... x){
// System.out.println(x.length);
// }
// public void main(String args[]){
//     fun(1,2,30,34,34);
// }

// }

// import java.util.Scanner;

import java.util.Scanner;

/**
 * enum1
 */
// import java.util.*;

// public class enum1 {
//     public static void determineZodiacSign(int month, int day){
//         String zodiacSign;
//         switch(month){
//             case 1:
//             if(day<=19)
//             System.out.println("Capricorn");
//             else{
//                 System.out.println("Aquarius");
//             }
//             break;
//             case 2:
//             if(day<=18){
//             System.out.println("Aquarius");
//             }
//             else{
//                 System.out.println("Pisces");
//             }
//             break;
//             case 3:
//             if(day<=20){
//             System.out.println("pisces");
//             }
//             else{
//                 System.out.println("Aries");
//             }
//             break;
//             case 4:
//             if(day<=19){
//             System.out.println("Aries");
//             }
//             else{
//                 System.out.println("Tarus");
//             }
//             break;
//             case 5:
//             if(day<=20){
//             System.out.println("taurus");
//             }
//             else{
//                 System.out.println("Gemini");

//             }
//             break;
//             case 6:
//             if(day<=20){
//             System.out.println("Gemini");
//             }
//             else{
//                 System.out.println("cancer");
//             }
//             break;
//             case 7:
//             if(day<=22){
//             System.out.println("Cancer");
//             }
//             else{
//                 System.out.println("Leo");
//             }
//             break;
//             case 8:
//             if(day<=22){
//             System.out.println("Leo");
//             }
//             else{
//                 System.out.println("Virgo");
//             }
//             break;
//             case 9:
//             if(day<=23){
//             System.out.println("Virgo");
//             }
//             else{
//                 System.out.println("Libra");
//             }
//             break;
//             case 10:
//             if(day<=22){
//             System.out.println("Librea");
//             }
//             else{
//                 System.out.println("Scorpio");
//             }
//             break;
//             case 11:
//             if(day<=21){
//             System.out.println("Scorpio");
//             }
//             else{
//                 System.out.println("sagi");
//             }
//             break;
//             case 12:
//             if(day<=21){
//             System.out.println("Sagittarius");
//             }
//             else{
//                 System.out.println("Capricorn");
//             }
//             break;
//         }
//     }

//     public static void main(String args[]){
//         Scanner scanner =new Scanner(System.in);
//         System.out.println("Enter the birth month(1 to 12): ");
//         int month=scanner.nextInt();
//         System.out.println("Enter the nnirth day: ");
//         int day =scanner.nextInt();
//         determineZodiacSign(month, day);

//     }
// }

// public class enum1 {
//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         // int n=Integer.parseInt(args[0]);
//         int n=scan.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=scan.nextInt();

//         }
//         int m=scan.nextInt();
//         // int[] arr1=new int[n];
//         for(int i=0;i<n;i++){
//     //  arr1[]=m*arr[i];
//             System.out.print(m*(arr[i])+" ");
//         }
//     }

// }

/**
 * enum1
 */
public class enum1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
           for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
           }
           int count=0;
           int sum=0;
           for(int i=0;i<=n;i++){
            System.out.println(arr[i]);
            sum=sum+i;
            count++;

           }
           System.out.println(sum);
           System.out.print("the total number of the element in the array is:"+count);
         


           
    }
}


