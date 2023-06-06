package com.SpringAssignment4.SpringAssignment4.Service;

import com.SpringAssignment4.SpringAssignment4.Repository.EmployeeRepository;
import com.SpringAssignment4.SpringAssignment4.entities.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

        private static Logger logger = LoggerFactory.getLogger(Employee.class);
        @Autowired
        private EmployeeRepository employeeRepository;

        @Override
        public List<Employee> showAllEmployees() {
                return employeeRepository.findAll();
        }

        @Override
        public Optional<Employee> showEmployeeById(long empId) {
               return employeeRepository.findById(empId);
        }

        @Override
        public Employee addEmployee(Employee employee) {
               return employeeRepository.save(employee);
        }

        @Override
        public Employee updateEmployee(Employee employee) {
             employeeRepository.save(employee);
            return employee;
        }

        @Override
        public void deleteEmployee(long l) {
                employeeRepository.deleteById(l);
        }
}
