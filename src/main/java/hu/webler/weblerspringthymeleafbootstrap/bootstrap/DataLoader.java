package hu.webler.weblerspringthymeleafbootstrap.bootstrap;

import hu.webler.weblerspringthymeleafbootstrap.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DataLoader {

    private final List<Employee> employees;

    public DataLoader() {
        this.employees = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            this.employees.add(new Employee("Employee " + (i + 1), "Position " + (i + 1),
                    "Office " + (i + 1), new Date(), 50000 + (i * 1000)));
        }
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }
}
