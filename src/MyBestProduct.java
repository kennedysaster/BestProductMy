import java.util.*;

public class MyBestProduct {
    public static void main(String[] args) {
        //my list best product using ArrayList //Versão01
        ArrayList<String> mylistProductUsingArray = new ArrayList<String>();

        mylistProductUsingArray.add("Apple");
        mylistProductUsingArray.add("Peach");
        mylistProductUsingArray.add("Cherry");
        mylistProductUsingArray.add("Clementine");
        mylistProductUsingArray.add("Fig");
        mylistProductUsingArray.add("Melon");
        mylistProductUsingArray.add("Orange");
        mylistProductUsingArray.add("Grape");
        mylistProductUsingArray.add("Pineapple");
        mylistProductUsingArray.add("Avocado");


        System.out.println("My List using ArrayList :" + " " + mylistProductUsingArray);
        System.out.println("End List ArrayList");
        System.out.println("-----------------------------------------------------------");

        TreeSet<String> myListProductUsingTreeSet = new TreeSet<String>();

        myListProductUsingTreeSet.add("Apple");
        myListProductUsingTreeSet.add("Peach");
        myListProductUsingTreeSet.add("Cherry");
        myListProductUsingTreeSet.add("Clementine");
        myListProductUsingTreeSet.add("Fig");
        myListProductUsingTreeSet.add("Melon");
        myListProductUsingTreeSet.add("Orange");
        myListProductUsingTreeSet.add("Grape");
        myListProductUsingTreeSet.add("Pineapple");
        myListProductUsingTreeSet.add("Avocado");

        System.out.println("My List using TreeSet :" + " " + myListProductUsingTreeSet);
        System.out.println("End List TreeSet");
        System.out.println("-----------------------------------------------------------");

        Map<Integer, String> myListProductUsingHashMap = new HashMap<>();

        myListProductUsingHashMap.put(1,"Apple");
        myListProductUsingHashMap.put(2,"Peach");
        myListProductUsingHashMap.put(3,"Cherry");
        myListProductUsingHashMap.put(4,"Clementine");
        myListProductUsingHashMap.put(5,"Fig");
        myListProductUsingHashMap.put(6,"Melon");
        myListProductUsingHashMap.put(7,"Orange");
        myListProductUsingHashMap.put(8,"Grape");
        myListProductUsingHashMap.put(9,"Pineapple");
        myListProductUsingHashMap.put(10,"Avocado");

        System.out.println("My List using HashMap :" + " " + myListProductUsingHashMap);
        System.out.println("End List HashMap");
        System.out.println("-----------------------------------------------------------");








    }

}
