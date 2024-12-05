
import java.util.*;

// class Collection {

//     public static void main(String[] args) {
        // List<String> L = new ArrayList<>();
        /*
         * add()
         * addAll()
         * get()
         * iterator()
         * set()
         * remove()
         * removeAll()
         * clear()
         * size()
         * toArray()
         * contains()
         */

        // List<Integer> num = new ArrayList<>();
        // num.add(1);
        // num.add(2);
        // num.add(3);
        // num.add(4);

        // System.out.println("list is:- " + num);

        // System.out.println(num.get(2));
        // System.out.println(num.remove(2));

        // System.out.println("list is:- " + num);

        // List<Integer> num = new LinkedList<>();
        // num.add(1);
        // num.add(2);
        // num.add(3);
        // num.add(4);

        // System.out.println("list is:- " + num);

        // System.out.println(num.get(2));
        // System.out.println(num.remove(2));

        // System.out.println("list is:- " + num);

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
         * size()
         * sort()
         * clone()
         * contains()
         * ensurecapacity()
         * isEmpty()
         * indexOf()
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
        // System.out.println(item + ",");
        // }

        // ArrayList<String> lang1 = new ArrayList<>(Arrays.asList(arr));
        // System.out.println("ArrayList:- " + lang1);

        // ArrayList<String> lang = new
        // ArrayList<>(Arrays.asList("java","pyhton","c++","c"));
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
        // // for(String item:lang){
        // // System.out.println(item + ",");
        // // }

        // Iterator<String> it = lang.iterator();
        // while (it.hasNext()) {
        // System.out.print(it.next());
        // System.out.println(",");

        // }

        // // Create a new Vector of Strings
        // Vector<String> lang = new Vector<>();

        // // Add elements to the Vector
        // lang.add("Java");
        // lang.add("Python");
        // lang.add("Swift");
        // lang.add("C++");

        // // Method 1: Using System.out.println() to print the entire Vector
        // System.out.println("Vector contents: " + lang);

        // // Method 2: Using Iterator
        // System.out.println("\nIterating using Iterator:");
        // Iterator<String> it = lang.iterator();
        // while (it.hasNext()) {
        // System.out.print(it.next());
        // System.out.println(",");

        // ArrayList<Integer> num = new ArrayList<>();
        // num.add(3);
        // num.add(4);
        // num.add(1);
        // num.add(2);
        // System.out.println("unsorted:- " + num);
        // num.sort(Comparator.naturalOrder());
        // System.out.println("sorted array:- "+num);

        // ArrayList<Integer> num1 = (ArrayList<Integer>)num.clone();
        // System.out.println("clome:- " + num1);

        // ArrayList<String> lang = new ArrayList<>();
        // lang.ensureCapacity(2);
        // lang.add("java");
        // lang.add("Pyhton");
        // lang.add("Swift");
        // lang.add("C++");
        // System.out.println("ArrayList:- "+lang);

        // ArrayList<Integer> num = new ArrayList<>();
        // num.add(3);
        // num.add(4);
        // num.add(1);
        // num.add(2);
        // System.out.println("unsorted:- " + num);

        // int pos = num.indexOf(4);
        // System.out.println("index:- "+pos);\

        // Stack <String> fruits = new Stack<>();
        // fruits.push("apple");
        // fruits.push("banana");
        // fruits.push("mango");
        // fruits.push("grapes");
        // System.out.println("stack:- " + fruits);
        // System.out.println(fruits.pop());

        // String ele = fruits.peek();
        // System.out.println(ele);
        // System.out.println(fruits);

        // int pos = fruits.search("mango");
        // int pos=fruits.indexOf("mango");
        // System.out.println(pos);
        // boolean result = fruits.isEmpty();
        // System.out.println(result);

        // Queue
        // Queue a = new LinkedList<>();
        // add()
        // offer()
        // element()
        // peek()
        // remove()
        // poll()
        // Queue<String> a = new LinkedList<>();
        // a.offer("apple");
        // a.offer("app");
        // a.offer("appl");
        // a.offer("ple");

        // System.out.println(a.peek());
        // System.out.println(a.poll());
        // System.out.println(a);

        // Queue<Integer> a = new PriorityQueue<>();
        // a.offer(3);
        // a.offer(2);
        // a.offer(1);
        // a.offer(4);
        // System.out.println(a);
        // System.out.println(a.peek());
        // System.out.println(a.poll());

        // PriorityQueue<Integer> a = new PriorityQueue<>();
        // a.offer(1);

        // a.add(3);
        // a.add(2);
        // System.out.println(a);

        // a.offer(1);
        // System.out.println(a);

        // Iterator<Integer> num = a.iterator();
        // while (num.hasNext()) {
        // System.out.print(num.next());
        // System.out.print(", ");
        // }


//     }
// }

// class c1{
//     public static void main(String[] args) {
        
//         PriorityQueue<Integer> num = new PriorityQueue<>();
//         num.add(3);
//         num.add(4);
//         num.add(1);
//         num.add(2);

//         System.out.println(num);
//     }
// }
// class compr implements Comparator<Integer>{
//     public int compare(Integer num1,Integer num2){
//         int value = num1.compareTo(num2);
//         if(value>0){
//             return -1;

//         }
//         else if(value<0){
//             return  1;
//         }
//         else{
//             return 0;
//         }
        
//     }
// }

// class Collection{
//     public static void main(String[] args) {
//       String x = "asda@#$123";
//       String str = "";
//       String num= "";
//       String spe = "";
//       for (int i=0;i<11;i++){
//         if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122)
//             str=str+x.charAt(i);
//         else
//             if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57)
//                 num=num+x.charAt(i);
//             else
//                 spe+=x.charAt(i);
//       }
//       System.out.println(str+num+spe);
//     }
// }
class Collection{
    public static void main(String[] args) {
        /* 
         addFirst()
         addLast()
         offerFirst()
         offerLast()
         getFirst()
         getLast()
         removeFirst()
         removeLast()
         pollFirst()
         pollLast()
         */
        // Deque<Integer> num = new ArrayDeque<>();
        // num.offer(1);
        // num.offerLast(2);
        // num.offerFirst(3);
        // System.out.println(num);
        // prev
        // next
        // data

        // LinkedList<String> animal = new LinkedList<>();
        // animal.add("lion");
        // animal.add("leopard");
        // animal.add("goat");
        // animal.add("dog");
        // System.out.println(animal);
        // animal.add(2,"tiger");
        // System.out.println(animal);

        // Map<String,Integer> num = new HashMap<>();
        // num.put("one", 1);
        // num.put("Two", 2);
        // num.put("Three", 3);
        // num.put("Four", 4);
        // System.out.println(num);
        // System.out.println(num.keySet());
        // System.out.println(num.values());
        // System.out.println(num.entrySet());

        // HashMap
        // HashMap<String,Integer> lang = new HashMap<>();
        // lang.put("rollno",123 );
        // lang.put("rollno1",1234 );
        // lang.put("rollno2",12345 );
        // lang.put("rollno3",123456 );
        // System.out.println(lang.get("rollno"));

        // for(String i:lang.keySet()){
        //     System.out.println(i);
            
        // }
// TreeMap<String ,Integer> num = new TreeMap<>();
// num.put("two", 2);
// num.put("three", 3);
// System.out.print(num);
// HashMap<String,Integer> lang = new HashMap<>(num);
// lang.put("one", 1);
// System.out.print(lang);

// LinkedHashMap<String,Integer> num = new LinkedHashMap<>();
// num.put("one", 1);
// num.put("two", 2);
// num.put("three",3 );
// System.out.println(num);
// num.putIfAbsent("four", 4);
// System.out.println(num);
// num.putIfAbsent("three",3);
// System.out.println(num);


// TreeMap<String ,Integer> num = new TreeMap<>();
// num.put("two", 2);

// num.put("one", 1);
// num.put("three", 3);
// System.out.println(num);
// num.putIfAbsent("four", 4);

// TreeMap<String ,Integer> num1 = new TreeMap<>();
// num1.put("five", 5);
// num1.putAll(num);
// System.out.println(num1);







    }
}