package src;

//FIND MAXIMUM IN AN ARRAY

//public class TA2 {
//    public static void main(String[] args) {
//        int[] arr={23,40,54,78,82,89,90};
//        int max=arr[0];
//
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

//FIND SUM & AVERAGE OF AN ARRAY
//public class TA2{
//    public static void main(String[] args) {
//        int[] arr={23,11,10,12,14};
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum =sum+arr[i];
//        }
//        double avg = (double) sum/arr.length;
//        System.out.println(sum);
//        System.out.println(avg);
//    }
//}

//KTH LARGEST ELEMENT OF AN ARRAY
//public class TA2{
//    public static void main(String[] args) {
//        int[] arr={10,3,4,50,23,90};
//        int k=3;
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[j]>arr[i]){
//                    int temp =arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        System.out.println(k + "th largest element is: " + arr[k - 1]);
//    }
//}


//PRINT ONLY UNIQUE ELEMENTS

//public class TA2{
//    public static void main(String[] args) {
//        int[] arr={1,1,2,3,4,4,6,7,5,5};
//        System.out.println("unique ele in arr :");
//
//        for(int i=0;i<arr.length;i++){
//            boolean isD=false;
//
//            for(int j=0;j<i;j++){
//                if(arr[i]==arr[j]){
//                    isD=true;
//                    break;
//                }
//            }
//            if(!isD){
//                System.out.print(arr[i]+" ");
//            }
//        }
//    }
//}


//REVERSE AN ELEMENT OF ARRAY
//public class TA2{
//    public static void main(String[] args) {
//        int[] arr= {23,14,34,33,56};
//        System.out.println("original array:");
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]+" ");
//        }
//        int start=0;
//        int end=arr.length-1;
//        while(start<end){
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }
//        System.out.println("Reverse Array");
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]+" ");
//        }
//    }
//}


//MOVE ZEROS TO AN END
public class TA2{
    public static void main(String[] args) {
        int[] arr={0,1,3,0,5,0,1};
        int pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[pos]=arr[i];
                pos++;
            }
        }
        while(pos<arr.length) {
            arr[pos] = 0;
            pos++;
        }
            System.out.println("Array after:");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
