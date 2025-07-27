package com.github.KdAndrade.coinsync.controller;

import com.github.KdAndrade.coinsync.expense.Expense;
import com.github.KdAndrade.coinsync.repository.ExpenseRepository;
import com.github.KdAndrade.coinsync.repository.RoomRepository;
import com.github.KdAndrade.coinsync.repository.UserRepository;
import com.github.KdAndrade.coinsync.room.Room;
import com.github.KdAndrade.coinsync.user.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseRepository expenseRepository;
    private final UserRepository userRepository;
    private final RoomRepository roomRepository;

    public ExpenseController(ExpenseRepository expenseRepository, UserRepository userRepository, RoomRepository roomRepository) {
        this.expenseRepository = expenseRepository;
        this.userRepository = userRepository;
        this.roomRepository = roomRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Expense create(@RequestBody Expense expense) {
        return expenseRepository.save(expense);
    }

    @GetMapping("/room/{roomId}")
    public List<Expense> listByRoom(@PathVariable Long roomId) {
        Room room = roomRepository.findById(roomId).orElseThrow();
        return expenseRepository.findAll().stream()
                .filter(e -> room.equals(e.getRoom()))
                .toList();
    }
}
