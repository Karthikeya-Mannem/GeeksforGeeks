//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

public class Main {
    // Function to insert a node at the end of the Doubly Linked List
    public static void push(Node tail, int new_data) {
        Node newNode = new Node(new_data);
        newNode.next = null;
        newNode.prev = tail;

        if (tail != null) {
            tail.next = newNode;
        }
    }

    // Function to print nodes in a given doubly linked list
    public static void printList(Node head) {
        if (head == null) {
            return;
        }
        if (!verify(head)) {
            return;
        }
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Main driver function
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String[] arr = br.readLine().trim().split(" ");

            Node head = new Node(Integer.parseInt(arr[0]));
            Node tail = head;

            for (int i = 1; i < arr.length; i++) {
                push(tail, Integer.parseInt(arr[i]));
                tail = tail.next;
            }
            int x = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            head = obj.deleteNode(head, x);
            printList(head);
            System.out.println("~");
        }
    }

    // Verifying the doubly linked list
    public static boolean verify(Node head) {
        int forwardLength = 0;
        int backwardLength = 0;

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
            forwardLength++;
        }

        while (temp.prev != null) {
            temp = temp.prev;
            backwardLength++;
        }

        return forwardLength == backwardLength;
    }
}

// } Driver Code Ends


/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        if(head == null){
            return null;
        }
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            if(count == x){
                break;
            }
            temp = temp.next;
        }
        Node back = temp.prev;
        Node front = temp.next;
        if(back == null && front == null){
            return null;
        }else if(back == null){
            Node h1 = head;
            head = head.next;
            h1.next = null;
            head.prev = null;
            return head;
        }else if(front == null){
            Node tail = head;
            while(tail.next != null){
                tail = tail.next;
            }
            Node b1 = tail.prev;
            b1.next = null;
            tail.prev = null;
            return head;
        }
        back.next = front;
        front.prev = back;
        temp.next = null;
        temp.prev = null;
        return head;
    }
}
