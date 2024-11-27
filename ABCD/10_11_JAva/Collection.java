 
 import java.util.*;
 import java.util.Vector;
 import java.util.Iterator;
 class Collection {
     
     public static void main(String[] args) {
         // List<String> L = new ArrayList<>();
         /* 
         add()
         addAll()
         get()
         iterator()
         set()
         remove()
         removeAll()
         clear()
         size()
         toArray()
         contains()
         */
 
        //  List<Integer> num = new ArrayList<>();
        //  num.add(1);
        //  num.add(2);
        //  num.add(3);
        //  num.add(4);
 
        //  System.out.println("list is:- " + num);

        //  System.out.println(num.get(2));
        //  System.out.println(num.remove(2));

        //  System.out.println("list is:- " + num);


        //  List<Integer> num = new LinkedList<>();
        //  num.add(1);
        //  num.add(2);
        //  num.add(3);
        //  num.add(4);
 
        //  System.out.println("list is:- " + num);

        //  System.out.println(num.get(2));
        //  System.out.println(num.remove(2));

        //  System.out.println("list is:- " + num);

        // ArrayList<String> lang = new ArrayList<>();
        // lang.add("java");
        // lang.add("Pyhton");
        // lang.add("Swift");
        // lang.add("C++");
        // System.out.println("ArrayList "+lang);
        // lang.add(3,"R");
        // System.out.println("ArrayList "+lang);

        // ArrayList<String> l1 = new ArrayList<>();
        // l1.addAll(lang);
        // System.out.println(l1);
        // lang.set(2, "php");
        // System.out.println(lang);

        /*
         size()
         sort()
         clone()
         contains()
         ensurecapacity()
         isEmpty()
         indexOf()
         */

         
        // ArrayList<String> lang = new ArrayList<>();
        // lang.add("java");
        // lang.add("Pyhton");
        // lang.add("Swift");
        // lang.add("C++");

        // System.out.println("ArrayList:- " + lang);
        // String[] arr= new String[lang.size()];
        // lang.toArray(arr);
        // System.out.println("Array:- ");
        // for(String item:arr){
        //     System.out.println(item + ",");
        // }

        // ArrayList<String> lang1 = new ArrayList<>(Arrays.asList(arr));
        // System.out.println("ArrayList:- " + lang1);

        // ArrayList<String> lang = new ArrayList<>(Arrays.asList("java","pyhton","c++","c"));
        // System.out.println(lang);

 
        // ArrayList<String> lang = new ArrayList<>();
        // lang.add("java");
        // lang.add("Pyhton");
        // lang.add("Swift");
        // lang.add("C++");
        // System.out.println("ArrayList:- "+lang);
        // String str = lang.toString();
        // System.out.println(str);


        
        // Vector<String> lang = new Vector<>();
        // lang.add("java");
        // lang.add("Pyhton");
        // lang.add("Swift");
        // lang.add("C++");
        // System.out.print("Vector:- "+lang);
        // //   for(String item:lang){
        // //     System.out.println(item + ",");
        // // }

        // Iterator<String> it = lang.iterator();
        // while (it.hasNext()) {
        //     System.out.print(it.next());
        //     System.out.println(",");
            
        // }
  
        
   
                // Create a new Vector of Strings
                Vector<String> lang = new Vector<>();
                
                // Add elements to the Vector
                lang.add("Java");
                lang.add("Python");
                lang.add("Swift");
                lang.add("C++");
                
                // Method 1: Using System.out.println() to print the entire Vector
                System.out.println("Vector contents: " + lang);
                
                // Method 2: Using Iterator
                System.out.println("\nIterating using Iterator:");
                Iterator<String> it = lang.iterator();
                while (it.hasNext()) {
            System.out.print(it.next());
            System.out.println(",");
            
        }
            }
        }
 
      
 
 