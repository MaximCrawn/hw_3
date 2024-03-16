package hw_3;
public class Main {
    public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.addFirst("1");
    list.addFirst("2");
    list.addFirst("3");
    list.addFirst("4");
    list.addFirst("5");

    // Использование цикла for-each для перебора элементов списка
    for (String element : list) {
        System.out.println(element);
    }
}
}
