package com.github.KdAndrade.coinsync.controller;

import com.github.KdAndrade.coinsync.repository.RoomRepository;
import com.github.KdAndrade.coinsync.repository.UserRepository;
import com.github.KdAndrade.coinsync.room.Room;
import com.github.KdAndrade.coinsync.user.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    private final RoomRepository roomRepository;
    private final UserRepository userRepository;

    public RoomController(RoomRepository roomRepository, UserRepository userRepository) {
        this.roomRepository = roomRepository;
        this.userRepository = userRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Room create(@RequestBody Room room) {
        return roomRepository.save(room);
    }

    @PostMapping("/{roomId}/members/{userId}")
    public Room addMember(@PathVariable Long roomId, @PathVariable Long userId) {
        Room room = roomRepository.findById(roomId).orElseThrow();
        User user = userRepository.findById(userId).orElseThrow();
        room.getMembers().add(user);
        return roomRepository.save(room);
    }

    @GetMapping
    public List<Room> list() {
        return roomRepository.findAll();
    }
}
