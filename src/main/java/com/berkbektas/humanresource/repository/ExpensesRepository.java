package com.berkbektas.humanresource.repository;

import com.berkbektas.humanresource.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpensesRepository extends JpaRepository<Expense, Integer> {
    @Query("""
    SELECT ex
    FROM Expense ex
    WHERE ex.employee.id = :id
    
""")
    List<Expense> findAllExpenseByEmployeeId(Integer id);
}
