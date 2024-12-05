import java.util.*;

class Oops {
    /*
     * public static void findeven(int num){
     * if(num%2==0){
     * System.out.println("even");
     * }
     * else{
     * System.out.println("odd");
     * }
     * 
     * }
     * 
     * // public static int add(int x,int y){
     * // int sum =x+y;
     * // return sum;
     * // }
     */

    private int rollno;
    private String name;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rolln0 = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.nam = name;
    }

    public void display(){
        System.out.println("rollno:- "+rollno +"name:- "+name);
    }

    public static void main(String[] args) {
        Oops obj = new Oops();
        obj.setName("vijendra");
        obj.setRollno(12345);
        obj.display();
        // obj.name = "vijnedra";
        // obj.rollno=123;
        // obj.display();


    }
}
