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

//public class Questions1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Generate a random number between 1 and 100
//        int number = 1 + (int)(100 * Math.random());
//
//        // Number of attempts
//        int K = 5;
//
//        System.out.println("A number is chosen between 1 and 100.");
//        System.out.println("You have " + K + " attempts to guess the correct number.");
//
//        // Loop for K attempts
//        for (int i = 0; i < K; i++) {
//            System.out.print("Enter your guess: ");
//            int guess = sc.nextInt();
//
//            // Check the guess
//            if (guess == number) {
//                System.out.println("Congratulations! You guessed the correct number.");
//                sc.close();
//                return; // Exit main if guessed correctly
//            } else if (guess < number) {
//                System.out.println("The number is greater than " + guess);
//            } else {
//                System.out.println("The number is less than " + guess);
//            }
//        }
//
//        // If the user runs out of attempts
//        System.out.println("You've exhausted all attempts. The correct number was: " + number);
//        sc.close();
//    }
//}



// Find days of week
import java.util.Scanner;

//public class Questions1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Input date
//        System.out.print("Enter day: ");
//        int d = sc.nextInt();
//        System.out.print("Enter month (1-12): ");
//        int m = sc.nextInt();
//        System.out.print("Enter year: ");
//        int y = sc.nextInt();
//
//        // Adjust month and year for Zeller's Congruence
//        if (m == 1 || m == 2) {
//            m += 12;
//            y -= 1;
//        }
//
//        int K = y % 100;       // Last 2 digits of year
//        int J = y / 100;       // First 2 digits of year
//
//        // Zeller's formula
//        int h = (d + (13 * (m + 1)) / 5 + K + K / 4 + J / 4 + (5 * J)) % 7;
//
//        // Mapping Zeller's output to day names
//        String[] days = {
//                "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
//        };
//
//        // Output the result
//        System.out.println("Day of the week is: " + days[h]);
//    }
//}

//LEAP
//public class Questions1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a year: ");
//        int year = sc.nextInt();
//
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            System.out.println(year + " is a Leap Year");
//        } else {
//            System.out.println(year + " is NOT a Leap Year");
//        }
//    }
//}


//ELIGIBILTY TO VOTE
import java.util.Scanner;

//public class Questions1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//        if (age >= 18) {
//            System.out.println("You are eligible to vote.");
//        } else {
//            System.out.println("You are NOT eligible to vote.");
//        }
//    }
//}

//Vowel & Consonent
import java.util.Scanner;

public class Questions1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ch = sc.next().toLowerCase().charAt(0);
        if ((ch >= 'a' && ch <= 'z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel");
            } else {
                System.out.println(ch + " is a Consonant");
            }
        } else {
            System.out.println("Not a valid alphabet letter.");
        }
    }
}
