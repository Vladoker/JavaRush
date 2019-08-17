package com.javarush.task.task08.task0807;

import java.util.*;

/* 
LinkedList и ArrayList
*/

public class Solution {
    public static Object createArrayList() {
        return new ArrayList<>();
    }

    public static Object createLinkedList() {
        return new LinkedList();
    }

    public static void main(String[] args) {
        createArrayList();
        createLinkedList();

    }
}
