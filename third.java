// import java.util.Scanner;

// public class third {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scan.nextInt();
//         }
//         for (int i = 0; i < n; i++) {
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     System.out.println(arr[i]);
//                 }
//             }
//         }
//     }
// }

import java.util.Scanner;

public class third {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int sum=scan.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("yes");
                    flag=1;

                }

            }
        }
        if(flag==1){
            System.out.println();
        }
    }
}