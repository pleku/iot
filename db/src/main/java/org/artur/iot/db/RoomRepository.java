package org.artur.iot.db;

import org.artur.iot.db.data.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, String> {

}