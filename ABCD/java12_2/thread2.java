// public class java12 {
//     // String 

//     public static void main(String[] args) {
// char [] ch = {'a','b'};
// String x = new String(ch);
// System.out.println(x);

// String s = "ab";
// System.out.println(s);

// String x = "vj";
// String y = "vj";

// String x= new String("uhifshdio");
// String x= "vijendra";
// String y = " Sharma";
// int age   =  123;
// x.concat(y);
// System.out.println(x);
// System.out.println(x.concat(y) );
// System.out.println(x+y + " " + age);

// StringBuffer x = new StringBuffer( "hello ");
// x.append("vijendra");

// // System.out.println(x);
// x.insert(11, "Sharma");
// System.out.println(x);

// x.delete(7, 12);
// System.out.println(x);
// String x = "vijendra";
// String y = "vijendra";
// String z = new String("vijendra");
// String a = " Sharma";
// String b = "kumar";
// System.out.println(x.equals(y));
// System.out.println(x.equals(z));
// System.out.println(x.equals(b));

// System.out.println(x.compareTo(b));
//     }
// }

// import java.util.*;
// import java.util.concurrent.ArrayBlockingQueue;
// import java.util.concurrent.BlockingQueue;
// class kl{
//     public static void main(String[] args) {
// ArrayList<String> x = new ArrayList<>();
// List<String> x = new ArrayList<>();

// Vector<String> x = new Vector<>();
// x.add("apple");
// x.add("banana");
// x.add("papaya");
// x.add("mango");

// x.add(2,"grapes");
// x.set(2, "grapes");

// System.out.println(x);

// String num = x.get(3);
// System.out.println(num);

// Iterator<String> it = x.iterator();
// while (it.hasNext()) {
//     System.out.print(it.next());
//     System.out.println(", ");

// }

// Stack<String> x = new Stack<>();
// x.push("apple");
// x.push("apple1");
// x.push("apple2");
// x.push("apple3");

// System.out.println(x);

// System.out.println(x.pop());

// PriorityQueue<Integer> Pq = new PriorityQueue<>();
// Pq.add(2);
// Pq.add(3);
// Pq.add(1);
// Pq.add(4);

// System.out.println("PriorityQueue using Iterator()");

// Iterator<Integer> it = Pq.iterator();
// while (it.hasNext()) {
//     System.out.println(it.next());

// }

// Pq.offer(1);
// System.out.println(Pq);

// LinkedList<String> fruits = new LinkedList<>();
// fruits.add("Apple");
// fruits.add("stawberry");
// fruits.add("mango");
// fruits.add("DragonFruits");
// fruits.add("litchi");

// System.out.println("LinkedList is:- " + fruits);

// fruits.add(1,"Pomegranant");
// System.out.println(fruits);

//-----blocking Queue------
// BlockingQueue<Integer> animal1 = new ArrayBlockingQueue<>(5);
// try {
//     animal1.put(3);    // Use integers instead of strings
//     animal1.put(1);
//     animal1.put(2);
//     System.out.println("BlockingQueue:- " + animal1);

//     int remove = animal1.take();
//     System.out.println("remove number:- " + remove);
// } catch (Exception e) {
//     e.printStackTrace();  // Better way to print stack trace
// }

// Map<String,Integer> num = new HashMap<>();
// num.put("one", 1);
// num.put("two", 2);
// num.put("three", 3);
// num.put("four", 4);

// System.out.println("number is:- " + num);
// System.out.println("key:- " + num.keySet());
// System.out.println("key:- " + num.values());
// System.out.println("entries:- " + num.entrySet());

// HashMap<String,Integer> num = new HashMap<>();
// num.put("one", 1);
// num.put("two", 2);
// num.put("three", 3);
// num.put("four", 4);

// System.out.println("number is:- " + num);
// System.out.println("key:- " + num.keySet());
// System.out.println("key:- " + num.values());
// System.out.println("entries:- " + num.entrySet());

// for(String key : num.keySet()){
//     System.out.print(key);
//     System.out.print(",");
// }

// LinkedHashMap<String , Integer> evenNum = new LinkedHashMap<>();
// evenNum.put("one ", 1);
// evenNum.put("two ", 2);
// System.out.println("LimkedHashMap: " + evenNum);

// Set<Integer> set1 = new HashSet<>();
// set1.add(2);
// set1.add(2);
// System.out.println(set1);

// HashSet<Integer> even = new HashSet<>();
// even.add(2);
// even.add(4);
// even.add(6);
// even.add(8);
// even.add(8);

// System.out.println(even);

// HashSet<Integer> num = new HashSet<>();
// num.addAll(even);
// num.add(5);

// System.out.println(num);

// }

// import java.io.FileInputStream;
// import java.io.InputStream;

// class Am{
// public static void main(String[] args) {
//     byte[] arr = new byte[100];
//     try {
//         InputStream input = new FileInputStream("abc.txt");
//         System.out.println("Avaliabel bytes in the file " + input.available());

//         input.read(arr);
//         System.out.println("Data read from the file:- ");

//         String data  = new String(arr);
//         System.out.println(data);

//         //close 
//         input.close();

//     } catch (Exception e) {
//         e.getStackTrace();
//     }
// }
//     }

// import java.io.FileOutputStream;
// import java.io.OutputStream;

// class output{
//     public static void main(String[] args) {
//         String data = "this is java class";
//         try {
//             OutputStream out  = new FileOutputStream("abc.txt");
//             byte[] dataBytes = data.getBytes();
//             out.write(dataBytes);
//             System.out.println("data is written to the file.:- ");

//             out.close();
//         } catch (Exception e) {
//             e.getStackTrace();
//         }
//     }
// }

import java.io.FileInputStream;

// class pdna{
//     public static void main(String[] args) {
//         try {
//             FileInputStream input = new FileInputStream("abc.txt");
//             System.out.println("Data in the file:- ");
//             int i = input.read();
//             System.out.println(i);

//             while (i!=-1) {
//                 System.out.print((char)i);
//                 i = input.read();
//             }
//             input.close();

//         } catch (Exception e) {
//             e.getStackTrace();
//         }
//     }
// }

// class avai{
// public static void main(String[] args) {
//     try {
//         FileInputStream input = new FileInputStream("abc.txt");
//     System.out.println("Available bytes at the beginning:- " + input.available());

//     input.read();
//     input.read();
//     input.read();

//     System.out.println("Available bytes at the end:- " + input.available());

//     input.close();
//     } catch (Exception e) {
//        e.getStackTrace();
//     }
// }
// }

// class skip {
//     public static void main(String[] args) {
//         try {
//             FileInputStream input = new FileInputStream("abc.txt");

//             input.skip(5);
//             System.out.println("input Stream After skipping 5 bytes");

//             int i = input.read();

//             while (i != -1) {
//                 System.out.print((char) i);
//                 i = input.read();
//             }
//             input.close();

//         } catch (Exception e) {
//             e.getStackTrace();

//         }
//     }
// }

// class thrd implements Runnable{
//     public void run(){
//         try {
//             Thread.sleep(1000);
//         } catch (InterruptedException e) {
//            e.getStackTrace();
//         }
//         System.out.println(" its thread 1");
//     }
//     public static void main(String[] args) {

//     }
// }

// class thrd extends Thread{
//     public void run(){
//         System.out.println("Thread is running...");
//     }
//     public static void main(String[] args) {
//         thrd obj = new thrd();
//         obj.start();
//     }
// }

// class mtli implements Runnable{
//     public void run(){
//         System.out.println("Thread is running....");
//     }
//     public static void main(String[] args) {
//         mtli obj =  new mtli();
//         Thread t1 = new Thread(obj);
//         t1.start();
//     }
// }

// class thread1{
//     public static void main(String[] args) {
//         Thread t = new Thread("its java class");
//         t.start();
//         String str = t.getName();
//         System.out.println(str);
//     }
// }

//  class Thread2 implements Runnable {
//     public void run() {
//         System.out.println("Thread is running....");
//     }

//     public static void main(String[] args) {
//         Runnable r1 = new Thread2();
//         Thread t1 = new Thread(r1, "Its New Thread");
//         t1.start();
//         String str = t1.getName();
//         System.out.println(str);
//     }
// }

// class sleep extends Thread {
//     public void run() {
//         for (int i = 1; i < 10; i++) {
//             try {
//                 Thread.sleep(500);
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//             System.out.println(i);
//         }

//     }

//     public static void main(String[] args) {
//         sleep s = new sleep();
//         sleep s1 = new sleep();
//         s.start();
//         // s1.start();
//     }
// }

// class sleep {
//     public static void main(String[] args) {
 
//         try {
//             for(int i = 0;i<5;i++){
//                 Thread.sleep(-100);
//                 System.out.println(i);
//             }
//         } catch (InterruptedException e) {
//             System.out.println(e);
//         }
//     }
// }



// class twice extends Thread{
//     public void run(){
//         System.out.println("running........");
//     }
//     public static void main(String[] args) {
//         twice obj = new twice();
//         obj.start();
//         obj.start();
//     }
// }

// class test extends Thread{
//     public void run(){
   
//         for(int i =1;i<5;i++){
//             try {
//                 Thread.sleep(500);
//             } catch (Exception e) {
//                System.out.println(e);
//             }
//             System.out.println(i);
//         }
//     }
//     public static void main(String[] args) {
//         test obj = new test();
//         obj.run();
//         obj.run();
//     }
// }


// class joinn extends Thread{
//     public void run(){
//         for(int i=0;i<2;i++){
//             try {
//                 Thread.sleep(500);
//                 System.out.println("current thread name is " + Thread.currentThread().getName());
//             } catch (Exception e) {
//                System.out.println("Caught exc " + e);
//             }
//         }
//     }
// }

// class kl{
//     public static void main(String[] args) {
//         joinn obj = new joinn();
//         joinn obj1 = new joinn();
//         joinn obj2 = new joinn();
//         obj.start();
//         try {
//             System.out.println("current thread name is " + Thread.currentThread().getName());
//             obj.join();
//         } catch (Exception e) {
//            System.out.println(e);
//         }
//         obj1.start();
//         try {
//             System.out.println("current thread name is " + Thread.currentThread().getName());
//             obj1.join();
//         } catch (Exception e) {
//            System.out.println(e);
//         }
//         obj2.start();
//         try {
//             System.out.println("current thread name is " + Thread.currentThread().getName());
//             obj2.join();
//         } catch (Exception e) {
//            System.out.println(e);
//         }

//     }
// }


class threadpriority extends Thread{
    public void run(){
        System.out.println("inside run method");
    }
    public static void main(String[] args) {
        // threadpriority obj = new threadpriority();
        // threadpriority obj1 = new threadpriority();
        // threadpriority obj2 = new threadpriority();
        // System.out.println("priorty thread for obj: " + obj.getPriority());
        // System.out.println("priorty thread for obj1: " + obj1.getPriority());
        // System.out.println("priorty thread for obj2: " + obj2.getPriority());
        // obj.setPriority(7);
        // obj1.setPriority(2);
        // obj2.setPriority(9);

        // System.out.println("priorty thread for obj: " + obj.getPriority());
        // System.out.println("priorty thread for obj1: " + obj1.getPriority());
        // System.out.println("priorty thread for obj2: " + obj2.getPriority());





    }
}