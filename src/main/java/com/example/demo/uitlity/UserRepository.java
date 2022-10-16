package com.example.demo.uitlity;
import com.example.demo.entity.Agency;
import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<Employee,Integer> {

    Optional<Employee> findAllByIp(String ip);

    Optional<Employee> findAllById(Long id);

    Optional<Employee> findAllByIsAdmin(Boolean isAdmin);


    Integer countAllByAgency(Agency agency);



}
