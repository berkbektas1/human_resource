//package com.berkbektas.humanresource.mapper;
//
//import com.berkbektas.humanresource.client.dto.request.CreateExpenseRequestDto;
//import com.berkbektas.humanresource.client.dto.response.ExpenseResponseDto;
//import com.berkbektas.humanresource.model.Expense;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ExpenseMapper {
//    public Expense dtoToEntity(CreateExpenseRequestDto expenseRequestDto){
//        Expense expense = new Expense();
//        expense.setTypeOfExpenditure(expenseRequestDto.getTypeOfExpenditure());
//        expense.setReceiptDate(expenseRequestDto.getReceiptDate());
//        expense.setSpendingAmount(expenseRequestDto.getSpendingAmount());
//        expense.setTaxRate(expenseRequestDto.getTaxRate());
//        expense.setDescription(expenseRequestDto.getDescription());
//        return expense;
//
//    }
//
//
//    public ExpenseResponseDto entityToDto(Expense expense){
//        ExpenseResponseDto expenseResponseDto = new ExpenseResponseDto();
//
//        expenseResponseDto.setEmployeeName(expense.getEmployee().getFirstName());
//        expenseResponseDto.setTypeOfExpenditure(expense.getTypeOfExpenditure());
//        expenseResponseDto.setReceiptDate(expense.getReceiptDate());
//        expenseResponseDto.setSpendingAmount(expense.getSpendingAmount());
//        expenseResponseDto.setTaxRate(expense.getTaxRate());
//        expenseResponseDto.setDescription(expense.getDescription());
//
//        return expenseResponseDto;
//    }
//}
