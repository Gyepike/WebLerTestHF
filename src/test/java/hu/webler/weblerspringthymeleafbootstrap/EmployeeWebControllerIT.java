package hu.webler.weblerspringthymeleafbootstrap;

import hu.webler.weblerspringthymeleafbootstrap.bootstrap.DataLoader;
import hu.webler.weblerspringthymeleafbootstrap.controller.EmployeeController;
import hu.webler.weblerspringthymeleafbootstrap.model.Employee;
import hu.webler.weblerspringthymeleafbootstrap.service.EmployeeServiceImpl;
import hu.webler.weblerspringthymeleafbootstrap.view.model.Paged;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(EmployeeController.class)
@DisplayName("Integration test of EmployeeControler - gyepi")
public class EmployeeWebControllerIT {


    @Autowired
    private MockMvc mockMvc;

    private DataLoader loaderLoader;



    @Autowired
    private EmployeeServiceImpl employeesService;



    /*
    @Test
    @DisplayName("Integration test of StudentWebController - Thymeleaf - to return all students")
    void testThymeleaf_shouldReturnAllStudents2() throws Exception {


    }

 */


    private Paged<Employee> createTestList() {

        List<Employee> employeeList = Arrays.asList(
                new Employee("Gyepi", "Position1", "Bp", null, 1200),
                new Employee("Gyepi", "Position1", "Bp", null, 1200)
                // Add more employees as needed
        );

        Paged<Employee> pagedEmployee = new Paged<>(employeeList, 0, 1);

        return pagedEmployee;
    }
}
