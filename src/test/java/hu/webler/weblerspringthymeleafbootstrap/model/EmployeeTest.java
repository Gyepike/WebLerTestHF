package hu.webler.weblerspringthymeleafbootstrap.model;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Unit test of Emp Class")
public class EmployeeTest {

    // Test Compare to updated Employee
    @Test
    @DisplayName("Test compareTo() method in Employee Class")
    void testCompareTo_SameLastName() {
        // Arrange
        Employee emp1 = new Employee("Gyepi", "Position1", "Bp", null, 1200);
        Employee emp2 = new Employee("Gyepi", "Position1", "Bp", null, 1200);

        int expected = 0;

        // Act
        int actual = emp1.compareTo(emp2);
        boolean isTrue = expected == actual;


        // Assert
        assertEquals(expected, actual, "Expecting 0 because the last name are the same!"); // Expecting 0 because last names are the same
        assertNotEquals(1, emp1.compareTo(emp2)); // Expecting 0 because last names are the same
        assertTrue(isTrue);

    }


}
