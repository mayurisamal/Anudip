package collection_interfaces;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet to store Integer values
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Insert values into the TreeSet
        treeSet.add(10);  // Add the value 10 to the TreeSet
        treeSet.add(20);  // Add the value 20 to the TreeSet
        treeSet.add(5);   // Add the value 5 to the TreeSet
        treeSet.add(15);  // Add the value 15 to the TreeSet
        treeSet.add(30);  // Add the value 30 to the TreeSet

        // TreeSet does not allow duplicate values
        treeSet.add(10);  // This value is a duplicate and will not be added

        // Print the values in the TreeSet
        // Since TreeSet stores elements in a sorted order, they will be printed in ascending order
        System.out.println("Values in the TreeSet: " + treeSet);
    }
}
