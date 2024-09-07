package mylinkedlist;


public class MyLinkedList {
    public static Node head;

    public static int size() {
        Node p = head;
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    public void addToHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addToTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        // Sau câu lenh nay, anh da tim duoc node cuoi cung, va duoc gan cho
        // temp
        // Nhiem vu cuôi cung: Naruto: The Last => Boruto: Naruto Next Generation
        temp.next = newNode;

    }

    // 0
    public void add(int data, int index) {
        Node newNode = new Node(data);
        if (index == 0) {
            addToHead(data);
            return;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
        }
    }

    // BTVN: Viet code cho cac ham sau
    // 1. public int length()
    // 2. public void display()
    // 3. public void deleteFirst()
    public static class LinkedList {
        public static int length() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.getNext();
            }
            System.out.print("So luong node:" + count);
            return count;
        }

        public static void show(int x) {
            System.out.print(x);
        }

        public static void DisplayLinkedList() {
            Node temp = head;
            while (temp != null) {
                show(temp.getData());
                if (temp.getNext() != null) {
                    System.out.printf("-->");
                }
                temp = temp.getNext();
            }
        }

        public static void deleteFirst() {
            System.out.printf("Display da xoa node dau:");
            head = head.getNext();
            LinkedList.DisplayLinkedList();
        }
        // BTVN1: Viết hàm delete theo while. Hint: dùng count++;
        public static void deleted(int key) {
            Node temp = head, prev = null;
            if (temp != null && temp.getData() == key) {
                head = temp.next;
                return;
            }
            while (temp != null && temp.getData() != key) {
                prev = temp;
                temp = temp.next;
            }
            if (temp == null) return;
            prev.next = temp.next;
        }
        //BTVN2: Viết cho anh hàm sort()
        static Node get(int i) {
            Node p = head;
            int count = 0;
            while (p != null && count < i) {
                count++;
                p = p.next;
            }
            return p;
        }

        public static void sort() {
            int n = size();
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    Node pi = get(i), pj = get(j);
                    if (pi.getData() > pj.getData()) {
                        int temp = pi.getData();
                        pi.setData(pj.getData());
                        pj.setData(temp);
                    }
                }
            }
        }
    }
}
