// import java.util.Scanner;

// public class arjunbhiaya {
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int i = 2;
//         while (i <= n) {
//             int count = 0;

//             while (n % i == 0) {
//                 count += i;
//                 System.out.println(count);

//             }

//         }

//     }
// }

// import java.util.Scanner;

// public class arjunbhiaya {

//     public static void main(String args[]) {
//         Scanner scan=new Scanner(System.in);

//     }
// }

import java.util.*;

public class arjunbhiaya {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int product = 1;
        int i = 0;
        while (n > 0) {
            arr[i] = scan.nextInt();
            n--;
            i++;

        }

        System.out.print("Enter the power");
        int m = scan.nextInt();
        int sum = 0;

        while (n > 0) {

            // int product=arr[i]*arr[i];
            // int product=arr[i]*arr[i];
            // product=arr[i]*arr[i];
            product = (int) Math.pow(arr[i], m);
            System.out.print(product + " ");
            sum = sum + product;
            sum++;
            i++;
            n--;
        }
        System.out.println("The sum of the element is: " + sum);

    }
}