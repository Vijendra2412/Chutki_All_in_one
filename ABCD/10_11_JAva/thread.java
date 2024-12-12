// class abc extends Thread{
// public void run(){
//     System.out.println("thread is running...");
// }
// public static void main(String[] args) {
//     abc obj = new abc();
//     obj.start();
// }
// }

// class abc implements Runnable{
//     public void run(){
//     System.out.println("thread is running...");
// }
// public static void main(String[] args) {
//     abc obj = new abc();
//     Thread t1 = new Thread(obj);
//     t1.start();
// }
// }

// class abc{
//     public static void main(String[] args) {
//         Thread t1 = new Thread("this is 1st thread");
//         t1.start();
//         String str = t1.getName();
//         System.out.println(str);
//     }
// }

// class abc implements Runnable{
//     public void run(){
//         System.out.println("now the thread is running....");
//     }
//     public static void main(String[] args) {
//         Runnable r1 = new abc();
//         Thread t1 = new Thread(r1,"its my new thread..");
//         t1.start();
//         String str = t1.getName();
//         System.out.println(str);
//     }
// }

// class sleeptest extends Thread{
//     public void run(){
//         for(int i=0;i<=5;i++){
//            try {
//              Thread.sleep(1000);
//            } catch (InterruptedException e) {
//            System.out.println(e);
//            }
//             System.out.println(i);
//         }
//     }
//     public static void main(String[] args) {
//         sleeptest sp1 = new sleeptest();
//         sleeptest sp2 = new sleeptest();

//         sp1.start();
//         sp2.start();

//     }
// }



// class sleeptest {
    
//     public static void main(String[] args) {
        
//        try {
//          for(int i=0;i<=5;i++){
//             Thread.sleep(-100);
//             System.out.println(i);
//           }
//        } catch (Exception e) {
//         System.out.println(e);
//        }

//     }
// }

// class abc extends Thread{
//       public void run(){
//         for(int i=0;i<=5;i++){
//            try {
//              Thread.sleep(1000);
//            } catch (InterruptedException e) {
//            System.out.println(e);
//            }
//             System.out.println(i);
//         }
//     }
//    public static void main(String[] args) {
//     abc obj = new abc();
//     // obj.start();
//     // obj.start();
//     obj.run();

//    }

// }

// class jointhread extends Thread {
//     public void run() {
//         for (int i = 0; i <= 5; i++) {
//             try {
//                 Thread.sleep(2000);
//                 System.out.println("The Current thread name is:- " + Thread.currentThread().getName());
//                 System.out.println(i);
//             } catch (InterruptedException e) {
//                 System.out.println("The exception has been caught: " + e);
//             }
//         }
//     }
// }

// class jointhreadEx {
//     public static void main(String[] args) {
//         jointhread t1 = new jointhread();
//         jointhread t2 = new jointhread();
//         jointhread t3 = new jointhread();
        
//         t1.start();
//         try {
//             System.out.println("Main thread waiting for t1 to complete");
//             t1.join(); // Main thread waits for t1 to complete
//         } catch (InterruptedException e) {
//             System.out.println("The exception has been caught: " + e);
//         }
        
//         t2.start();
//         try {
//             System.out.println("Main thread waiting for t2 to complete");
//             t2.join(); // Main thread waits for t2 to complete
//         } catch (InterruptedException e) {
//             System.out.println("The exception has been caught: " + e);
//         }
        
//         t3.start();
        
//         System.out.println("Main thread continues after t1 and t2 complete");
//     }
// }

// class testjoin extends Thread{
//     public void run(){
//         for(int i=1;i<=5;i++){
//             try {
//                 Thread.sleep(1000);
//             } catch (Exception e) {
//                System.out.println(e);
//             }
//             System.out.println(i);
//         }
//     }
//     public static void main(String[] args) {
//         testjoin t1 = new testjoin();
//         testjoin t2 = new testjoin();
//         testjoin t3 = new testjoin();

//         t1.start();
//         try {
//             t1.join();
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//         t2.start();
//         t3.start();

//     }
// }
// class multiname extends Thread{
//     public void run(){
//         System.out.println("Running...");
//     }
//     public static void main(String[] args) {
//         multiname t1 = new multiname();
//         multiname t2 = new multiname();
//       System.out.println("Name of t1 is:- " + t1.getName());
//       System.out.println("Name of t2 is:- " + t2.getName());
//       t1.start();
//       t2.start();

//       t1.setName("vijendra Sharma");
//       System.out.println("After Changing name of t1:- " + t1.getName());

//     }
// }

class multiname extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        multiname t1 = new multiname();
        multiname t2 = new multiname();

        t1.start();
        t2.start();


    }
}