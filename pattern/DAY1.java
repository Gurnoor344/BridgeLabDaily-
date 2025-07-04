package pattern;

public class DAY1 {
    public static void main(String[] args) {
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }


//        int n =5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        int n =5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

//        int n =5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }


//        int n=5;
//        for (int i = 0; i < n; i++) {
//            for (int j = n-i; j > 1; j--) {
//                System.out.print(" ");
//            }
//            for(int j =0;j<=i;j++){
//                System.out.print("* ");
//
//            }
//            System.out.println();
//
//        }


//        int n = 6;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        int n = 5;
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }


//        for(int i=1;i<=5;i++) {
//            for (int j = 1; j <= 5 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // 01 triangle

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0 && j % 2 == 0 || j % 2 != 0 && i % 2 != 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
}

