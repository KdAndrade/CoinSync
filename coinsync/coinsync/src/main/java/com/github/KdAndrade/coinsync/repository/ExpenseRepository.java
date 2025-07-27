package com.github.KdAndrade.coinsync.repository;

import com.github.KdAndrade.coinsync.expense.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
