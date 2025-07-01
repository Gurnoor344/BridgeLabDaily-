package src;

//public class Questions1 {
//
//    public static void printTriangle(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = n - i; j > 1; j--) {
//                // printing spaces
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                // printing stars
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String args[]) {
//        int n = 5;
//        printTriangle(n);
//
//
//        for(int i=0;i<6;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//}


//PALINDROME
//public class Questions1{
//    public static void main(String[] args) {
//        int num = 120321, reverse = 0, rem, temp;
//
//        // palindrome if num and reverse are equal
//        if (getReverse(num, reverse) == num)
//            System.out.println (num + " is Palindrome");
//        else
//            System.out.println (num + " is not Palindrome");
//    }
//
//    static int getReverse(int num, int rev){ // reverse krda hai number nu
//        if(num == 0)   // num 0 a tan oh fully reversed hai
//            return rev;
//
//        int rem = num % 10; // num cho last digit kde ga
//        rev = rev * 10 + rem;  // reverse number ch pade ga
//
//        return getReverse(num / 10, rev);   // remove krega last digit nu & fer call krega
//
//    }
//}


//ARMSTRONG
//public class Questions1 {
//    public static void main(String[] args) {
//        int num = 1513;
//        int original = num;
//        int temp = num;
//        int sum = 0;
//        int digits = 0;
//
//
//        while (temp > 0) {
//            digits++;
//            temp /= 10;   // separate krda numbers nu mtlb single single count krda vi total kihne num ne
//        }
//
//        temp = num;
//        while (temp > 0) {
//            int rem = temp % 10;   // last digit lenda hai
//            sum += Math.pow(rem, digits);  //power krda digits nu
//            temp /= 10;
//        }
//
//        if (sum == original)
//            System.out.println(original + " is an Armstrong number");
//        else
//            System.out.println(original + " is not an Armstrong number");
//    }
//}



import java.util.Scanner;
import java.util.Random;



public class Questions1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int number = 1 + (int)(100 * Math.random());

        // Number of attempts
        int K = 5;

        System.out.println("A number is chosen between 1 and 100.");
        System.out.println("You have " + K + " attempts to guess the correct number.");

        // Loop for K attempts
        for (int i = 0; i < K; i++) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            // Check the guess
            if (guess == number) {
                System.out.println("Congratulations! You guessed the correct number.");
                sc.close();
                return; // Exit main if guessed correctly
            } else if (guess < number) {
                System.out.println("The number is greater than " + guess);
            } else {
                System.out.println("The number is less than " + guess);
            }
        }

        // If the user runs out of attempts
        System.out.println("You've exhausted all attempts. The correct number was: " + number);
        sc.close();
    }
}
