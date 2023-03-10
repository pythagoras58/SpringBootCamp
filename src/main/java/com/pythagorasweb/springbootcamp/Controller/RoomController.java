package com.pythagorasweb.springbootcamp.Controller;

import com.pythagorasweb.springbootcamp.Model.Room;
import com.pythagorasweb.springbootcamp.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }


    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("rooms",this.roomService.getAllRooms());
        return "rooms";
    }
}
