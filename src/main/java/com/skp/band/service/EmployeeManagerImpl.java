package com.skp.band.service;

import com.skp.band.entity.EmployeeEntity;
import com.skp.band.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: hyungwook.noh@sk.com
 * Date: 2014. 3. 20.
 */
@Service
public class EmployeeManagerImpl implements EmployeeManager {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public void addEmployee(EmployeeEntity employee) {
        employeeRepository.save(employee);

    }

    @Override
    @Transactional
    public Page<EmployeeEntity> getAllEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable);

    }

    @Override
    @Transactional
    public void deleteEmployee(Integer employeeId) {
        employeeRepository.delete(employeeId);

    }

    @Override
    @Transactional
    public void updateEmployee(EmployeeEntity employee) {
        employeeRepository.save(employee);

    }

    @Override
    @Transactional
    public EmployeeEntity getEmployee(Integer employeeId) {
        return employeeRepository.findOne(employeeId);

    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

}
