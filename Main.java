

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    Employee employee1 = new Employee("Евгений", 18, 40000);
    Employee employee2 = new Employee("Станислав", 30, 20000);
    Employee employee3 = new Employee("Дмитрий", 25, 25000);
    Employee employee4 = new Employee("Сергей", 40, 30000);

    System.out.println();

    ArrayList<Employee> listWorker = new ArrayList<>(List.of(employee1,employee2,employee3,employee4));

    Collections.sort(listWorker, new EmployeeSalaryComparator());

    for (Employee employee : listWorker) {
            System.out.println(employee);
    }

    if (employee1.compareTo(employee2) == 1) {
        System.out.format("Возраст %s больше возраста %s\n", employee1.getName(), employee2.getName());
    } else {
        System.out.format("Возраст %s меньше возраста %s\n", employee1.getName(), employee2.getName());
    }

    if (employee2.compareTo(employee3) == 1) {
        System.out.format("Возраст %s больше возраста %s\n", employee2.getName(), employee3.getName());
    } else {
        System.out.format("Возраст %s меньше возраста %s\n", employee2.getName(), employee3.getName());
    }

    if (employee3.compareTo(employee4) == 1) {
        System.out.format("Возраст %s больше возраста %s\n", employee3.getName(), employee4.getName());
    } else {
        System.out.format("Возраст %s меньше возраста %s\n", employee3.getName(), employee4.getName());
    }

    if (employee4.compareTo(employee1) == 1) {
        System.out.format("Возраст %s больше возраста %s\n", employee4.getName(), employee1.getName());
    } else {
        System.out.format("Возраст %s меньше возраста %s\n", employee4.getName(), employee1.getName());
    }
}
}
