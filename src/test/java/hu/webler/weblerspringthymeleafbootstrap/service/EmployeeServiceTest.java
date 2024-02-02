package hu.webler.weblerspringthymeleafbootstrap.service;


import hu.webler.weblerspringthymeleafbootstrap.bootstrap.DataLoader;
import hu.webler.weblerspringthymeleafbootstrap.model.Employee;
import hu.webler.weblerspringthymeleafbootstrap.view.model.Paged;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName("Unit test of EmployeeService")
public class EmployeeServiceTest {

    private DataLoader loaderLoader;


    @BeforeEach
    void setUp() {

        loaderLoader = mock(DataLoader.class);

    }


    @Test()
    @DisplayName("Test getEmployees() method with Mock")
    void testGetEmployees_shouldReturnNonEmptyListOfEmployees() { // naming convention: testMethodName_StateUnderTest_ExpectedBehavior instead of this: void testGetStudents()

        // Arrange
        Paged<Employee> mockEmployees = createTestList();


        when(loaderLoader.getEmployees(0)).thenReturn(mockEmployees);

        // Act
        Paged<Employee> employees = loaderLoader.getEmployees(0);


        // Assert
        assertNotNull(employees);
        assertEquals(2, employees.getContents().size());

        Employee emp1 = new Employee("Gyepi", "Position1", "Bp", null, 1200);
        assertEquals(emp1, employees.getContents().get(1));

    }


    @Test()
    @DisplayName("Test getEmployees() method with no Mock")
    void testGetEmployees_shouldReturnNonEmptyListOfEmployeesWithOutMock() { // naming convention: testMethodName_StateUnderTest_ExpectedBehavior instead of this: void testGetStudents()

        // Arrange
        Employee emp1 = new Employee("Employee 2", "Position 2", "Office 2", null, 51000.0);

        // Act
        Paged<Employee> employees = loaderLoader.getEmployees(0);


        // Assert
        assertNotNull(employees);
        assertEquals(10, employees.getContents().size());


        Employee emp2 = employees.getContents().get(1);
        emp2.setStartDate(null);

        assertEquals(emp1, emp2);

    }


    private Paged<Employee> createTestList() {

        List<Employee> employeeList = Arrays.asList(new Employee("Gyepi", "Position1", "Bp", null, 1200), new Employee("Gyepi", "Position1", "Bp", null, 1200)
                // Add more employees as needed
        );

        return new Paged<>(employeeList, 0, 1);
    }
}