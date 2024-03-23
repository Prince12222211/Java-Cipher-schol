import java.util.Scanner;

public class task {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();

        }
        System.out.println("Enter the element you want to search in the array");
        int x = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            if (arr[i] == x) {
                System.out.println("Elements is present in the array in the index is " + i);
                break;
            } 
            else{
                System.out.println("Elements are not present in the array");
                break;
            }

            }
          


        }
    }
