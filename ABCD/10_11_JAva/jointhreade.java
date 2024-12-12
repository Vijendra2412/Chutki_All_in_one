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


class jointhread extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            try {
                Thread.sleep(2000);
                System.out.println("The Current thread name is:- "+Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println("The exception has been caught"+e);
            }
            System.out.println(i);

        }
    }
}

public class jointhreade