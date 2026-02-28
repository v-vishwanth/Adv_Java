package com.lpu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.lpu.dao.EmployeeDAO;
import com.lpu.Entity.Employee;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping("/reg")
    public String showRegisterPage() {
        return "employeeRegister";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute Employee employee) {
        employeeDAO.saveEmployee(employee);
        return "redirect:/displayAll";
    }

    @GetMapping("/displayAll")
    public String displayAll(Model model) {
        List<Employee> list = employeeDAO.getAllEmployees();
        model.addAttribute("employees", list);
        return "displayAll";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("id") int id) {
        employeeDAO.deleteEmployee(id);
        return "redirect:/displayAll";
    }

    @GetMapping("/edit")
    public String editEmployee(@RequestParam("id") int id, Model model) {
        Employee emp = employeeDAO.getEmployeeById(id);
        model.addAttribute("employee", emp);
        return "updateEmployee";
    }

    @PostMapping("/updateEmployee")
    public String updateEmployee(@ModelAttribute Employee employee) {
        employeeDAO.updateEmployee(employee);
        return "redirect:/displayAll";
    }
}