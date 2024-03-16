package hw_3;
public class Main {
    public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.addLast("1");
    list.addLast("2");
    list.addLast("3");
    list.addLast("4");
    list.addFirst("5");

    // Использование цикла for-each для перебора элементов списка
    System.out.println("Элементы до удаления");
    for (String element : list) {
        System.out.println(element);
    }
    list.removeFirst();
    System.out.println("Элементы после удаления");
    // Использование цикла for-each для перебора элементов списка
    for (String element : list) {
        System.out.println(element);
    }
}
}
