package com.aktepe.mucahit;

public class BinaryTree {
    int COUNT = 5;
    private Node root;
    private int n;

    // number of nodes
    public Node getRoot() {
        return root;
    }

    // number of nodes
    public final int size() {
        return n;
    }

    // is tree empty?
    public final boolean isEmpty() {
        return n != 0;
    }

    // add root to empty tree
    void addRoot(int value) {
        root = new Node(value);
        n = 1;
    }

    public void addMultiple(int[] numbers) {
        for (int number : numbers) {
            add(root, number);
        }
    }

    // Add node to the tree
    public void add(Node root, int value) {
        if (root == null) {
            System.out.println("Please create the root node with addRoot method");
            return;
        }

        Node parent = null;

        while (root != null) {
            parent = root;
            if (value < root.getValue())
                root = root.getLeft();
            else
                root = root.getRight();
        }

        Node newNode = new Node(value);
        newNode.setParent(parent);

        if (newNode.getValue() < parent.getValue())
            parent.setLeft(newNode);
        else
            parent.setRight(newNode);

        n += 1;
    }

    public void print() {
        special_print(this.root, 0);
    }

    private void special_print(Node root, int space) {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        special_print(root.getRight(), space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.getValue() + "\n");

        // Process left child
        special_print(root.getLeft(), space);
    }
}
