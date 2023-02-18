package com.pythagorasweb.springbootcamp.Service;

import com.pythagorasweb.springbootcamp.Model.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {

    //static list of rooms
    private static List<Room> rooms = new ArrayList<>();

    static {
        for(int i=0; i<10; i++){
            rooms.add(new Room(i, "Room" + i, "R" + i, "Q" + i));
        }
    }

    // return list of rooms
    public List<Room> getAllRooms(){
        return rooms;
    }
}
