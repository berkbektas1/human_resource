package com.berkbektas.humanresource.service.impl;

import com.berkbektas.humanresource.client.dto.request.UpdateExpenseRequest;
import com.berkbektas.humanresource.client.dto.response.ExpenseDto;
import com.berkbektas.humanresource.client.dto.request.CreateExpenseRequest;
import com.berkbektas.humanresource.mapper.ExpenseMapper;
import com.berkbektas.humanresource.model.Expense;
import com.berkbektas.humanresource.repository.EmployeeRepository;
import com.berkbektas.humanresource.repository.ExpensesRepository;
import com.berkbektas.humanresource.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class ExpenseServiceImpl implements ExpenseService {
    private final ExpensesRepository expensesRepository;
    private final EmployeeRepository employeeRepository;
    private final ExpenseMapper expenseMapper;


    @Override
    public ExpenseDto createExpense(CreateExpenseRequest createExpenseRequest) {
        var employeeOptional = employeeRepository.findById(createExpenseRequest.getEmployee_id())
                .orElseThrow(() -> new RuntimeException("Kullanıcı bulunamadı"));

        var expense = expenseMapper.toExpenseFromCreateExpenseRequest(createExpenseRequest);
        expense.setEmployee(employeeOptional);
        expensesRepository.save(expense);
        return expenseMapper.toExpenseDto(expense);

    }

    @Override
    public List<ExpenseDto> getAllExpenseByEmployeeId(@PathVariable Integer id){
        var expenseList = expensesRepository.findAllExpenseByEmployeeId(id);
        return expenseList.stream()
                .map(expenseMapper::toExpenseDto)
                .toList();
    }

    @Override
    public List<ExpenseDto> getAllExpense() {
        var expenseList = expensesRepository.findAll();
        return expenseList.stream()
                .map(expenseMapper::toExpenseDto)
                .toList();
    }

    @Override
    public ExpenseDto updateExpenseById(Integer id, UpdateExpenseRequest updateExpenseRequest) {
        Optional<Expense> expenseOptional = expensesRepository.findById(id);

        expenseOptional.ifPresent(expense -> {
            expense.setReceiptDate(updateExpenseRequest.getReceiptDate());
            expense.setTaxRate(updateExpenseRequest.getTaxRate());
            expense.setTypeOfExpenditure(updateExpenseRequest.getTypeOfExpenditure());
            expense.setDescription(updateExpenseRequest.getDescription());
            expense.setSpendingAmount(updateExpenseRequest.getSpendingAmount());
            expensesRepository.save(expense);
        });
        return expenseOptional.map(expenseMapper::toExpenseDto)
                .orElseThrow(() -> new RuntimeException("Expense not found"));
    }

    @Override
    public void deleteExpense(Integer id) {
        expensesRepository.deleteById(id);
    }
}
