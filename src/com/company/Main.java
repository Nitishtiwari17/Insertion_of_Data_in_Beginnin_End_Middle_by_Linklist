package com.company;
import java.util.Scanner;
public class Main {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void creation() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("enter the data:");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                System.out.print("enter 1 to insert the item at beginning,2 to insert the item at the head at the end,3 to insert the item at the middle:");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;
                    case 2:
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;
                    case 3:
                        System.out.print("enter position of node to be inserted:");
                        p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < (p - 1); i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                }
            }
                System.out.print("Do u want to more data.If Yes,press 1:");
                n = sc.nextInt();
            }
            while (n == 1);
        }
        public void traverser()
        {
            Node temp = head;
            if (head == null) {
                System.out.print("LL does not exist");
            } else {
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
            }
        }
        public static void main(String[] args)
        {
            Main L1 = new Main();
            L1.creation();
            L1.traverser();
        }

    }