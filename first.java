// import java.util.Scanner;

// public class first {

//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         int n=scan.nextInt();
//         String s=scan.nextLine();
//         if(s=="Male"){
//             if(n>=18&&n<=30){
//                 System.out.println("You can vote");
//             }
//             else{
//                 System.out.println("Sorry but you cant't vote");
//             }
//         }
//         else{
//             if(s=="Female"&&n>15){
//                 System.out.println(" you can vote vote");
//             }
//             else{
//                 System.out.println("You can't vote");
//             }
//         }
        
//     }
// }

import java.util.Scanner;

public class first {

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int count=1;
        for(int i=0;i<n;i++){
            arr[i]+=count;
            System.out.println(arr[i]);
            count++;

        }
        
        
    }
}