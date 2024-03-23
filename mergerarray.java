// // package Question;

// /*package whatever //do not write package name here */

// import java.io.*;
// import java.util.*;

// class mergerarray {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);

//         int arr1[] = { 3, 5, 6, 8, 12, 14 };
//         int arr2[] = { 2, 6, 7, 12, 15, 18, 21, 22 };
//         int n1 = arr1.length;
//         int n2 = arr2.length;
//         int n = arr1.length + arr2.length;
//         int[] arr3 = new int[n];
//         int i = 0;
//         int j = 0;
//         int k = 0;
//         while (i < n1 && j < n2) {
//             if (arr1[i] < arr2[j]) {
//                 arr3[k] = arr1[i];
//                 i++;
//                 k++;
//             } else {
//                 arr3[k] = arr2[j];
//                 j++;
//                 k++;
//             }
//         }
//         if (i < n1) {
//             while (i < n1) {
//                 arr3[k] = arr1[i];
//                 k++;
//                 i++;
//             }
//         }
//         if (j < n2) {
//             while (j < n2) {
//                 arr3[k] = arr2[j];
//                 k++;
//                 j++;
//             }
//         }
//         for (i = 0; i < n; i++) {
//             System.out.print(arr3[i] + " ");
//         }
//     }
// }

import java.util.*;

// class mergearray {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);

//         int arr1[] = { 3, 5, 6, 8, 12, 14 };
//         int arr2[] = { 2, 6, 7, 12, 15, 18, 21, 22 };
//         int n1 = arr1.length;
//         int n2 = arr2.length;
//         int n = arr1.length + arr2.length;
//         int[] arr3 = new int[n];
//         int i = n1 - 1;
//         int j = n2 - 1;
//         int k = 0;
//         while (i >= 0 && j >= 0) {
//             if (arr1[i] > arr2[j]) {
//                 arr3[k] = arr1[i];
//                 i--;
//                 k++;
//             } else {
//                 arr3[k] = arr2[j];
//                 j--;
//                 k++;
//             }
//         }
//         while (i >= 0) {
//             arr3[k] = arr1[i];
//             k++;
//             i--;
//         }
//         while (j >= 0) {
//             arr3[k] = arr2[j];
//             k++;
//             j--;
//         }
//         // Printing the merged array in descending order
//         for (i = n - 1; i >= 0; i--) {
//             System.out.print(arr3[i] + " ");
//         }
//     }
// }
import java.util.*;
public class mergerarray {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr1[] = { 3, 5, 6, 8, 12, 14 };
        int arr2[] = { 2, 6, 7, 12, 15, 18, 21, 22 };
        int n1 = arr1.length;
        int n2 = arr2.length;
        int leftMax = arr1[0];
        int rightMax = arr2[n2 - 1];
        
        // Find the left maximum in the first array
        for (int i = 1; i < n1; i++) {
            leftMax = Math.max(leftMax, arr1[i]);
        }
        
        // Find the right maximum in the second array
        for (int i = n2 - 2; i >= 0; i--) {
            rightMax = Math.max(rightMax, arr2[i]);
        }
        
        System.out.println("Left maximum from the first array: " + leftMax);
        System.out.println("Right maximum from the second array: " + rightMax);
    }
}

