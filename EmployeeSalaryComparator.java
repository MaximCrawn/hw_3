


import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee Employee1, Employee Employee2) {
        return Integer.compare(Employee1.getSalary(), Employee2.getSalary());
    }

    
}
