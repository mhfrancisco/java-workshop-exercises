package com.gamesys.workshop;

class Child extends Parent {
    public static void main(String[] args) {
        Child child = new Child();
        String intString = Integer.toString(child.arrInt[1][2]);
        System.out.println(intString);
    }
}

class Parent {
    int[][] arrInt = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
}
