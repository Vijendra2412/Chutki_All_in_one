
    
// public class amit {
//     public static void main(String[] args) {
//         // primitive :- int char float double byte long short boolean
// non-primitive:-string , array, clases, object,etc
/*
 int:- -ve 0 +ve
 char:- 'A', '1', '@'
 float:- 1.243
 double:- 1.23445
 byte:- -341256 to + 3412568
 short:- -128 to 127
 boolean :- true or false
 */

//  boolean x = true;
//  System.out.println(x);
//  byte y = 127;
//  System.out.println(y);

/*        
Data Type    Default Value    Default size
boolean         false           1 bit
char          '\u0000'          2 byte
byte             0              1 byte
short            0              2 byte
int              0              4 byte
long             0L             8 byte
float            0.0f           4 byte
double           0.0d           8 byte
*/

//     }
// }

// class amit{

//     public static void main(String[] args) {
//         int x = 'A';
//         int y = 'a';
//         System.out.println(x);
//         System.out.println(y);
//     }
// }

// Unicode System  

// unary                postfix:- x++,x-- # prefix :- ++x ,--x
// Arithmetic           + , - , / ,* ,%
// shift Opearator      <<  >> >>>
// relational/comp..    < > <= >= instanceof  
// equality             ==   !=         
// bitwise             bitwiseAND &    #    bitwise inclusive OR ^  # bitwise exclusive OR | 
// logical             AND &&          #    OR ||   #     NOT !
// ternary operator     ? : 
// assignment          +=  -= /= *= %=

// import java.beans.Statement;
// import java.util.ResourceBundle.Control;
import java.util.Scanner;

public class ps {
    public static void main(String[] args) {
        // int x =11;
        // System.out.println(x++);//11
        // System.out.println(++x);//13
        // System.out.println(x--);//13
        // System.out.println(--x);//11

        // int a =10;
        // int b =-10;
        // boolean c = true;
        // boolean d = false;
        // System.out.println(a++ + ++a);//10 + 12
        // System.out.println(b++ + b++);// 10 + 11

        // System.out.println(~a);
        // System.out.println(~b);
        // System.out.println(!c);
        // System.out.println(!d);

        // System.out.println(10<<3); // gn1 * 2^gn2
        // System.out.println(10<<2);

        // System.out.println(10>>3); //gn1 / 2^gn2
        // System.out.println(10>>2);

        // System.out.println(10>=10);
        // int x =10;
        // int y =101;
        // System.out.println(x!=y);

        // int x = 10;
        // int y =9;
        // int z =10;
        // System.out.println(!((x>y) && (x<y)));
        // System.out.println((x>y) & (x<y));

        // System.out.println((x>y) || (x<y));
        // System.out.println((x>y) | (x<y));

        // System.out.println(x<y);
        // System.out.println(x==y);
        // System.out.println(x==z);

        // int x =10;
        // // x=x+8;
        // x+=9;
        // System.out.println(x);

        // keywords--

        // Control Statements

        // 1. Decision
        // -> if Statement
        // -> Switch Statement
        // 2. Loops
        // ->for loop
        // -> while loop
        // -> do while loop
        // -> for each loop
        // 3. Jump Statement
        // break statement
        // continue statement

        // if statement
        // syntax
        // if(condition){
        // code
        // }

        // if(18<9){
        // System.out.println(" eligible");
        // }
        // else if(18<9){
        // System.out.println(" it vj ");
        // }
        // else if(17>9){
        // System.out.println(" its ");
        // }
        // else{
        // System.out.println(" wrong code");
        // }

        // int x =19;
        // int y =12;
        // int z =8;
        // if(x>y){
        // System.out.println(" eligible");
        // }
        // else if(x<y){
        // System.out.println(" it vj ");
        // }
        // else if(x>z){
        // System.out.println(" its ");
        // }
        // else{
        // System.out.println(" wrong code");
        // }

        // String city = "noida";
        // if(city == "delhi"){
        // System.out.println("city is delhi");
        // }
        // else if(city == "merrut"){
        // System.out.println(" city is merrut");

        // }
        // else if(city == "noida"){
        // System.out.println(" city is noida");
        // }
        // else{
        // System.out.println(" city not found");
        // }

        // if(condition){
        // if(condition2){
        // code
        // }
        // else{

        // }
        // }
//         int x = 18;
//         int y = 12;
//         if (x < y) {
//             String city = "noida";
//             if (city == "delhi") {
//                 System.out.println("city is delhi");
//             } else if (city == "merrut") {
//                 System.out.println(" city is merrut");

//             } else if (city == "noida") {
//                 System.out.println(" city is noida");
//             } else {
//                 System.out.println(" city not found");
//             }

//         } else {
// System.out.println(" worng statement");
//         }
/* 


Odd or Even Number
Write a program to check whether a given number is odd or even.

Vowel or Consonant
Write a program that takes a character input and checks whether it is a vowel or consonant.

Positive, Negative, or Zero
Write a program that checks whether a given number is positive, negative, or zero.

Leap Year Check
Write a program to determine whether a given year is a leap year or not.

Grade Calculator
Write a program that takes a student’s score and displays the grade based on the following conditions:

Score >= 90: Grade A
Score >= 80 and < 90: Grade B
Score >= 70 and < 80: Grade C
Score >= 60 and < 70: Grade D
Score < 60: Grade F

Largest of Three Numbers
Write a program that takes three numbers as input and prints the largest of the three.

Check Eligibility to Vote
Write a program that checks if a person is eligible to vote based on their age (age should be >= 18).

Check if Number is Divisible by 5 and 11
Write a program to check whether a given number is divisible by both 5 and 11.

Simple Calculator
Write a program that takes two numbers and an operator (+, -, *, /) and performs the operation based on the operator entered.

Check Triangle Type
Write a program that takes the lengths of three sides of a triangle and determines if it is an equilateral, isosceles, or scalene triangle.

Temperature Converter
Write a program that converts temperature from Celsius to Fahrenheit and checks if the temperature is cold, moderate, or hot based on:

< 10°C: Cold
10°C - 30°C: Moderate
30°C: Hot

Check Character Type
Write a program that checks whether a given character is a digit, an uppercase letter, or a lowercase letter.

Check Day of the Week
Write a program that takes an integer input (1 to 7) and displays the corresponding day of the week (1 for Monday, 2 for Tuesday, etc.). If the input is not between 1 and 7, display "Invalid Input."

Electricity Bill Calculator
Write a program to calculate the electricity bill based on the following conditions:

Units <= 100: ₹5 per unit
Units > 100 and <= 200: ₹7 per unit
Units > 200: ₹10 per unit
Check for Alphabet or Not

Write a program that checks whether a given character is an alphabet or not.

*/
Scanner sc = new Scanner(System.in);


// System.out.println("enter ur pin");
// int x = sc.nextInt();
// System.out.println("enter ur name");
// String y = sc.next();
// System.out.println("ur pin is " + x);
// System.out.println("your name is " + y);


// System.out.println("enter ur character:- ");
// char ch = sc.next().charAt(0);
// if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
// System.out.println(ch + " is a vowel");
// }
// else{
//     System.out.println(ch+" is a consonant");
// }

// System.out.println("Enter three number");
// int num1=sc.nextInt();
// int num2=sc.nextInt();
// int num3=sc.nextInt();


// if(num1>=num2 && num1>=num3){
//     System.out.println(num1+ " is greater");
// }else if(num2>=num1 && num2>=num3){
// System.out.println(num2 + " is greater ");
// }
// else{
//     System.out.println(num3 + "  is greater");
// }

// System.out.println("Enter ur temperature ");
// double Celsius = sc.nextDouble();
// double Fahrenheit = (Celsius*9/5) + 32;
// System.out.println("Temp is " + Fahrenheit +"F");
// if(Celsius<10){
//     System.out.println(" its cold");
// }else if(Celsius<=30){
//     System.out.println("normal");
// }
// else{
//     System.out.println(" hot");
// }

// System.out.println(" Enter ur character");
// char ch = sc.next().charAt(0);
// if(Character.isDigit(ch)){
//     System.out.println(ch+" its digit");
// }
// else if(Character.isUpperCase(ch)){
//     System.out.println("its uppercase");
// }
// else if(Character.isLowerCase(ch)){
//     System.out.println("its Lowercase");
// }
// else{
//     System.out.println("Invalid input");
// }

// System.out.println("Enter ur Unit::- ");
// int units = sc.nextInt();
// int bill = 0;
// if(units<=100){
//     bill=units*5;
// }else if(units<=200){
//     bill = (100*5) + ((units-100)*7);
// }
// else{
//     bill=(100*5) + ((units-100)*7) + ((units-200) * 10);
// }
// System.out.println("Electricity bill is:- " + bill);


//ternary operator ()?"true":"false"
// String x ="10";
// String y ="3";
// String z = (x==y)?"true":"false";
// System.out.println(z);


// int x =10;
// float y =x;
// System.out.println(y);

// float x= 10.1f;
// int y =(int)x;
// System.out.println(y);

// loop:
// for Loop
// for each 
// labbled for loop

//syntax:- 
// for(initialization, condition, I/D){
//     // code 
// }

// for(int i = 0;i<=10;i++){
//     System.out.print("vj ");
// }

// int n = 5;
// int fact = 1;
// for(int i = 1;i<=n;i++){
//     fact = fact*i;
// }
// System.out.println(fact);

// nested for loop 
// for(initialization;conditon; i/d){
//     for(){

//     }
// }


// for(int i=1;i<=3;i++){
//     System.out.println("outer loop:- "+i);
//     for(int j=1;j<=3;j++){
//         System.out.println("inner:- "+j);
//     }
// }


// for(int i=1;i<=5;i++){
//     for(int j=5;j>=i;j--){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// a:
// for(int i=1;i<=3;i++){
//     System.out.println("Outer --------------------" + i);
//     b:
//     for(int j=1;j<=3;j++){
//         System.out.println(" inner "+ j);
//         if(i==2 && j==2){
//             break b;
//         }
//         System.out.println(i +" "+ j);
//     }
// }

// for(int i=0;i<=10;i--){
//     System.out.print(i);
// }

// for(;;){
//     System.out.print("hello ");
// }
// while (condition) {
    
// }

// int i =1;
// while (i<=5) {
//     System.out.println(i);
//     i++;
// }

// while (true) {
//     System.out.println("heloo");
// }
// int i= 5;
// do {
//     System.out.println(" hello " );
//     i++;
// } while (i>=10);


int x =123;
int reversed = 0;
for(; x!=0;x/=10){
    int digit = x%10;
    reversed = reversed*10 + digit;
}
System.out.println("reversed:-  " + reversed);


    }
}



