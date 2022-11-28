//package com.berkbektas.humanresource.controller;
//
//import com.berkbektas.humanresource.client.dto.request.CreateExpenseRequestDto;
//import com.berkbektas.humanresource.client.dto.response.ExpenseResponseDto;
//import com.berkbektas.humanresource.service.ExpenseService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/v1/expense")
//public class ExpensesController {
//    private final ExpenseService expenseService;
//
//    public ExpensesController(ExpenseService expenseService) {
//        this.expenseService = expenseService;
//    }
//
//    @PostMapping
//    public ResponseEntity<Boolean> createExpense(@RequestBody CreateExpenseRequestDto expenseRequestDto){
//        return ResponseEntity.ok(expenseService.createExpense(expenseRequestDto));
//    }
//
//    @GetMapping
//    public ResponseEntity<List<ExpenseResponseDto>> getAllExpense(){
//        return ResponseEntity.ok(expenseService.getAllExpense());
//    }
//
//}
