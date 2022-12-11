package com.berkbektas.humanresource.service;

import com.berkbektas.humanresource.client.dto.response.ExpenseDto;
import com.berkbektas.humanresource.client.dto.request.CreateExpenseRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExpenseService {
    ExpenseDto createExpense(CreateExpenseRequest expenseRequestDto);

    List<ExpenseDto> getAllExpenseByEmployeeId(Integer id);

    List<ExpenseDto> getAllExpense();



    void deleteExpense(Integer id);
}
