package com.aktepe.mucahit;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {
                8, 24, 4, 12, 20, 28, 2, 6, 10, 14, 18, 22,
                26, 30, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19,
                21, 23, 25, 27, 29, 31
        };

        BinaryTree tree = new BinaryTree();

        tree.addRoot(16);
        tree.addMultiple(numbers);

        tree.print();
    }
}
