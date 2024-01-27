package hu.webler.weblerspringthymeleafbootstrap.service;

import hu.webler.weblerspringthymeleafbootstrap.bootstrap.DataLoader;
import hu.webler.weblerspringthymeleafbootstrap.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final DataLoader dataLoader;

    @Override
    public List<Employee> getAllEmployees() {
        return dataLoader.getEmployees();
    }
}
