package com.berkbektas.humanresource.controller;

import com.berkbektas.humanresource.client.dto.request.CreateExpenseRequest;
import com.berkbektas.humanresource.client.dto.ExpenseDto;

import com.berkbektas.humanresource.service.ExpenseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/expense")
public class ExpensesController {
    private final ExpenseService expenseService;

    public ExpensesController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public ResponseEntity<ExpenseDto> createExpense(@RequestBody CreateExpenseRequest expenseRequestDto){
        return ResponseEntity.ok(expenseService.createExpense(expenseRequestDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<ExpenseDto>> getAllExpenseByEmployeeId(@PathVariable Integer id){
        return ResponseEntity.ok(expenseService.getAllExpenseByEmployeeId(id));
    }

    @GetMapping
    public ResponseEntity<List<ExpenseDto>> getAllExpense(){
        return ResponseEntity.ok(expenseService.getAllExpense());
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable Integer id){
        expenseService.deleteExpense(id);
    }




}
