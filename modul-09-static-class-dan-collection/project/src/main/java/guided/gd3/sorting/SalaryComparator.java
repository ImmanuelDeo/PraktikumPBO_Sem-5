package guided.gd3.sorting;

import java.util.Comparator;

public class SalaryComparator implements java.util.Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getSalary(), e2.getSalary());
    }

}
