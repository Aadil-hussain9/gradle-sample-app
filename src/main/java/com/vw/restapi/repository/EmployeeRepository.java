package com.vw.restapi.repository;

import com.vw.restapi.model.Employee;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findByName(String name);



    @Query(value = "SELECT e FROM Employee e WHERE " +
            "e.name LIKE CONCAT('%',:query, '%')" +
            "Or e.userId LIKE CONCAT('%',:query, '%')" +
            "Or e.emailId LIKE CONCAT('%', :query, '%')")
    List<Employee> findByQuery(String query);

    List<Employee> findAll(Specification<Employee> search);

    @Query("SELECT e From Employee e WHERE e.name = :name OR e.emailId = :email OR e.userId=:id")
    List<Employee> findByNameOrEmailOrId(@Param("name") String name , @Param("email")String email , @Param("id")Long id);
}
