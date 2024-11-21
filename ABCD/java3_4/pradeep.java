// public class pradeep {
//      // instance:-
//     // static :-
//     public static void main(String[] args) {
    /*
     Variable:- it is a container which store the value while the program is excuted

     DataType variable_name = value

     */
    // int x =9;
    // int y=8;
    // int z =10;
    // System.out.println(x);
    // System.out.println(y);
    // System.out.println(z);

    // int x,y,z;
    // x=9;
    // y=12;
    // z=2;

    // int x=12,y=3,z=9;
    //   System.out.println(x);
    // System.out.println(y);
    // System.out.println(z);

    // int x=9;
    //  x =8;
    // System.out.println(X);

    // types of variable 
    // local :-
    // instance:-
    // static :-

    // int x =9;
    // int y=10;
    // System.out.println(x+y);
/* 
    Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte
*/

// float x =9.8f;
//  int y=(int)x;
// System.out.println(x);
// System.out.println(y);

/* 
    DataTypes            Default value            Default size

    boolean :- T/F          false                   1bit
    char :- ''            '\u0000'                  2byte
    byte  :- number         0                       byte
    short :-  num           0                       2byte
    int   :                  0                      4byte
    long                    0L                      8byte
    float :- decimal        0.0f                    4byte
    double:- decimal        0.0d                    8byte

    
*/

// boolean x = false;
// System.out.println(x);
// char a = 'a';
// System.out.println(a);
// float b = 1.2f;
// System.out.println(b);
// double c = 1.3;
// System.out.println(c);
//     }
// }

// class a{
//     public static void main(String[] args) {
//         boolean x = true;
//         System.out.println(x);
//     }
// }

/* 
class a{
    public static void main(String[] args) {
       int x=9;
        System.out.println(x);
    }
}


// Operator is symbol that is used to perform operations. + - / * 

types of Operator:- 
// Unary Opearator                postfix:-  var++ , var-- /   prefix:-  --var,++var  ,, ~  ! 
// arithmetic   Operator                     + - / * %
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
    */

    // class p{
    //     public static void main(String[] args) {
            
        //    int a =10;
        //    int b= -10;
        //    System.out.println(a+b);
        //    System.out.println(a-b);
        //    System.out.println(a*b);
        //    System.out.println(a/b);

        // System.out.println(10<<2);  // gn1 * 2^gn2
        // System.out.println(5<<3); //  
        // System.out.println(10>>2); // gn1 / 2^gn2
        // System.out.println(5>>3);

        // System.out.println(2==2);
        


    //     }
    // }

//   class pradeep {
  
//    int age;
//    String name;

//    pradeep(int a, String n){
//     age = a;
//     name= n;
//    }
//    void  display(){
//     System.out.println("age is:- " + age + " " + "name is:- " + name);
//    }

  
//     public static void main(String[] args) {
//         pradeep obj =  new pradeep(20,"pradeep");
//         obj.display();
//     }
         
//     }

// class pradeep{
//     int age;
//     String name;
//     int id;

//     pradeep(int a,String n){
//         age = a;
//         name= n;

//     }
//     pradeep(int a,String n,int i){
//         age = a;
//         name = n;
//         id= i;
//     }
//     void display(){
//     System.out.println("age is:- " + age + " " + "name is:- " + name + " id is:- "+ id);
//     }
//     public static void main(String[] args) {
//         pradeep obj = new pradeep(24, "vijendra");
//         pradeep obj1 = new pradeep(20, "pradeeep", 123);
//         obj.display();
//         obj1.display();
//     }
//  


// Static keywords 
// variable
// method
// blocks
// nested class

// class staticc{
//   static  int age =22;
// String name = "vijendra";
// int id = 123;
// public static void main(String[] args) {
//     staticc obj = new staticc();
//     obj.age = 23;
//     System.out.println(obj.age);
// }
// }

// class staticc{
//   int age;
//   String name;
//  static  int id = 321;
//  staticc(int a, String n){
// age= a;
// name =n;
//  }
//  void display(){
//     System.out.println("name is:- " + name + " age is:- "+age + " id is:- " + id);
//  }

//   public static void main(String[] args) {
//       staticc obj = new staticc(23,"vijendra");
  
//       obj.display();
//   }
//   }


// class counter{
//   static  int count =0;
//     counter(){
//         count++;
//         System.out.println(count);
//     }
// public static void main(String[] args) {
//     counter obj =  new counter();
//     counter obj1 =  new counter();
//     counter obj2 =  new counter();
// }
// }


// class bache{
//     int rollno;
//     String name;
//     static String college = "ABC";
//     static void method(){
//         college = "def";
//     }

//     bache(int r, String n){
//         rollno = r;
//         name = n;
//     }
//     void display(){
//         System.out.println("rollnumber is:- " + rollno + " name:- "+ name + " college is:- " + college);
//     }

   
// }

// class av{
//     public static void main(String[] args) {
//         bache.method();
//         bache obj = new bache(123, "vijendra");
//         bache obj1 = new bache(1234, "vijendra1");
//         obj.display();
//         obj1.display();

//     }
// }

// class solve{
//     static int Triangle(int x){
//         return x+x+x;
//     }
//     public static void main(String[] args) {
//         System.out.println(solve.Triangle(5));
//     }
// }


// class non{
//     static int x = 23;
//     public static void main(String[] args) {
//         System.out.println(x);
//     }
// }

//Static block
// class blck{
//     static{
//         int x =9;
//         System.out.println("its stastic block " + x);
//     }
//     public static void main(String[] args) {
//         System.out.println("its main ");
//     }
// }

// class without{
//     static{
//         System.out.println(" --its static block-- ");
//     }
//     System.exit(0);
// }


// this keyword 
// state 
// behaviour

// class ghi{
//     int rollno;
//     String name;
//     float fees;

//     ghi(int rollno, String name, float fees){
//        this.rollno = rollno;
//        this.name = name;
        
//        this.fees = fees;  
//     }

//     void display(){
//         System.out.println(rollno+" "+name+" "+fees);
//     }
//     public static void main(String[] args) {
//         ghi obj = new ghi(123, "vj", 1000);
//         obj.display();
//     }
// }

// class ghi{
//     void m(){
//         System.out.println("hello m");
//     }
//     void n(){
//         this.m();
//         System.out.println("hello n");
//     }
//     public static void main(String[] args) {
//         ghi obj = new ghi();
//         // obj.m();
//         obj.n();
//     }
// // }

// class conc{
//     conc(){
//         this();
//         System.out.println(" its con1");
//     }
//     conc(int x){
    
//         System.out.println(x);
//     }
//     public static void main(String[] args) {
//         conc obj = new conc(12);

//     }
// }

// class m{
//     m getA(){
//         return this;
//     }
//     void msg(){System.out.println("hello vj");
//     }
//     public static void main(String[] args) {
//         new m().getA().msg();
//     }
// }

// class ref{
//     void m(){
//         System.out.println(this);
//     }
//     public static void main(String[] args) {
//         ref obj = new ref();
//         obj.m();
//     }
// }


// ------Inheritence------
// class p{
//     //data members
//     int height = 6;
// }

// class child extends p{
//     int age = 14;

//     public static void main(String[] args) {
//         child obj = new child();
//         System.out.println(obj.height +" "+ obj.age);
//     }
// }

// class p{
//     //data members
//     int height = 6;
// }

// class child extends p{
//     int age = 14;
// }

// class child1 extends child{
//     int length =12;
    
// }


// class pradeeep{
//     public static void main(String[] args) {
//         child1 obj = new child1();
//         System.out.println(obj.height +" "+ obj.age + " "+ obj.length);
//     }
// }

class p{
    //data members
    int height = 6;
}

class child extends p{
    int age = 14;
}

class child1 extends p{
    int length =12;
    
}

class pradeeep{
    public static void main(String[] args) {
        child1 obj = new child1();
        System.out.println(obj.height + " "+ obj.length);

        child obj1 = new child();
        System.out.println(obj1.height +" "+ obj1.age );
    }
}