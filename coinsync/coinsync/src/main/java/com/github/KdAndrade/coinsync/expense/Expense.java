package com.github.KdAndrade.coinsync.expense;

import com.github.KdAndrade.coinsync.room.Room;
import com.github.KdAndrade.coinsync.user.User;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private BigDecimal value;
    @ManyToOne
    private User debtor;
    @ManyToOne
    private User creditor;
    @ManyToOne
    private Room room;
    private boolean isPrivate;

    public Expense() {}

    public Expense(String title, BigDecimal value, User debtor, User creditor, Room room, boolean isPrivate) {
        this.title = title;
        this.value = value;
        this.debtor = debtor;
        this.creditor = creditor;
        this.room = room;
        this.isPrivate = isPrivate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public User getDebtor() {
        return debtor;
    }

    public void setDebtor(User debtor) {
        this.debtor = debtor;
    }

    public User getCreditor() {
        return creditor;
    }

    public void setCreditor(User creditor) {
        this.creditor = creditor;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }
}
