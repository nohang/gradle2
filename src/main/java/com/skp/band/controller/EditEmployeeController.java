package com.skp.band.controller;

import com.skp.band.entity.EmployeeEntity;
import com.skp.band.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: hyungwook.noh@sk.com
 * Date: 2014. 3. 20.
 */
@Controller
public class EditEmployeeController {

    @Autowired
    private EmployeeManager employeeManager;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listEmployees(Pageable pageable,ModelMap map) {
        Page<EmployeeEntity> employee = employeeManager.getAllEmployees(pageable);
        map.addAttribute("employee", new EmployeeEntity());
        map.addAttribute("employeeList", employee.getContent());
        map.addAttribute("totalPages", employee.getTotalPages());

        return "editEmployeeList";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute(value = "employee") EmployeeEntity employee, BindingResult result) {
        employeeManager.addEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping(value = "/update/{employeeId}",method = RequestMethod.GET)
    public String updateEmployee(@PathVariable("employeeId") Integer employeeId,ModelMap map) {
        EmployeeEntity employee = employeeManager.getEmployee(employeeId);
        map.addAttribute("id",employee.getId());
        map.addAttribute("firstname", employee.getFirstname());
        map.addAttribute("lastname", employee.getLastname());
        map.addAttribute("email",employee.getEmail());
        map.addAttribute("telephone",employee.getTelephone());
        map.addAttribute("sex",employee.getSex());
        map.addAttribute("team",employee.getTeam());
        map.addAttribute("floor",employee.getFloor());
        return "updateEmployee";
    }

    @RequestMapping(value = "/update/save", method = RequestMethod.POST)
    public String updateEmployee(@ModelAttribute(value = "employee") EmployeeEntity employee, BindingResult result) {
        employeeManager.updateEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete/{employeeId}")
    public String deleteEmployee(@PathVariable("employeeId") Integer employeeId) {
        employeeManager.deleteEmployee(employeeId);
        return "redirect:/";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchEmployee(@PathVariable("col") String col, @PathVariable("search") String search) {

        return "employeeSearchList";
    }

    public void setEmployeeManager(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }


}
