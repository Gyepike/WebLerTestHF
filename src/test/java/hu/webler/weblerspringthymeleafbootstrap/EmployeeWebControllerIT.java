package hu.webler.weblerspringthymeleafbootstrap;

import hu.webler.weblerspringthymeleafbootstrap.controller.EmployeeController;
import hu.webler.weblerspringthymeleafbootstrap.service.EmployeeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(EmployeeController.class)
@DisplayName("Integration test of EmployeeControler - gyepi")
public class EmployeeWebControllerIT {


    @Autowired
    private MockMvc mockMvc;


    @MockBean
    private EmployeeServiceImpl employeesService;


    @Test
    @DisplayName("Integration test of EmployeesController to return all students")
    void shouldReturnAllEmployees() {
        //TODO
    }

    @BeforeEach
    void setUp() {
        //TODO
    }


}
