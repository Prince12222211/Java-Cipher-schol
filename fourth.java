// import java.util.Scanner;

// public class fourth {

//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int m=scan.nextInt();
//         int arr[][]=new int[n][m];
//         for(int i=0;i<n;i++){
//           for(int j=0;j<m;j++){
//             arr[i][j]=scan.nextInt();
//           }

//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 for(int k=i+1;k<n;k++){
//                     for(int l=0;l<m;l++){
//                         if(arr[i][j]==arr[k][l]){
//                             System.out.println(arr[i][j]);
//                         }
//                     }
//                 }
//             }
//         }
//     }
// }

//Second method to find the duplicate in the 2-D array
import java.util.Scanner;

public class fourth {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }

        }
        int max = 13;
        int mat[] = new int[max + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = i + 1; k < n; k++) {
                    mat[arr[i][j]] = mat[arr[i][j]] + 1;

                }
            }

        }
        for (int i = 0; i < mat.length; i++) {
            if (mat[i] > 1) {
                System.out.println(i);
            }
        }

    }
}
