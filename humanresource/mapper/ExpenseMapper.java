package com.berkbektas.humanresource.mapper;

import com.berkbektas.humanresource.client.dto.response.ExpenseDto;
import com.berkbektas.humanresource.client.dto.request.CreateExpenseRequest;
import com.berkbektas.humanresource.model.Expense;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(implementationName = "ExpenseMapperImpl", componentModel = "spring")
public interface ExpenseMapper {

    Expense toExpense(ExpenseDto expenseDto);


    @Mapping(source = "employee.id", target = "employeeId")
    ExpenseDto toExpenseDto(Expense expense);

    Expense toExpenseFromCreateExpenseRequest(CreateExpenseRequest createExpenseRequest);

}
