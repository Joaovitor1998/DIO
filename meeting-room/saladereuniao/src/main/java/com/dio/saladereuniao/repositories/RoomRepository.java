package com.dio.saladereuniao.repositories;

import com.dio.saladereuniao.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {



}
