package com.skp.band.service;

import com.skp.band.entity.EmployeeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * User: hyungwook.noh@sk.com
 * Date: 2014. 3. 20.
 */
public interface EmployeeManager {
    public void addEmployee(EmployeeEntity employee);
    public Page<EmployeeEntity> getAllEmployees(Pageable pageable);
    public void deleteEmployee(Integer employeeId);
    public void updateEmployee(EmployeeEntity employee);
    public EmployeeEntity getEmployee(Integer employeeId);
}
