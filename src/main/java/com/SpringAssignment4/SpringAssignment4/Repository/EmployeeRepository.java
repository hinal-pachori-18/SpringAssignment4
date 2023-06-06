package com.SpringAssignment4.SpringAssignment4.Repository;

import com.SpringAssignment4.SpringAssignment4.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
