package com.bradclemson97;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    //Arrays or array lists are used when we have a collection of the same types of objects and we want to hold them

    public static void main(String[] args) {

        //------- ARRAY ------
        //both arrays and array lists have super-fast random access because of using index's

        //An array can hold objects or primite data types
        //An array of strings (e.g. list of friends)
        //this array can hold [4] elements inside it - this is a fixed size, no more no less
        String[] friendsArray = {"John", "Chris", "Eric", "Luke"};

        //Getting values from an array...
        //specify the index of the element you want (e.g. 2nd)
        System.out.println(friendsArray[1]);

        //Getting the length of an array...
        System.out.println(friendsArray.length);

        //Adding an element to the end of an array...WE CAN'T

        //Setting an element in an array...
        friendsArray[0] = "Carl";

        //Remove an element from an array... WE CAN'T

        //------- ARRAYLIST ------

        //An array LIST can hold objects only (can't have an array list of ints)
        //but can get around this by using an associated wrapper class for the int type (Integer)
        //An array list of strings
        //we don't have to specify a size of the array - ArrayLists grow and shrink automatically
        ArrayList<String> friendsArrayList =
                new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));

        //Getting values from an ArrayList...
        //specify the index of the element you want (e.g. 2nd)
        System.out.println(friendsArrayList.get(1));

        //Getting the length of an ArrayList
        //Similar to array but instead this is a method call
        System.out.println(friendsArrayList.size());

        //Adding an element to the end of an ArrayList
        friendsArrayList.add("Mitch");

        //Setting an element in an ArrayList
        friendsArrayList.set(0, "Carl");

        //Remove an element from an ArrayList - can specify index or value
        friendsArrayList.remove("Chris");

        //------- LINKEDLIST ------
        //Linkedlists have slower random access because of having to sequence through pointers

        //The way we create and add elements to a linked list is the same as array list
        //we can use the exact same methods as they both use the 'list' interface
        LinkedList<String> friendsLinkedList = new LinkedList<>();
        friendsLinkedList.add("John");
        friendsLinkedList.add("Paul");
        friendsLinkedList.add("George");
        friendsLinkedList.add("Luke");

        //An arraylist requires a lot of dynamic re-sizing whereas...
        //A linked list has a bunch of different elements within the list, each element has is called a node and each node has a pointer
        //each pointer has a reference to the next node 0>1>2>3>4 etc.
        //the linkedList class in java is a doubly linked list - in addition to having a reference to the next node, each node has a reference to the previous node
        //this is why it takes longer compared to arrays/arrayLists to do the following...
        System.out.println((friendsLinkedList.get(2)));
        friendsLinkedList.add(1, "Jerry");

    }
}
