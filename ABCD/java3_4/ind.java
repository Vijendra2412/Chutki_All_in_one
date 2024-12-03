// class pradeep {
//     public static void main(String[] args) {

        // int n=5;
        // for(int i = 1;i<=n;i++){
        // for(int j = 1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int n=5;
        // for(int i =n;i>=1;i--){
        // for(int j =1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int n=5;
        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print(i+j);
        // }
        // System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=n-i;j++){
        // System.out.print(" ");
        // }
        // for(int j =1;j<=i;j++){
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for(int i=n;i>=1;i--){
        // System.out.print(i);
        // }

        // int n =5;
        // for(int i=0;i<n;i++){
        // for(int j=0;i<n-i-1;j++){
        // System.out.print(" ");
        // }
        // int value=1;
        // for(int j =0;j<=i;j++){
        // System.out.print(value +" ");
        // value = value*(i-j)/(j+1);
        // }
        // System.out.println();
        // }

        // int n = 5;
        // for(int i=0;i<n;i++){
        // for(int j=0;j<n-i-1;j++){
        // System.out.print(" ");
        // }
        // int value=1;
        // for(int j=0;j<=i;j++){
        // System.out.print(value +" ");
        // value = value*(i-j)/(j+1);
        // }
        // System.out.println();
        // }

        // int rows = 5;
        // int num = 1;
        // for(int i=1;i<=rows;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println();
        // }

        // int rows =5;
        // for(int i=1;i<=rows;i++){
        //     for(int j=i;j<rows;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //     System.out.print(j+" ");
        //     }
        //     for(int j=i-1;j>=1;j--){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // int num =54321;
        // int reverse = 0;
        // while (num!=0) {
        //     int digit = num%10;
        //     reverse = reverse*10 + digit;
        //     num/=10;
        // }
        // System.out.println("reverse is:- " + reverse);


        // int rows =5;
        // int i=1;
        // while (i<=rows) {
        //     int j=1;
        //     while (j<=i) {
        //         System.out.print("* ");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }


        

//     }
// }



// public class ind {

//     public static void main(String[] args) {
//         int x = 5;
//         int i = 1;
        
        
        
//         while (i<=x) {
//             int j = x-i;
            
//             while (j>0) {
//                 System.out.print(" ");
//                 j--;
//             }
//             int j2 = 1;
//             while (j2<=i) {
//                 System.out.print(j2+" ");
//                 j2++;
//             }
//             int j3=i-1;
//             while (j3>0) {
//                 System.out.print(j3+" ");
//                 j3--;
//             }
//             System.out.println();
//             i++;

//         }
//     }
// }


// class ind {

//     public static void main(String[] args) {
//         int x = 5;
//         int  i = 1;
//         while (i<=x) {
//             int j1 = x-i;
//             while (j1!=0) {
//                 System.out.print(" ");
//                 j1--;
//             }
//             int j2 = i;
//             while (j2>0) {
//                 System.out.print("+ ");
//                 j2--;
//             }
//             System.out.println();
//             i++;
            
//         }
//     }
// }

// class ind{
//     public static void main(String[] args) {
//         // Oops obj = new Oops();
//         // System.out.println(obj.add(5));
//         // System.out.println(Oops.abc());
//         }
// }

// class daemontest extends Thread{
//         public void run(){
//                 if(Thread.currentThread().isDaemon()){
//                         System.out.println("Daemon thread working....");
//                 }
//                 else{
//                         System.out.println("user thread work");
//                 }
//         }
//         public static void main(String[] args) {
//                 daemontest t1 = new daemontest();
//                 daemontest t2 = new daemontest();
//                 daemontest t3 = new daemontest();
//                 t1.setDaemon(true);
//                 t1.start();
//                 t2.start();
//                 t3.start();   
//         }
// }



// class testDaemon extends Thread{
//         public void run(){
//                 System.out.println("Name:- " + Thread.currentThread().getName());
//                 System.out.println("Daemon:- " + Thread.currentThread().isDaemon());
//         }
//         public static void main(String[] args) {
//                 testDaemon t1 = new testDaemon();
//                 testDaemon t2 = new testDaemon();
//                 t1.start();
//                 t1.setDaemon(true);
//                 t2.start();
//         }
// }
// class fg{
//         public static void main(String[] args) {
//                 fg obj = new fg();
//                 fg obj1 = new fg();

//                 System.out.println(obj);
//                 System.out.println(obj1);

//         }
// }

// class ThreadWork implements Runnable{
//         private String address;
//         public ThreadWork(String a){
//                 this.address = a;
//         }
//         public void run(){
//                 System.out.println(Thread.currentThread().getName()+address);
//                 processmess();
//                 System.out.println(Thread.currentThread().getName());
//         }
// private void processmess(){
//         try {
//                 Thread.sleep(1000);
//         } catch (Exception e) {
//                 e.printStackTrace();
//         }
// }
// }

class mycls extends Thread{
        public void run(){
                System.out.println("ShoutDown hook");
        }
}