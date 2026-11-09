package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployeeByOrder(List<Employee> employees) {

        Comparator<Employee> employeeCompare = (first, second) -> {
            if (first.getAge() > second.getAge()) {
                return 1;
            }
            if (first.getAge() < second.getAge()) {
                return -1;
            }
            return first.getName().compareTo(second.getName());
        };

        Set<Employee> sortedEmploees = new TreeSet<>(employeeCompare);
        sortedEmploees.addAll(employees);
        return sortedEmploees;
    }
}
