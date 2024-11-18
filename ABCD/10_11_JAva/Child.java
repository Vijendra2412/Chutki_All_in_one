// java is programming language and a platform.
// it is a high level , robust, object-oriented and secure programming language 

/* 
comaprision                    C++                            Java
platform_independent         dependent                       independent
mainly used for             system programming             window-based,web-based,enterprise..
Multiple-inheritence       Support M-I                         does'nt support M-I,by using interface
*/

//  class nihal {
//     public static void main(String[] args) {

//     }
// }

/*
public class nihal {
    public static void main(String[] args) {
        System.out.println("");
    }
}
     */

//  public class a{
//     public static void main(String[] args) {
//         int  x= 9;
//         System.out.println(x);
//     }
//  }

/* 
    DataTypes            Default value            Default size
    boolean :- T/F          false                   1bit
    char :- ''            '\u0000'                  2byte
    byte  :- number         0                       byte
    short :-  num           0                       2byte
    int                     0                       4byte
    long                    0L                      8byte
    float :- decimal        0.0f                    4byte
    double:- decimal        0.0d                    8byte

    
*/

// class z{

//     public static void main(String[] args) {
//         // boolean a = true;
//         // System.out.println(a);

//         // long z  = 1243456781223452355L;
//         // System.out.println(z);
//     }
// }

// package :- 

// Operator is symbol that is used to perform operations. + - / * 

// Unary Opearator                postfix:-  var++ , var-- /   prefix:-  --var,++var
// arithmetic                       + - / * %
// shift Opearator                <<  >>  >>>
// relational/comparison operator  <,> , <= , >=, ==, !=
// bitwise operator               bitwise AND , bitwise exclusive OR, bitwise inclusive OR,
// logical operator               &&  ||   !
// ternary Opearator              ? :
// assignment operator            = += ,-=,/=,*=, %=, &=, ^=, |=, <<=,>>=,>>>=

// Unary operator required only one operand. 
// unary operator are used to perform various operations 
// increment /deccrement  a value by one 
// negating an expression
// inverting the value of a boolean

// class hero{
// public static void main(String[] args) {
// int x =10;
// System.out.println(++x);
// System.out.println(x++);
// System.out.println(x);
// //------------------------------------------------
// System.out.println(x++);
// System.out.println(++x);
// System.out.println(x--);
// System.out.println(--x);

// int a =10;
// int b =10;
// System.out.println(a++ + ++a);
// System.out.println(b++ + b++ );

//  !   ~  

//  int a =10;
//  int b =-10;
//  boolean c = true;
//  boolean d = false;

// System.out.println(~a);
// System.out.println(~b);

// System.out.println(!c);
// System.out.println(!d);

//     }
// }

/* 
public class a{
    public static void main(String[] args) {
        System.out.println("vijendra Sharma");
    }
}
*/

/*        n2
<<   n1*2^
 >>   
  >>>


 it is used to shift all of the bits in a value to the left side
  of a specified number of items

 */

// class v{
//     public static void main(String[] args) {
//         System.out.println(10<<3);
//         System.out.println(5<<3);
//     }
// }

/*
 it is used to move the value of the left operand to right by the number
 of bits specified by the right operand

 n1/2^n2
 */

//  class v{
//     public static void main(String[] args) {
/* 
if +ve number , so >> and >>> work same
for -ve ,>>>change by bits(MSB) to 0
*/
// System.out.println(10>>2);
// System.out.println(10>>>2);

// System.out.println("---------------------");
// System.out.println(-10>>2);
// System.out.println(-10>>>2);

/*
//---logical &&----
 it doesnt check the second if the first condtion is false

 bitwise & Operator
 its always check both conditions whether 
 first condition is true or false
 */

//  int a =10;
//  int b =5;
//  int c = 20;

//  System.out.println(a<b && a<c);
//  System.out.println(a<b & a<c);

// int x =7;
// int y=8;
// System.out.println(!((x<y)&&(x>y)));

// &&  &

// int x =10;
// int y =3;
// int z = 17;
// System.out.println(x<y && x<z);
// System.out.println(x<y & x<z);

// System.out.println(x<y || x<z);
// System.out.println(x<y | x<z);

//ternary operator ()?"true":"false"
// String x ="10";
// String y ="3";
// String z = (x==y)?"true":"false";
// System.out.println(z);

// += ,-= , /=, %= 
// int x =5;
// // x= x+9;
// x+=10;
// System.out.println(x);

/*
// Typecasting  

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte
*/

// int x =10;
// float y =x;
// System.out.println(y);.

// float x= 10.1f;
// int y =(int)x;
// System.out.println(y);

//keywords
// Java has a set of keywords that are reserved words 
// that cannot be used as variables, methods, classes, or any other identifiers
/* 



//---conrol flow statement---
decision making statemetns
        if statement
        switch statement

Loop statement
        for loop
        while loop
        do while loop
        for-each loop

Jump Statement
        break statement
        continue statement

------------------------------
simple if statement
if(condition){
//code
}

if-else statement
if(condition){
//code
}else{
//code
}

if else-if statement
if(condition){
//code
}else if(condition2){
//code
}

nested if-statement
if(condition){
        if(condition1.1){
        // code
        }
        else{
        //code
        }
}
else{
        if(condiotion){
        // code
        }
        else if(cond2){
        //code
        }
        else{

        }

}
*/

// int x= 10;
// int y =12;
// int z =30;
// // System.out.println(x<y);
// if(z>x){
//     if(x>y){
//         System.out.println(" its smaller");
//     }
//     else if(x>z){
//     System.out.println(" x is smaller");
//     }
//     else{
//         System.out.println(" condition wrong");
//     }
// }
// else{
//     System.out.println("condition wrong");
// }

//     }
//  }
// class M {
//     public static void main(String[] args) {
//         int x = 10;
//         int y = 12;
//         int z = 30;

//         if (x < z) {
//             if (x > y) {
//                 System.out.println("x is the smallest");
//             } else {
//                 System.out.println("y is the smallest");
//             }
//         } else {
//             System.out.println("z is not the largest");
//         }
//     }
// }
/* 
// 1. Find the Largest of Three Numbers
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println(num3 + " is the largest number.");
        }
    }
}

// 2. Check If a Number Is Even or Odd
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}

// 3. Grade Calculation
import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks = scanner.nextInt();
        
        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 80) {
            System.out.println("B");
        } else if (marks >= 70) {
            System.out.println("C");
        } else if (marks >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}

// 4. Check if a Year is a Leap Year
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

// 5. Number is Positive, Negative, or Zero
import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}

// 6. Find the Category of a Person's Age
import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        
        if (age < 13) {
            System.out.println("Child");
        } else if (age < 20) {
            System.out.println("Teenager");
        } else if (age < 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
    }
}

// 7. Check Eligibility to Vote
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }
}

// 8. Temperature Check
import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature:");
        double temp = scanner.nextDouble();
        
        if (temp > 30) {
            System.out.println("Hot Day");
        } else if (temp >= 20) {
            System.out.println("Warm Day");
        } else if (temp >= 10) {
            System.out.println("Cool Day");
        } else {
            System.out.println("Cold Day");
        }
    }
}

// 9. Check Whether a Character is a Vowel or Consonant
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println(ch + " is not a letter.");
        }
    }
}

// 10. Calculate BMI (Body Mass Index)
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in kg:");
        double weight = scanner.nextDouble();
        System.out.println("Enter height in meters:");
        double height = scanner.nextDouble();
        
        double bmi = weight / (height * height);
        
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
}


// */
// import java.util.Scanner;
// class q{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.println("enter ur number:- ");
//         int x =sc.nextInt();
//         char y =sc.next()
//         System.out.println("ur number is:- " + x);
//     }
// }

/*
 
import java.util.Scanner;

public class AdvancedConditionalExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Day of the Week
        System.out.println("Enter a number (1-7):");
        int day = scanner.nextInt();
        if (day == 1) System.out.println("Monday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Friday");
        else if (day == 6) System.out.println("Saturday");
        else if (day == 7) System.out.println("Sunday");
        else System.out.println("Invalid input");

        // 2. Triangle Type Checker
        System.out.println("Enter three side lengths:");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        if (a == b && b == c) System.out.println("Equilateral");
        else if (a == b || b == c || a == c) System.out.println("Isosceles");
        else System.out.println("Scalene");

        // 3. Quadrant of a Point
        System.out.println("Enter x and y coordinates:");
        int x = scanner.nextInt(), y = scanner.nextInt();
        if (x > 0 && y > 0) System.out.println("First Quadrant");
        else if (x < 0 && y > 0) System.out.println("Second Quadrant");
        else if (x < 0 && y < 0) System.out.println("Third Quadrant");
        else if (x > 0 && y < 0) System.out.println("Fourth Quadrant");
        else if (x == 0 && y == 0) System.out.println("Origin");
        else System.out.println("On an axis");

        // 4. Simple Calculator
        System.out.println("Enter two numbers and an operator (+, -, *, /):");
        double num1 = scanner.nextDouble(), num2 = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        if (operator == '+') System.out.println(num1 + num2);
        else if (operator == '-') System.out.println(num1 - num2);
        else if (operator == '*') System.out.println(num1 * num2);
        else if (operator == '/') {
            if (num2 != 0) System.out.println(num1 / num2);
            else System.out.println("Cannot divide by zero");
        } else System.out.println("Invalid operator");

        // 5. Season Determiner
        System.out.println("Enter a month number (1-12):");
        int month = scanner.nextInt();
        if (month >= 3 && month <= 5) System.out.println("Spring");
        else if (month >= 6 && month <= 8) System.out.println("Summer");
        else if (month >= 9 && month <= 11) System.out.println("Autumn");
        else if (month == 12 || month == 1 || month == 2) System.out.println("Winter");
        else System.out.println("Invalid month");

        // 6. Discount Calculator
        System.out.println("Enter purchase amount:");
        double amount = scanner.nextDouble();
        if (amount > 5000) System.out.println("Final price: " + (amount * 0.8));
        else if (amount > 2000) System.out.println("Final price: " + (amount * 0.9));
        else if (amount > 1000) System.out.println("Final price: " + (amount * 0.95));
        else System.out.println("Final price: " + amount);

        // 7. Character Type Checker
        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) System.out.println("Letter");
        else if (ch >= '0' && ch <= '9') System.out.println("Digit");
        else System.out.println("Special Character");

        // 8. Time of Day Greeting
        System.out.println("Enter current hour (0-23):");
        int hour = scanner.nextInt();
        if (hour >= 5 && hour < 12) System.out.println("Good Morning");
        else if (hour >= 12 && hour < 17) System.out.println("Good Afternoon");
        else if (hour >= 17 && hour < 21) System.out.println("Good Evening");
        else System.out.println("Good Night");

        // 9. Number to Word Converter
        System.out.println("Enter a single-digit number (0-9):");
        int digit = scanner.nextInt();
        if (digit == 0) System.out.println("Zero");
        else if (digit == 1) System.out.println("One");
        else if (digit == 2) System.out.println("Two");
        else if (digit == 3) System.out.println("Three");
        else if (digit == 4) System.out.println("Four");
        else if (digit == 5) System.out.println("Five");
        else if (digit == 6) System.out.println("Six");
        else if (digit == 7) System.out.println("Seven");
        else if (digit == 8) System.out.println("Eight");
        else if (digit == 9) System.out.println("Nine");
        else System.out.println("Invalid input");

        // 10. Traffic Light Simulator
        System.out.println("Enter current light color (Red/Green/Yellow):");
        String color = scanner.next().toLowerCase();
        if (color.equals("red")) System.out.println("Next: Green");
        else if (color.equals("green")) System.out.println("Next: Yellow");
        else if (color.equals("yellow")) System.out.println("Next: Red");
        else System.out.println("Invalid color");

        // 11. Loan Approval Checker
        System.out.println("Enter credit score and annual income:");
        int creditScore = scanner.nextInt();
        double income = scanner.nextDouble();
        if (creditScore >= 700 && income >= 50000) System.out.println("Loan Approved");
        else if (creditScore >= 650 && income >= 70000) System.out.println("Loan Approved");
        else System.out.println("Loan Denied");

        // 12. Rock-Paper-Scissors Game
        System.out.println("Enter choices for two players (rock/paper/scissors):");
        String player1 = scanner.next().toLowerCase();
        String player2 = scanner.next().toLowerCase();
        if (player1.equals(player2)) System.out.println("Tie");
        else if ((player1.equals("rock") && player2.equals("scissors")) ||
                 (player1.equals("scissors") && player2.equals("paper")) ||
                 (player1.equals("paper") && player2.equals("rock")))
            System.out.println("Player 1 wins");
        else System.out.println("Player 2 wins");

        // 13. Zodiac Sign Determiner
        System.out.println("Enter birth month and day:");
        month = scanner.nextInt();
        int day = scanner.nextInt();
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) System.out.println("Aries");
        else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) System.out.println("Taurus");
        else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) System.out.println("Gemini");
        else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) System.out.println("Cancer");
        else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) System.out.println("Leo");
        else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) System.out.println("Virgo");
        else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) System.out.println("Libra");
        else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) System.out.println("Scorpio");
        else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) System.out.println("Sagittarius");
        else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) System.out.println("Capricorn");
        else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) System.out.println("Aquarius");
        else System.out.println("Pisces");

        // 14. Grade Point Calculator
        System.out.println("Enter a letter grade (A, B, C, D, F):");
        char grade = scanner.next().toUpperCase().charAt(0);
        if (grade == 'A') System.out.println("4.0");
        else if (grade == 'B') System.out.println("3.0");
        else if (grade == 'C') System.out.println("2.0");
        else if (grade == 'D') System.out.println("1.0");
        else if (grade == 'F') System.out.println("0.0");
        else System.out.println("Invalid grade");

        // 15. Leap Year with Century Rule
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");

        scanner.close();
    }
}

 */

// import java.util.Scanner;

// class z {
//     public static void main(String[] args) {
/* 
Scanner sc = new Scanner(System.in);
// day of the week
System.out.println("Enter ur day");
int day = sc.nextInt();
if(day==1){
    System.out.println("Monday");
}
else if(day == 2){
    System.out.println("Tuesday");
}
else if(day == 3){
    System.out.println("Wednesday");
} else if(day == 4){
    System.out.println("Thursday");
} else if(day == 5){
    System.out.println("Friday");
} else if(day == 6){
    System.out.println("Saturday");
} else if(day == 7){
    System.out.println("Sunday");
}
    

Scanner sc = new Scanner(System.in);

    System.out.println("Enter three side lengths:");

    int a = sc.nextInt();
    int b = sc.nextInt();
   int  c = sc.nextInt();
    if (a == b && b == c){
     System.out.println("Equilateral");
    }
    else if (a == b || b == c || a == c){
        System.out.println("Isosceles");
    }
    else{ 
        System.out.println("Scalene");
}
       

        // 3. Quadrant of a Point
Scanner sc = new Scanner(System.in);

System.out.println("Enter x and y coordinates:");
int x = sc.nextInt(), 
y = sc.nextInt();
if (x > 0 && y > 0) {
    System.out.println("First Quadrant");
}
else if (x < 0 && y > 0){
     System.out.println("Second Quadrant");
}
else if (x < 0 && y < 0){
     System.out.println("Third Quadrant");
}
else if (x > 0 && y < 0) {
    System.out.println("Fourth Quadrant");
}
else if (x == 0 && y == 0) {
    System.out.println("Origin");
}
else {
    System.out.println("On an axis");
}



// 4. Simple Calculator
Scanner sc = new Scanner(System.in);

System.out.println("Enter two numbers and an operator (+, -, *, /):");
System.out.println("enter 1st number");
double num1 = sc.nextDouble();
System.out.println("enter Symbol");

char operator = sc.next().charAt(0);

System.out.println("enter 2nd number");
double num2 = sc.nextDouble();
if (operator == '+'){
System.out.println(num1 + num2);
}
else if (operator == '-'){
System.out.println(num1 - num2);
}
else if (operator == '*') {
System.out.println(num1 * num2);
}
else if (operator == '/') {
if (num2 != 0) {
System.out.println(num1 / num2);
}
else {
System.out.println("Cannot divide by zero");
}
} else{
System.out.println("Invalid operator");
}

// 5. Season Determiner
Scanner sc = new Scanner(System.in);
System.out.println("Enter a month number (1-12):");
int month = sc.nextInt();
if (month >= 3 && month <= 5) {
System.out.println("Summer");
}
else if (month >= 6 && month <= 8) {
System.out.println("Spring");
}
else if (month >= 9 && month <= 11) {
System.out.println("Autumn");
}
else if (month == 12 || month == 1 || month == 2) {
System.out.println("Winter");
}
else {
System.out.println("Invalid month");   
}


*/
// 13. Zodiac Sign Determiner
//   Scanner sc = new Scanner(System.in);
//   System.out.println("Enter birth month and day:");
//   month = scanner.nextInt();
//   int day = scanner.nextInt();
//   if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) System.out.println("Aries");
//   else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) System.out.println("Taurus");
//   else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) System.out.println("Gemini");
//   else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) System.out.println("Cancer");
//   else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) System.out.println("Leo");
//   else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) System.out.println("Virgo");
//   else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) System.out.println("Libra");
//   else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) System.out.println("Scorpio");
//   else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) System.out.println("Sagittarius");
//   else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) System.out.println("Capricorn");
//   else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) System.out.println("Aquarius");
//   else System.out.println("Pisces");

//     }
// }
// import java.util.*;

// class mno {
//     public static void main(String[] args) {
// 15. Leap Year with Century Rule
//  Scanner sc = new Scanner(System.in);

//  System.out.println("Enter a year:");
//  int year = sc.nextInt();
//  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
//      System.out.println("Leap Year");
//  else{
//      System.out.println("Not a Leap Year");

// 4. Simple Calculator
//   Scanner sc = new Scanner(System.in);

//   System.out.println("Enter two numbers and an operator (+, -, *, /):");
//   System.out.println("enter 1st number");
//   double num1 = sc.nextDouble();
//   System.out.println("enter Symbol");

//   char operator = sc.next().charAt(0);

//   System.out.println("enter 2nd number");
//    double num2 = sc.nextDouble();
//   if (operator == '+'){
//      System.out.println(num1 + num2);
//   }
//   else if (operator == '-'){
//      System.out.println(num1 - num2);
//   }
//   else if (operator == '*') {
//     System.out.println(num1 * num2);
//   }
//   else if (operator == '/') {
//       if (num2 != 0) {
//         System.out.println(num1 / num2);
//       }
//       else {
//         System.out.println("Cannot divide by zero");
//       }
//   } else{
//      System.out.println("Invalid operator");
//   }

//   Scanner sc = new Scanner(System.in);
// System.out.println("Enter a character:");
// char ch = scanner.next().charAt(0);
// if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
//     System.out.println("Letter");
// } 
// else if (ch >= '0' && ch <= '9') {
//     System.out.println("Digit");
// }
// else {System.out.println("Special Character");
// }

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter current hour (0-23):");
//         int hour = scanner.nextInt();
//         if (hour >= 5 && hour < 12) {
//             System.out.println("Good Morning");
//     }
//         else if (hour >= 12 && hour < 17) {
//             System.out.println("Good Afternoon");
//     }
//         else if (hour >= 17 && hour < 21){ 
//             System.out.println("Good Evening");
//     }
//         else {
//             System.out.println("Good Night");
//     }

// 12. Rock-Paper-Scissors Game
// Scanner sc = new Scanner(System.in);

//  System.out.println("Enter choices for two players (rock/paper/scissors):");
//  String player1 = scanner.next().toLowerCase();
//  String player2 = scanner.next().toLowerCase();
//  if (player1.equals(player2)){ 
//     System.out.println("Tie");
// }
//  else if ((player1.equals("rock") && player2.equals("scissors")) ||
//           (player1.equals("scissors") && player2.equals("paper")) ||
//           (player1.equals("paper") && player2.equals("rock")))
//     { 
//         System.out.println("Player 1 wins");
//     }
//  else {
//     System.out.println("Player 2 wins");

// }

// Scanner sc = new Scanner(System.in);
// 15. Leap Year with Century Rule
//  System.out.println("Enter a year:");
//  int year = scanner.nextInt();
//  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
//      {
//         System.out.println("Leap Year");
//     }
//  else
//      {
//         System.out.println("Not a Leap Year");
//     }
// }
// }

//Switch 
// switch statement execute one statement from Multiple conditions.
// switch (expression) {
//     case value:

//         break;

//     default:
//         break;
// } 
// import java.util.*;
// class jkl{
//     public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter ur day");
// int day = sc.nextInt();
// switch (day) {
//     case 1:
//         System.out.println("Monday");
//         break;
//     case 2:
//         System.out.println("Tuesday");
//         break;
//     case 3:
//         System.out.println("Wednesday");
//         break;
//     case 4:
//         System.out.println("thursday");
//         break;
//     case 5:
//         System.out.println("Friday");
//         break;
//     case 6:
//         System.out.println("saturday");
//         break;
//     case 7:
//         System.out.println("Sunnday");
//         break;

//     default:
//     System.out.println("case not found");
//         break;
// }

// int month = 3;
// String mnthstrng = "";
// switch (month) {
//     case 1:
//         mnthstrng ="1-jan";
//         break;
//     case 2:
//     mnthstrng ="2-feb";

//         break;
//     case 3:
//     mnthstrng ="3-march";

//         break;
//     case 4:
//     mnthstrng ="4-april";

//         break;

//     default:
//     System.out.println("Month not found");
//         break;
// }
// System.out.println(mnthstrng);

// char Branch = 'C';
// int collegeYear = 2;
// switch (collegeYear) {
//     case 1:
//         System.out.println("English,math, physcs,chemestry");
//         break;
//         case 2:
//             switch (Branch) {
//               case 'C':
//                 System.out.println("os,java,ds");
//                 break;
//               case 'E':
//                 System.out.println("abc,def, ghi");
//                 break;
//         }
//         case 3:
//         switch (Branch) {
//             case 'g':
//                 System.out.println("1,2,3,4,5");
//                 break;
//               case 'h':
//                 System.out.println("6,7,8,9");
//                 break;
//         }

//     default:
//         break;
// }

// it is a class that represent the group of constant.

//     }
// }

// loops
// it is used to iterate a part of program several times. 
// there three types of loop
// for loop 
// while loop
// do while loop 

// for-each loop

// syntax of forloop 
// for(initilization, condition, i/d){
// code
// }
// class kl{
//     public static void main(String[] args) {
//         for(int i=0;i<=10;i++){
//             System.out.println("2 * " + i + " = " + 2*i);
//         }
//     }
// }

// import java.util.Scanner;

//  class CurrencyConverter {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input: amount in INR
//         System.out.print("Enter amount in INR: ");
//         double inrAmount = scanner.nextDouble();

//         // Input: target currency
//         System.out.println("Choose the target currency (1 for USD, 2 for EUR, 3 for GBP): ");
//         int currencyChoice = scanner.nextInt();

//         // Variable to store converted amount
//         double convertedAmount = 0.0;

//         // Conversion rates
//         double inrToUsd = 0.012;
//         double inrToEur = 0.011;
//         double inrToGbp = 0.0098;

//         // Switch case to handle currency conversion
//         switch (currencyChoice) {
//             case 1: // INR to USD
//                 convertedAmount = inrAmount * inrToUsd;
//                 System.out.println("Converted amount in USD: " + convertedAmount);
//                 break;

//             case 2: // INR to EUR
//                 convertedAmount = inrAmount * inrToEur;
//                 System.out.println("Converted amount in EUR: " + convertedAmount);
//                 break;

//             case 3: // INR to GBP
//                 convertedAmount = inrAmount * inrToGbp;
//                 System.out.println("Converted amount in GBP: " + convertedAmount);
//                 break;

//             default:
//                 System.out.println("Invalid currency choice.");
//         }

//         scanner.close();
//     }
// }

// import java.util.Scanner;

//  class BankApp {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double balance = 0.0; // Initial balance
//         boolean exit = false; // To control the loop

//         while (!exit) {
//             // Display menu
//             System.out.println("\nBanking Menu:");
//             System.out.println("1. View Balance");
//             System.out.println("2. Deposit Money");
//             System.out.println("3. Withdraw Money");
//             System.out.println("4. Exit");
//             System.out.print("Choose an option (1-4): ");

//             int choice = scanner.nextInt();

//             // Perform operations based on user choice
//             switch (choice) {
//                 case 1: // View balance
//                     System.out.println("Current Balance: $" + balance);
//                     break;

//                 case 2: // Deposit money
//                     System.out.print("Enter the amount to deposit: $");
//                     double depositAmount = scanner.nextDouble();
//                     if (depositAmount > 0) {
//                         balance += depositAmount;
//                         System.out.println("$" + depositAmount + " deposited successfully.");
//                     } else {
//                         System.out.println("Invalid deposit amount.");
//                     }
//                     break;

//                 case 3: // Withdraw money
//                     System.out.print("Enter the amount to withdraw: $");
//                     double withdrawAmount = scanner.nextDouble();
//                     if (withdrawAmount > 0 && withdrawAmount <= balance) {
//                         balance -= withdrawAmount;
//                         System.out.println("$" + withdrawAmount + " withdrawn successfully.");
//                     } else if (withdrawAmount > balance) {
//                         System.out.println("Insufficient balance.");
//                     } else {
//                         System.out.println("Invalid withdrawal amount.");
//                     }
//                     break;

//                 case 4: // Exit
//                     System.out.println("Exiting the program.");
//                     exit = true;
//                     break;

//                 default: // Invalid input
//                     System.out.println("Invalid choice. Please choose between 1 and 4.");
//             }
//         }

//         scanner.close();
//     }
// }

//while loop
// it is used to iterate a part of the program repeatedly until the specified boolean is true .

// while(condition){
//     // code
//     i/d
// }
// class vs {
//     public static void main(String[] args) {
// int i=1;
// while (true) {
// System.out.print("hello ");

// }

// do{
// System.out.println(i);
// i++;

// }while(i<=10);

// for(int i=0;i<=10;i++){
// if(i==5){
// continue;
// }
// System.out.print(i);
// }

// Oops :-
// class:- collection of object is called class.it is a logical entity
// A class can also be defined as a blueprint from which you can create an
// individual object
// class doesn't consume any space

// Inheritence :- 
// when one object acquires all the properties and behaviour of a parents object ,
//  it is known as inheritence 

// Polymorphism :- 
// if one task is performed in different ways is known as polymorphism. 

// Abstraction:- 
// Hiding internal details and showing functionality is known as abstraction.

// coupling:- 
// its referes to the knowledge or information or  dependency of another class.

//     }
// }

// object and class 
// state:- represent the data of an object 
// behaviour:- 
// identity:-  it is used internally by the jvm to identify each object uniquely 

// class:- 
// field
// method 
// constructor 
// block 
// nested class and interface

// syntax
// class class_name{
//     field;
//     method;
// new:- 
// }

// class yups{
//     int age;
//     String name;
// }

// class zz{
//     public static void main(String[] args) {
//         yups obj = new yups();
//         System.out.println(obj.age);
//         System.out.println(obj.name);
//     }
// }

// by refrence variable 
// by method 
// by constructor

// class yups{
//     int age;
//     String name;
//     void abc(int a , String n){
//         age = a;
//         name = n;
//     }
//     void Display(){
//         System.out.println(age + " "+ name);
//     }
// }
// class zz{
//     public static void main(String[] args) {
//         yups obj = new yups();
//         obj.abc(12, "vijendra");

//         obj.Display();
//     }
// }

// import java.util.*;
// class rectangle{
//     int length;
//     int breadth;

//     void insert(int l , int b){
//         length =l;
//         breadth =b;
//     }
//     void area(){
//         System.out.println(length*breadth);
//     }

// }

// class zz{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         rectangle obj = new rectangle();

//         System.out.println(" enter the length ");
//         int length = sc.nextInt();

//         System.out.println(" enter ur breadth ");
//         int breadth = sc.nextInt();

//         obj.insert( length, breadth );
//         obj.area();
//     }
// }

// access_modifire return-type method_name(parameter){

// }

// public void abc(int a, int b){

// }

// import java.util.*;
// class m{
//     public static void findoddeven(int x){

//         if(x%2==0){
//             System.out.println(" even number");
//         }
//         else{
//             System.out.println("odd number");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);

//         System.out.println(" enter your number ");
//         int num = sc.nextInt();
//        findoddeven(num);
//     }
// }

// class m{
//     public static int add(int x , int y){
//         return x+y;
//     }
//     public static void main(String[] args) {
//         System.out.println(add(2, 3));;
//     }
// }

// there are two types of method:- 
// Accessor method 
// mutator method 

// class q{
//     private int roll;
//     private String name;

//     public int getroll(){
//         return roll;
//     }
//     public void setroll(int roll){
//         this.roll = roll;
//     }
//     public String getName(){
//         return name;
//     } 
//     public void setname(String name){
//         this.name = name;
//     }

//     public void Display(){
//         System.out.println("Roll no :- " + roll);
//         System.out.println(" name is:- " + name);
//     }
//     public static void main(String[] args) {
//         q obj = new q();
//         obj.setname("vj");
//         obj.setroll(123);
//        obj.Display();
//     }

// }

// class jdk{
//     int age;
//     String name;
//     // jdk(){
//     //     System.out.println(" this is constructor");

//     // }
//    void Display(){
//         System.out.println(age + " " + name);
//     }
//     public static void main(String[] args) {
//         jdk obj = new jdk();
//         obj.Display();
//     }
// }

// class jdk{
//     int age;
//     String name;
//     int id;
//     jdk(int a, String n){
//         age = a;
//         name = n;
//     }
//     jdk(int a, String n,int i){
//         age = a;
//         name = n;
//         id = i;
//     }
//    void Display(){
//         System.out.println(age + " " + name + " " + id);
//     }
//     public static void main(String[] args) {
//         jdk obj = new jdk(12, "abc",1234);
//         obj.Display();
//     }
// }

// class jdk{
//     int age;
//     String name;
//     // int id;
//     jdk(int a, String n){
//         age = a;
//         name = n;
//     }
//     jdk(jdk j){
//         age = j.age;
//         name = j.name;

//     }

//    void Display(){
//         System.out.println(age + " " + name );
//     }
//     public static void main(String[] args) {
//         jdk obj = new jdk(12, "abc");
//         jdk obj1 =  new jdk(obj);
//         obj.Display();
//         obj1.Display();
//     }
// }

// class jdk{
//     int age;
//     String name;
//     // int id;
//     jdk(int a, String n){
//         age = a;
//         name = n;
//     }
//  jdk(){

//  }
//    void Display(){
//         System.out.println(age + " " + name );
//     }
//     public static void main(String[] args) {
//         jdk obj = new jdk(12, "abc");
//         jdk obj1 =  new jdk();
//         obj1.age = obj.age;
//         obj1.name = obj.name;
//         obj.Display();
//         obj1.Display();
//     }
// }

// class jdk{
//     int rollno;
//     String name;
//     int age;

//     jdk(int rollno, String name,int age){
//         this.rollno = rollno;
//         this.name = name;
//         this.age = age;
//     }

//     void Display(){
//         System.out.println(rollno +" " + name + " "+ age);
//     }
//     public static void main(String[] args) {
//         jdk obj = new jdk(123, "vj", 30);
//         obj.Display();
//     }
// }

// class jdk{
//     void a(){
//         System.out.println("vj");
//     }
//     void b(){
//         this.a();
//         System.out.println("yoyo vj");
//     }
//     public static void main(String[] args) {
//         jdk obj = new jdk();
//         obj.b();

//     }
// }

// class jdk{
//     jdk(){
//         System.out.println(" this is vj");
//     }
//     jdk(int x){
//         this();
//         System.out.println(x);
//     }
//     public static void main(String[] args) {
//         jdk obj  = new jdk(12);

//     }
// }

// class jdk{
//     jdk(){
//         this(5);
//         System.out.println(" hey vj ");
//     }
//     jdk(int x){
//         System.out.println(x);
//     }
//     public static void main(String[] args) {
//         jdk obj = new jdk();
//     }
// }

// // real usage of this() 
// class jdk{
//     int rollno;
//     String name;
//     int age;
//     jdk(int rollno,String name){
//         this.rollno = rollno;
//         this.name = name;
//     }
//     jdk(int rollno,String name,int age){
//         this.rollno = rollno;
//         this.name = name;
//         this.age = age;
//     }
//     void Display(){
//         System.out.println(rollno + " " + name+ " " + age);
//     }
// public static void main(String[] args) {
//     jdk obj = new jdk(123, "vj");
//     jdk obj1 = new jdk(1234, "vijendra", 20);
//     obj.Display();
//     obj1.Display(); 
// }
// }

// class jdk{
//     void m(jdk j){
//         System.out.println(" method invoked");
//     }
//     void n(){
//         m(this);
//     }
//     public static void main(String[] args) {
//         jdk obj = new jdk();
//         obj.n();

//     }
// }

// class jdk {
//     index ind; // Changed variable name for clarity

//     // Constructor that takes an index object
//     jdk(index ind) {
//         this.ind = ind;
//     }

//     void Display() {
//         System.out.println(ind.data);
//     }
// }

// class index {
//     int data = 12;

//     index() {
//         jdk obj = new jdk(this); // Pass 'this' to the constructor
//         obj.Display();
//     }

//     public static void main(String[] args) {
//         index obj1 = new index();
//     }
// }

// types of Inheritence 

// // single
// class parent{
//     int x =9;
//     void Display(){
//         System.out.println(" its vj class");
//     }
//     }

//     class child1 extends parent{
//     void Dis1(){
//         System.out.println(" its java ");
//     }
//     }

//     class ind{
//         public static void main(String[] args) {
//             child1 obj = new child1();
//             obj.Dis();
//             obj.Display();
//             obj.Dis1();
//             System.out.println(obj.x);
//         }
//     }

// //multi level
// class parent{
//     int x =9;
//     void Display(){
//         System.out.println(" its vj class");
//     }
//     }

//     class child extends parent{
//     void Dis(){
//         System.out.println(" its java ");
//     }
//     }

//     class child1 extends child{
//     void Dis1(){
//         System.out.println(" its java ");
//     }
//     }
//     class ind{
//         public static void main(String[] args) {
//             child1 obj = new child1();
//             obj.Dis();
//             obj.Display();
//             obj.Dis1();
//             System.out.println(obj.x);
//         }
//     }

// //hierachical
// class parent{
// int x =9;
// void Display(){
//     System.out.println(" its vj class");
// }
// }

// class child extends parent{
// void Dis(){
//     System.out.println(" its java ");
// }
// }

// class child1 extends parent{
// void Dis1(){
//     System.out.println(" its java ");
// }
// }
// class ind{
//     public static void main(String[] args) {
//         child1 obj = new child1();
//         obj.Dis();
//         obj.Display();
//         obj.Dis1();
//         System.out.println(obj.x);
//     }
// }

// // Aggregation
// class Operation{
//     int square(int n){
//         return n*n;
//     }
// }

// class Cricle{
//    Operation op; //aggregation
//    double pi = 3.14;

//    double area(int radius){
//     op = new Operation();
//     int rsqr = op.square(radius);
//     return pi*rsqr;
//    }

//    public static void main(String[] args) {
//     circle obj = new circle();
//     double result = obj.area(3);
//     System.out.println(result);
//    }
// }

// class jdk{
//     static int add(int x , int y){
//         return x+y;
//     }
//     static int add(int x , int y,int z){
//         return x+y+z;
//     }
//     public static void main(String[] args) {
//         System.out.println(jdk.add(12, 23));
//         System.out.println(jdk.add(12, 23,4));

//     }
// }

// class jdk{
//     static int add(int x , int y){
//         return x+y;
//     }
//     static double add(double x , double y){
//         return x+y;
//     }
//     public static void main(String[] args) {
//         System.out.println(jdk.add(12, 23));
//         System.out.println(jdk.add(12, 23));

//     }
// }

// class jdk{
//     public static void main(String[] args) {
//         System.out.println(" its 1");
//     }
//     public static void main(String args) {
//         System.out.println("its 2");
//     }
//     public static void main() {
//         System.out.println("its 3");
//     }
// }

// class jdk{
//     void sum(int x,long y){
//         System.out.println(x+y);
//     }
//     void sum(int x,int y, int z){
//        System.out.println(x+y+z);
//     }

//   public static void main(String[] args) {
//     jdk obj = new jdk();
//     obj.sum(10, 10);
//     obj.sum(10, 10, 10);
//   }
// }

// class jdk{
//     void sum(int x,int y){
//         System.out.println("int arg method invoked");
//     }
//     void sum(long x,long y){
//        System.out.println("long arg method invoked");
//     }

//   public static void main(String[] args) {
//     jdk obj = new jdk();
//     obj.sum(10, 10);

//   }
// }

// class jdk{
//     void sum(int x,int y){
//         System.out.println("int arg method invoked");
//     }
//     void sum(long x,int y){
//        System.out.println("long arg method invoked");
//     }

//   public static void main(String[] args) {
//     jdk obj = new jdk();
//     obj.sum(10, 10);

//   }
// }

// overriding 

// class jdk{
//     void kl(){
//         System.out.println("its kl method");
//     }
// }
// class child extends jdk{
//     void kl(){
//         super.kl();
//         System.out.println(" its vj class");
//     }
//     public static void main(String[] args) {
//         child obj =  new child();
//         obj.kl();
//     }
// }

// class jdk{
//     int  kl(){
//        return 0;
//     }
// }
// class child extends jdk{
//    String  kl(){
//         return 5;
//     }
//     public static void main(String[] args) {
//         child obj =  new child();
//         System.out.println(obj.kl());
//     }
// }

// class jdk{
//     String name = "vj";
// }

// class child extends jdk{
//     String name = "vijendra";
//     void fname(){
//         System.out.println(name);
//         System.out.println(super.name);
//     }
//     public static void main(String[] args) {
//     child obj =  new child();
//         obj.fname();
//     }
// }

// class jdk{
//     jdk(){
//         System.out.println("its p.constructor");
//     }
// }
// class child extends jdk{
//     child(){

//         System.out.println("its child construcotr");
//     }
//     public static void main(String[] args) {
//         child obj = new child();

//     }
// }

// class jdk{
//     int x ;
//     jdk(){
//         System.out.println("construcor invoked");
//     }
//     {
//        System.out.println("initilizer block");
//     }
//     {
//         System.out.println(" hello");
//     }
//     public static void main(String[] args) {
//         jdk obj = new jdk();
//     }
// }

// super with block 

// class jdk{
//     jdk(){
//         System.out.println("Parent class");
//     }
// }
// class child extends jdk{
//     child(){
//         super();
//         System.out.println(" child class");
//     }
//     {
//         System.out.println(" instance block");
//     }
//     public static void main(String[] args) {
//         child obj = new child();

//     }
// }

//  class jdk{
//     int x ;
//    final void A(){
//         System.out.println("compile...." + x);
//     }
// }

// class child extends jdk{

//     public static void main(String[] args) {
//         child obj = new child();
//         obj.A();
//     }
// }

// class jdk{
//    static final int x;

//  static {
//     x=10;
//   }
//     public static void main(String[] args) {
//         System.out.println(jdk.x);
//     }
// }

// class jdk{
//     int sqr(final int s){
//         return s*s;

//     }
//     public static void main(String[] args) {
//         jdk obj = new jdk();
//         obj.sqr(4);
//     }
// }

// class jdk{
//     void A(){
//         System.out.println(" running..");
//     }
// }
// class child extends jdk{
//     void A(){
//         System.out.println(" i am running...");
//     }
//     public static void main(String[] args) {
//         child obj = new child();
//         obj.A();
//     }
// }

// // static binding and dynamic binding 
// class Parent {    // Using meaningful class name instead of 'jdk'
//     void display() {    // Using meaningful method name instead of 'abc'
//         System.out.println("This is Parent class");
//     }
// }

// public class Child extends Parent {    // Making class public since it contains main
//      // Good practice to use @Override annotation
//     void display() {
//         System.out.println("This is Child class");
//     }

//     public static void main(String[] args) {
//         Parent obj = new Child();    // Parent reference but Child object
//         obj.display();    // Will call Child class's display method
//     }
// }

// class jkl{
//     public static void main(String[] args) {
//         jkl obj =  null;
//         System.out.println(obj instanceof jkl);
//     }
// }

import java.util.Arrays;
import java.util.HashMap;

class JKL {
    // parent class
}

// class Child extends JKL {
// static void method(JKL j) {
// if(j instanceof Child) {
// Child c = (Child)j; // downcasting
// System.out.println("Downcasting performed");
// } else {
// System.out.println("Cannot perform downcasting");
// }
// }

// public static void main(String[] args) {
// // Create child class instance to demonstrate downcasting
// // JKL j = new Child(); // Use child instance instead of parent
// // Child.method(j);

// // // This will not allow downcasting
// // JKL j2 = new JKL();
// // Child.method(j2);
// }
// }

// class jkl{

// }

// class child extends jkl{
// static void method(jkl j){
// child c = (child)j;
// System.out.println("downcasting performed");
// }
// public static void main(String[] args) {
// jkl j = new child();
// child.method(j);
// }
// }

// abstractions

// abstract class cls{
// abstract void method();
// }
// class child extends cls{
// void method(){
// System.out.println(" compile...");
// }
// public static void main(String[] args) {
// cls obj = new child();
// obj.method();
// }
// }

// abstract class Bank{
// abstract int getrateIntrest();
// }
// class union extends Bank{
// int getrateIntrest(){
// return 11;
// }
// }
// class Sbi extends Bank{
// int getrateIntrest(){
// return 7;
// }
// }

// class jk{
// public static void main(String[] args) {
// Bank obj;

// obj = new union();
// System.out.println("intrest is " + obj.getrateIntrest() + "%");

// obj = new Sbi();
// System.out.println("intrest is " + obj.getrateIntrest() + "%");
// }
// }

// interface A{
// void a();
// void b();
// void c();
// void d();
// }

// abstract class B implements A{
// public void c(){
// System.out.println(" its c");
// }
// }

// class Z extends B{

// public void b(){
// System.out.println(" its b ");
// }
// public void a(){
// System.out.println(" its a ");
// }
// public void d(){
// System.out.println(" its d ");
// }
// }
// class al{
// public static void main(String[] args) {
// A obj = new Z();
// obj.a();
// obj.b();
// obj.c();
// obj.d();
// }
// }

// interface kl{
// void method();
// }

// interface klm{
// void method1();
// }

// class child implements kl,klm{
// public void method(){
// System.out.println(" hello world ");
// }
// public void method1(){
// System.out.println(" hey vj ");
// }
// public static void main(String[] args) {
// child obj = new child();
// obj.method();
// obj.method1();
// }
// }

// class Non {
// // Interface converted to class
// private int sqr(int x) {
// return x * x;
// }

// public void A() {
// System.out.println("Parent class");
// }
// }

// class Rectangle extends Non { // Changed implements to extends

// public void A() {
// System.out.println("its vj class");
// }
// }

// class Dk {
// public static void main(String[] args) {
// Non obj = new Rectangle();
// obj.A();
// // This won't work because sqr is private:
// // System.out.println(obj.sqr(3));

// // To access private method, we need to make it accessible through a public
// method
// Rectangle rect = new Rectangle();
// rect.A();
// }
// }

// class kl{
// private int x =2;
// private void ad(){
// System.out.println(" its vj class ");
// }

// }

// class mn{
// public static void main(String[] args) {
// kl obj = new kl();
// obj.ad();
// System.out.println(obj.x);
// }
// }

// class mn{
// private mn(){}
// void method(){
// System.out.println(" its vj class ");
// }
// }
// class nm{
// public static void main(String[] args) {
// mn obj = new mn();
// }
// }

// class kl{
// private String name;
// String getname(){
// return name;
// }
// void setname(String name){
// this.name = name;
// }
// }
// class nm{
// public static void main(String[] args) {
// kl obj = new kl();
// obj.setname("vijendra sharma");
// System.out.println(obj.getname());
// }
// }

// -- Array --
// class kl {
// public static void main(String[] args) {
// int x[] = {1,2,3,4,5,6,7};
// for(int i:x){
// System.out.println(i);
// }

// for(int i=0;i<x.length;i++){
// System.out.println(x[i]);
// }

// int x[] = new int[5];
// x[0] =8;
// x[1] = 7;
// x[2] = 6;
// x[3] =8;
// x[4] = 7;
// x[2] = 6;
// for(int i=0;i<x.length;i++){
// System.out.println(x[i]);
// }

// }
// }

// class kl {
// static void max(int arr[]) {
// int max = arr[0];
// for (int i = 0; i < arr.length; i++) {
// if(max>arr[i]){
// max = arr[i];
// }
// }
// System.out.println(max);

// }
// public static void main(String[] args) {
// int x[] = {1,2,3,4,5,6,7};
// max(x);
// }
// }

// class anonymous{
// static void vj(int arr[]){
// for(int i=0;i<arr.length;i++){
// System.out.println(arr[i]);
// }
// }

// public static void main(String[] args) {
// vj(new int[]{1,2,3,4,5,6,7,8}); // anonymous array
// }
// }

// class returnarr{
// static int[] method(){
// return new int[]{1,42,3,1};
// }
// public static void main(String[] args) {
// int arr[] = method();
// for(int i=0;i<arr.length;i++){
// System.out.println(arr[i]);
// }
// }
// }

// class kl {
//     public static void main(String[] args) {
//         int x[] = { 1, 2, 3, 3, 45, 6, 8 };
//         for (int i = 0; i <= x.length; i++) {
//             System.out.println(x[i]);
//         }
//     }
// }

// class scndlarg{
//     public static void main(String[] args) {
//         int arr[] = {3,1,2,5,6,78,4};
//         int first = Integer.MIN_VALUE,second = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>first){
//                 second =first;
//                 first = arr[i];
//             }
//             else if (arr[i] > second && arr[i] !=first){
//                 second  = arr[i];
//             }
//         }
//         System.out.println(" second largest number :- " + second);
//     }
// }

// class Questions{
//     public static void main(String[] args) {
        // int arr[] = {3,1,2,5,6,78,4};
       
       //---------Reverse----------------
        // for(int i=0;i<arr.length/2;i++){
        //     int temp = arr[i];
        //     arr[i]  = arr[arr.length-1-i];
        //     arr[arr.length-1-i] = temp;
        // }
        // System.out.println(Arrays.toString(arr));

        //--------------------------
        // System.out.println(" original array:- ");
        // for( int i :arr){
        //     System.out.print(i+ " ");
        // }

        // int reverse[] = new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     reverse[i] = arr[arr.length-1-i];
        // }

        // System.out.println("\n reversed arrry ");
        // for(int i : reverse){
        //     System.out.print(i+" ");
        // }

        //----check sorted or not---
        // boolean issorted = true;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>arr[i+1]){
        //         issorted = false;
        //         break;
        //     }
        // }
        // System.out.println(issorted);

        // check frequency

//         int arr[]  = {1,2,3,2,4,3,4};

//         System.out.println("Element | Frequency ");
//         for(int i =0;i<arr.length;i++){

//             int count = 1;
//             boolean iscounted = false;

//             for(int j=0; j<i;j++){
//                 if(arr[i] == arr[j]){
//                     iscounted = true;
//                     break;
//                 }
//             }
//             if(!iscounted){
//                 for(int k=i+1;k<arr.length;k++){
//                     if(arr[i] == arr[k]){
//                         count++;
//                     }
//                 }
//                 System.out.println(" " + arr[i] + " | " + count);
//             }
//         }

//     }
// }



// class milti2d{
//     public static void main(String[] args) {
        // int [][] x = {
        //     {1,2,3},
        //     {4,5}
        // };
        // for(int i=0;i<x.length;i++){
        //     for(int j = 0;j<x[i].length;j++){
        //         System.out.println(x[i][j]);
        //     }

        // }

        // int x[][]  = new int[2][2];
        // x[0][0] = 1;
        // x[0][1] = 2;
        // x[1][0] = 3;
        // x[1][1] = 2;
        // for(int i=0;i<x.length;i++){
        //     for(int j = 0;j<x[i].length;j++){
        //         System.out.println(x[i][j]);
        //     }
        // }

        // int x[][] = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        // for(int i = 0;i<3;i++){
        //     for(int j =0;j<3;j++){
        //         System.out.print(x[i][j] +" ");
        //     }
        //     System.out.println();
        // }

        // jagged Array 
        //  int x[][] = new int[3][];
        //  x[0]= new int[3];
        //  x[1] = new int[5];
        //  x[2] = new int [2];

        //  int y = 0;
        //  for(int i =0;i<x.length;i++){
        //     for(int j=0;j<x[i].length;j++){
        //         x[i][j] = y++;
                
        //     }
        //  }

        //  for(int i = 0;i<x.length;i++){
        //     for(int j=0;j<x[i].length;j++){
        //         System.out.print(x[i][j] + " ");
        //     }
        //     System.out.println();
        //  }




//     }
// }



// class copy{
//     public static void main(String[] args) {
//         int x[] = {1,2,3,4,5,6};
//         int y[] = new int[x.length];

//         System.out.println(" original array:- ");
//         for(int i =0;i<x.length;i++){
//             System.out.print(x[i]);
//         }

//         for(int i=0;i<x.length;i++){
//             y[i ]= x[i];
//         }
//         System.out.println("\n copy array:- ");
//         for(int i:y){
//             System.out.print(i);
//         }
//     }
// }


// class frequency{
//     public static void main(String[] args) {
//         int []arr = {1,2,3,1,3,4,5};
//         int []freq = new int[arr.length];

//         for(int i=0;i<arr.length;i++){
//             int count = 1;
//             if(freq[i] == -1){
//                 continue;
//             }
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                     freq[j] = -1;
//                 }
//             }
//             freq[i] = count;
//         }
//         System.out.println("Element: Frequncy");
//         for(int i=0; i<arr.length;i++){
//             if(freq[i]!=-1){
//                 System.out.println(arr[i]+ ":"+ freq[i]);
//             }
//         } 
//     }
// }



// class reverse{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6};
//         System.out.println(" reverse array");
//         for(int i=arr.length-1;i>=0;i--){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


/*
 --------- Solutions -----------
 public class TransposeMatrixAlt {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose of the matrix:");
        for (int[] row : transpose) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

public class SumRowColumn {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rowSum, colSum;

        System.out.println("Sum of each row:");
        for (int i = 0; i < matrix.length; i++) {
            rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        System.out.println("Sum of each column:");
        for (int i = 0; i < matrix[0].length; i++) {
            colSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                colSum += matrix[j][i];
            }
            System.out.println("Column " + (i + 1) + ": " + colSum);
        }
    }
}

public class MatrixProduct {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{2, 0}, {1, 2}};
        int[][] product = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product of matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class FrequencyOddEvenMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int oddCount = 0, evenCount = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                if (element % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        System.out.println("Odd numbers count: " + oddCount);
        System.out.println("Even numbers count: " + evenCount);
    }
}

public class UpperTriangular {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Upper triangular matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i <= j) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

public class LowerTriangular {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Lower triangular matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i >= j) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}


public class EqualMatrices {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean isEqual = true;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual) {
            System.out.println("The matrices are equal.");
        } else {
            System.out.println("The matrices are not equal.");
        }
    }
}

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 3}, {0, 0, 0}, {0, 0, 0}};
        int zeroCount = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                if (element == 0) {
                    zeroCount++;
                }
            }
        }

        if (zeroCount > (matrix.length * matrix[0].length) / 2) {
            System.out.println("The matrix is a sparse matrix.");
        } else {
            System.out.println("The matrix is not a sparse matrix.");
        }
    }
}

public class IdentityMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        boolean isIdentity = true;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                    isIdentity = false;
                    break;
                }
            }
        }

        if (isIdentity) {
            System.out.println("The matrix is an identity matrix.");
        } else {
            System.out.println("The matrix is not an identity matrix.");
        }
    }
}

public class SubtractMatrices {
    public static void main(String[] args) {
        int[][] a = {{5, 6}, {7, 8}};
        int[][] b = {{1, 2}, {3, 4}};
        int[][] difference = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                difference[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Difference of matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(difference[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] transpose = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class OddEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Even numbers:");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nOdd numbers:");
        for (int i : arr) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

public class MultiplyMatrices {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] product = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product of matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class AddMatrices {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] sum = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;

        Arrays.sort(arr);

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}

import java.util.Arrays;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};
        
        Arrays.sort(arr);
        
        System.out.println("Smallest element is: " + arr[0]);
    }
}

import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};
        
        Arrays.sort(arr);
        
        System.out.println("2nd smallest element is: " + arr[1]);
    }
}

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};
        
        Arrays.sort(arr);
        
        System.out.println("Largest element is: " + arr[arr.length - 1]);
    }
}

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};
        
        Arrays.sort(arr);
        
        System.out.println("2nd largest element is: " + arr[arr.length - 2]);
    }
}

import java.util.Arrays;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};
        
        Arrays.sort(arr);
        
        System.out.println("3rd largest element is: " + arr[arr.length - 3]);
    }
}

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 8, 7, 1};

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Array in descending order:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};

        Arrays.sort(arr);

        System.out.println("Array in ascending order:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 1; // Number of times to rotate

        for (int i = 0; i < n; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }

        System.out.println("Right Rotated Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        
        for (int i : arr) {
            sum += i;
        }
        
        System.out.println("Sum of all elements in the array: " + sum);
    }
}

public class ArrayLength {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.println("Number of elements in the array: " + arr.length);
    }
}


public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println("Smallest element in the array: " + min);
    }
}

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("Largest element in the array: " + max);
    }
}

public class OddPositionElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        
        System.out.println("Elements at odd positions:");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}

// String










 */

//  class kl{
//     public static void main(String[] args) {
        // 
        // String x = "Vijendra";
        // x= x.concat(" Sharma");
        // System.out.println(x);
        // System.out.println(x.concat(" Sharma"));

        // equals()
        // ==
        // CompareTo()

        // String x = "vj";
        // String y = "vj";
        // String a = new String("vj");
        // String b = "vijay";
        // String c ="VJ";

        // System.out.println(x.equals(y));
        // System.out.println(x.equals(b));
        // System.out.println(x.equals(c));
        // System.out.println(x.equalsIgnoreCase(c));

        // System.out.println(x==y);

        //compareto 
        // ==  0
        // x>y  1
        // x<y  -1

        // System.out.println(x.compareTo(y));
        // System.out.println(x.compareTo(a));
        // System.out.println(x.compareTo(b));
        // System.out.println(x.compareTo(c));


        // String x = "vj";
        // String y = "Sharma";
        // int age = 18;
        // System.out.println(x.concat(y));
        // System.out.println(x.concat(age));

        // System.out.println( x + age);

            // String fname = "vijendra";
            // String lname = "Sharma";
            // StringBuffer sb = new StringBuffer();
            // sb.append(" hey ");
            // sb.append(fname);
            // sb.append(lname);
            // String result = sb.toString();
            // System.out.println(result);

            // String result = String.join(" ","hello", fname,lname);
            // System.out.println(result);

            // String result = String.format("heloo , %s ",fname,lname);
            // System.out.println(result);

 


        
//     }
//  }


// class kl{
//     public static void main(String[] args) {
        // String x = "vijendra sharma ";
        // System.out.println(x.substring(0,5));

        // String x = new String("its, vj class");
        // String [] arr = x.split(" ");
        // System.out.println(Arrays.toString(arr));


        // String x = "vijendra sharma";
        // System.out.println(x.toUpperCase());
        // System.out.println(x.toLowerCase());
        // System.out.println(x);
        // System.out.println(x);
        // System.out.println(x.trim());

        // System.out.println(x.startsWith("v"));
        // System.out.println(x.endsWith("a"));

        // System.out.println(x.charAt(5));

        // String x = new String();
        // String x2 = x.intern();
        // System.out.println(x2);

        // int x = 10;
        // String a = String.valueOf(x);
        // System.out.println(a);
        // System.out.println(a+12);

        // String x = " its java class ";
        // String re = x.replace("java", "vj");
        // System.out.println(x);
        // System.out.println(re);

        // StringBuffer x = new StringBuffer();
        // x.insert(0, "hello");
        // x.insert(1, " ");
        // x.insert(2, "vj");
        // System.out.println(x);

        // StringBuffer x = new StringBuffer("hey!");
        // x.replace(1, 4, "vijendra");
        // System.out.println(x);
        
//     }
// }

// class kl{
//     private static kl singleobject;

//     private kl(){

//     }

//     public static kl getInstance(){

//     }
// }

// enum size{
//         SMALL ,MEDIUM ,LARGE , EXTRALARGE;


//         public String getSize(){
//             switch (this) {
//                 case SMALL:
//                 return "small";

//                 case MEDIUM:
//                 return "medium";
                    
//                 default:
//                 return null;
              
            
               
//             }
//         }
//         public static void main(String[] args) {
//             System.out.println(size.SMALL.getSize());
//         }
// }


// an exception is an unexpected event that occur during program execution
// throw
// error      exception
//            runtimeException    IOexception

// syntax:- try-catch
// class exc{
//     public static void main(String[] args) {
//         try {
            
//         } catch (Exception e) {
//             // TODO: handle exception
//         }
//     }
// }

// class exc{
//     public static void main(String[] args) {
//         // try {
//         //     int divide = 2/2;
//         //     System.out.println(divide);
//         // } catch (ArithmeticException e) {
//         //     System.out.println("Arithmetic exception=> " + e.getMessage());
//         // }
//         // finally{
//         //     System.out.println("--its finally block--");
//         // }
//     }
// }


// class exc{
//     public static void divideByzero(){
//         throw new ArithmeticException("tryying to divide by 0");
//     }
//     public static void main(String[] args) {
//         divideByzero();
//     }
// }

// class exc{
//     public static void findfile() throws IOException{
//         File newFile = new File("test.txt");
//         FileInputStream stream = new FileInputStream(newFile);
//     }
//     public static void main(String[] args) {
//         try {
//             findfile();
//         } catch (IOException e) {
//             System.out.println(e);
//         }
//     }
// }


import java.io.*;

public class Child {
    private int[] list = {2,3,4,5,6,6};
    
    public void writeList() {
        PrintWriter out = null;
        try {
            System.out.println("--Entering try statement--");
            out = new PrintWriter(new FileWriter("ABCD\\10_11_JAva\\test.txt"));
            
            // Changed loop condition to list.length
            for(int i = 0; i < list.length; i++) {
                out.println("value at: " + i + " = " + list[i]);
            }
            System.out.println("Successfully wrote to file");
            
        } catch (IOException e) {
            System.out.println("IOException => " + e.getMessage());
        } finally {
            if(out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    // Optional: add main method to test
    public static void main(String[] args) {
        Child child = new Child();
        child.writeList();
    }
}