//package com.berkbektas.humanresource.service.impl;
//
//import com.berkbektas.humanresource.client.dto.request.CreateExpenseRequestDto;
//import com.berkbektas.humanresource.client.dto.response.ExpenseResponseDto;
//import com.berkbektas.humanresource.mapper.ExpenseMapper;
//import com.berkbektas.humanresource.model.Employee;
//import com.berkbektas.humanresource.repository.EmployeeRepository;
//import com.berkbektas.humanresource.repository.ExpensesRepository;
//import com.berkbektas.humanresource.service.ExpenseService;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@Service
//public class ExpenseServiceImpl implements ExpenseService {
//    private final ExpensesRepository expensesRepository;
//    private final EmployeeRepository employeeRepository;
////    private final ExpenseMapper expenseMapper;
//
//    public ExpenseServiceImpl(ExpensesRepository expensesRepository, EmployeeRepository employeeRepository, ExpenseMapper expenseMapper) {
//        this.expensesRepository = expensesRepository;
//        this.employeeRepository = employeeRepository;
//        this.expenseMapper = expenseMapper;
//    }
//
//    @Override
//    public Boolean createExpense(CreateExpenseRequestDto expenseRequestDto) {
//        Optional<Employee> employee = employeeRepository.findById(expenseRequestDto.getEmployee_id());
////        if (employee.isPresent()){
////            var expense = expenseMapper.dtoToEntity(expenseRequestDto);
////            expense.setEmployee(employee.get());
////            expensesRepository.save(expense);
////            return true;
////        }
//
//        return false;
//    }
//
//    @Override
//    public List<ExpenseResponseDto> getAllExpense() {
////        var expenseList = expensesRepository.findAll();
////        return expenseList.stream()
////                .map(expenseMapper::entityToDto)
////                .collect(Collectors.toList());
//        return null;
//    }
//}
