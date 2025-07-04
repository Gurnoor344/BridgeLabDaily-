package src;

//public class TA3 {
//    public static void main(String[] args) {
//        int[] arr ={2,7,9,11};
//        int target=9;
//        // int sum=0;
//        int i;
//        int j;
//        for( i=0;i<arr.length;i++){
//            for( j=i+1;j<arr.length-1;j++){
//                if(arr[i]+arr[j]==target){
//                    System.out.println(i+" "+j);
//                    // return arr[]{i,j};
//
//
//                    // num[k++]=i;
//                    //num[k++]=j;
//                    //return num;
//                }
//            }
//        }
//    }
//}


import java.util.Scanner;

public class TA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int temp = sc.nextInt();
        if (temp >= 40) {
            System.out.println("hot");
        }else if(temp <=30 && temp >=40){
            System.out.println("normal");
        }
        else if (temp <= 20) {
            System.out.println("cool");
        }
    }
}
