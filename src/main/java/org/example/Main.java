package org.example;

import java.util.ArrayList;
import java.util.List;

class MyHashSet {
    private List<Integer> set;

    public MyHashSet() {
        set = new ArrayList<>();
    }

    public void add(int element) {
        if (!contains(element)) {
            set.add(element);
        }
    }

    public String toString() {
        return set.toString();
    }

    public int get(int index) {
        if (index >= 0 && index < set.size()) {
            return set.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + set.size());
        }
    }

    private boolean contains(int element) {
        for (int i : set) {
            if (i == element) {
                return true;
            }
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        MyHashSet mySet = new MyHashSet();

        mySet.add(1);
        mySet.add(2);
        mySet.add(3);

        System.out.println(mySet.toString());  // Output: [1, 2, 3]

        System.out.println(mySet.get(0));  // Output: 1
        System.out.println(mySet.get(1));  // Output: 2
        System.out.println(mySet.get(2));  // Output: 3
    }
}