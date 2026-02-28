package com.lpu.dao;

import java.util.List;
import jakarta.persistence.*;
import org.springframework.stereotype.Repository;
import com.lpu.Entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("dev");

    @Override
    public void saveEmployee(Employee employee) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Employee> getAllEmployees() {
        EntityManager em = emf.createEntityManager();
        List<Employee> list =
                em.createQuery("from Employee", Employee.class).getResultList();
        em.close();
        return list;
    }

    @Override
    public Employee getEmployeeById(int id) {
        EntityManager em = emf.createEntityManager();
        Employee emp = em.find(Employee.class, id);
        em.close();
        return emp;
    }

    @Override
    public void updateEmployee(Employee employee) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(employee);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void deleteEmployee(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Employee emp = em.find(Employee.class, id);
        em.remove(emp);
        em.getTransaction().commit();
        em.close();
    }
}