package hu.webler.weblerspringthymeleafbootstrap.controller;

import hu.webler.weblerspringthymeleafbootstrap.service.EmployeeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeServiceImpl employeeServiceImpl;

    @GetMapping("/employees")
    @ResponseBody
    public String renderEmployees(Model mode) {
        mode.addAttribute("employees", employeeServiceImpl.getAllEmployees());
        return "index";
    }
}
