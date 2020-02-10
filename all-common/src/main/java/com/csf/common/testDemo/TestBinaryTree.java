package com.csf.common.testDemo;

import com.alibaba.fastjson.JSON;

import java.util.*;

public class TestBinaryTree {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 5, 9, 3, 23, 43, 15, 8, 99, 7};
        Node node = new Node(0);
        createBinaryTree(node, arr);
        System.out.println(node);
        /*// DFS
        printDFS(node);
        System.out.println("-------分界线------");
        // BFS
        printBFS(node);
        // 计算深度
        System.out.println("\r\n深度: " + calculate(node));*/
        // 中序
        Set<Integer> set = new LinkedHashSet<>();
        System.out.println(JSON.toJSONString(printDFSMiddleLeft(node.leftChild, node, set)));
        Set<Integer> set1 = new LinkedHashSet<>();
        System.out.println(JSON.toJSONString(printDFSMiddleLeft(node.rightChild, node, set1)));
    }

    private static Set<Integer> printDFSMiddleLeft(Node node, Node nodeFather, Set<Integer> set) {

        if (node.leftChild != null) {
            printDFSMiddleLeft(node.leftChild, node, set);
            set.add(nodeFather.value);
        } else {
            set.add(node.value);
            set.add(nodeFather.value);
            if (node.rightChild != null) {
                printDFSMiddleLeft(node.rightChild, node, set);
            }
            if (nodeFather.rightChild != null) {
                printDFSMiddleLeft(nodeFather.rightChild, nodeFather, set);
            }
        }
        return set;
    }


    private static int calculate(Node node) {
        if (node == null) {
            return 0;
        }
        int left = calculate(node.leftChild);
        int right = calculate(node.rightChild);
        return Math.max(left, right) + 1;
    }

    private static void printBFS(Node node) {
        Queue queue = new LinkedList();
        if (node != null) {
            queue.add(node);
        }
        while (!queue.isEmpty()) {
            node = (Node) queue.poll();
            System.out.print(node.value + " ");
            if (node.leftChild != null) {
                queue.offer(node.leftChild);
            }
            if (node.rightChild != null) {
                queue.offer(node.rightChild);
            }
        }
    }

    // 后进先出 栈
    private static void printDFS(Node node) {
        Stack<Node> stack = new Stack<>();
        if (node != null) {
            stack.push(node);
        }
        // 先序遍历:根-左-右 中序遍历:左-根-右 后序遍历:左-右-根
        while (stack.size() > 0) {
            node = stack.pop();
            System.out.print(node.value + " ");
            if (node.rightChild != null) {
                stack.push(node.rightChild);
            }
            if (node.leftChild != null) {
                stack.push(node.leftChild);
            }
        }

    }

    private static void createBinaryTree(Node node, int[] arr) {
        node.value = arr.length > 0 ? arr[0] : -1;
        for (int i = 1; i < arr.length; i++) {
            insertBinaryTree(node, arr[i]);
        }
    }

    private static void insertBinaryTree(Node node, int value) {
        if (node.value >= value) {
            if (node.leftChild == null) {
                node.leftChild = new Node(value);
                return;
            } else {
                insertBinaryTree(node.leftChild, value);
            }
        } else {
            if (node.rightChild == null) {
                node.rightChild = new Node(value);
                return;
            } else {
                insertBinaryTree(node.rightChild, value);
            }
        }
    }
}

class Node {
    public Node leftChild;
    public Node rightChild;
    public int value;

    public Node(int value) {
        this.value = value;
    }

    public Node() {
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}