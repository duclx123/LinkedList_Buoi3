import mylinkedlist.MyLinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addToTail(1);
        linkedList.addToTail(2);
        linkedList.addToTail(5);
        linkedList.addToTail(7);
        linkedList.addToTail(6);
        linkedList.addToTail(3);

        MyLinkedList.LinkedList.length();
        System.out.println();
        System.out.printf("Display :");
        MyLinkedList.LinkedList.DisplayLinkedList();
        System.out.println();
        MyLinkedList.LinkedList.deleted(2);
        System.out.println("Chuoi sau khi xoa phan tu tai index 2:");
        MyLinkedList.LinkedList.DisplayLinkedList();
        MyLinkedList.LinkedList.sort();
        System.out.println();
        System.out.println("Chuoi sau khi sap xep:");
        MyLinkedList.LinkedList.DisplayLinkedList();
    }
    //BTVN3:Giải thích tại sao khi a dùng for (int i = 0; i <= index; i++) { temp = temp.next; } thì temp nó là node tại
    // vị trí index còn nếu anh dùng ntn: for (int i = 0; i < index; i++) { temp = temp.next; } thì temp nó là node trước vị trí index
    //Vì khi anh dùng i<= index thì i chạy đến đúng vị trí index còn khi anh dùng i < index i chỉ được phép chạy đến vị trí trước
    //của index
}