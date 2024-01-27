package hu.webler.weblerspringthymeleafbootstrap.controller;

import hu.webler.weblerspringthymeleafbootstrap.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;


}
