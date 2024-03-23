import java.util.*;

public class second {
    public static void main(String args[]) {
        // String str="hello how are you?";
        // String str2=str.toUpperCase();
        // // System.out.println(str);
        // // System.out.println(str2);
        // System.out.println(str.indexOf("pow"));
        // // System.out.println(str2);

        // String str="hello this is\\"rahul\"and\"sanjay\"";
        // System.out.println(str);
        // break and continue
        // Scanner scan = new Scanner(System.in);

        // int x = 5;
        // int i = 1;
        // for (; i < 10; i++) {
        // System.out.println(i * x);
        // if (i == 5) {
        // break;

        // }
        // i++;

        // }
        // System.out.println(i);
        // int x=5;
        // int i=1;
        // for(;i<4;i++){
        // System.out.println(i);
        // if(i==2){
        // continue;
        // System.out.println("hello");
        // }
        // System.out.println(i);

        // }
        // System.out.println(i);
        int arr[] = { 23, 24, 43, 55, 23, 76, 88, 99 };
        // String str[]={"mohit","rahul","Sanjay","amit"};
        int count = 0;

        for (int i = 0; i < 8; i++) {

            count += arr[i];
            count++;
        }
        System.err.println(count);

    }
}
