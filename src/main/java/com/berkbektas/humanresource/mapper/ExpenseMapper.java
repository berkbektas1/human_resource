package com.berkbektas.humanresource.mapper;

import com.berkbektas.humanresource.client.dto.ExpenseDto;
import com.berkbektas.humanresource.client.dto.request.CreateExpenseRequest;
import com.berkbektas.humanresource.model.Expense;
import org.mapstruct.Mapper;


@Mapper(implementationName = "ExpenseMapperImpl", componentModel = "spring")
public interface ExpenseMapper {

    Expense toExpense(ExpenseDto expenseDto);

    ExpenseDto toExpenseDto(Expense expense);

    Expense toExpenseFromCreateExpenseRequest(CreateExpenseRequest createExpenseRequest);

}
