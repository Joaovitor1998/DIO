package com.dio.saladereuniao.controllers;

import com.dio.saladereuniao.exceptions.ResourceNotFoundException;
import com.dio.saladereuniao.models.Room;
import com.dio.saladereuniao.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class RoomController {

    @Autowired
    RoomRepository roomRepository;

    @PostMapping("/rooms")
    public Room create(@Validated @RequestBody Room room){
        return this.roomRepository.save(room);
    }

    @PutMapping("/rooms/{id}")
    public ResponseEntity<Room> update(@PathVariable(value = "id") Long roomId,
                                       @Validated @RequestBody Room roomDetails) throws ResourceNotFoundException{
        Room room = this.idNotFound(roomId);
        room.setName(roomDetails.getName());
        room.setDate(roomDetails.getDate());
        room.setStartHour(roomDetails.getStartHour());
        room.setEndHour(roomDetails.getEndHour());
        final Room updateRoom = this.roomRepository.save(room);
        return ResponseEntity.ok(updateRoom);
    }

    @DeleteMapping("/rooms/{id}")
    public Map<String, Boolean> delete(@PathVariable(value = "id") Long roomId) throws ResourceNotFoundException{
        Room room = this.idNotFound(roomId);
        this.roomRepository.delete(room);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Deleted", Boolean.TRUE);
        return response;
    }

    @GetMapping("/rooms")
    public List<Room> get(){
        return this.roomRepository.findAll();
    }

    @GetMapping("/rooms/{id}")
    public ResponseEntity<Room> getById(@PathVariable(value="id") Long roomId) throws ResourceNotFoundException{
        Room room = this.roomRepository.findById(roomId)
                .orElseThrow(()->new ResourceNotFoundException("Room not found:: " + roomId));
        return ResponseEntity.ok().body(room);
    }

    public Room idNotFound(Long id) throws ResourceNotFoundException{
        return this.roomRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Room not found with id:: " + id));
    }
}

