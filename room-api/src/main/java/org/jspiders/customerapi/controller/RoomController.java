package org.jspiders.customerapi.controller;

import org.jspiders.customerapi.dto.RoomRequest;
import org.jspiders.customerapi.dto.RoomResponse;
import org.jspiders.customerapi.model.Room;
import org.jspiders.customerapi.model.User;
import org.jspiders.customerapi.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.util.List;
import java.util.Map;

@RestController
public class RoomController {
    @Autowired
    private RoomService service;

//    fro @RestController
    @PostMapping("/shareroom")
    public User sharedRooms(@RequestBody RoomRequest request){
        return service.placeRooms(request);
    }
    @GetMapping("/findallrooms")
    public List<User> findAllRooms(){
        return service.findAllRooms();
    }
    @GetMapping("/getuserrooms")
    public List<RoomResponse> findUserAndRoom(){
        return service.findUserAndRoom();
    }
    @GetMapping("/getuserinfo")
    public List<RoomResponse> findUserInfo(){
        return service.findUserInfo();
    }

    @GetMapping("/getbyid")
    public Map<String ,Object> getById(@RequestParam int id){
        return service.getAllRoom(id);
    }

//   <-------------------- CODE:For Without Rest API-------------->
//    @GetMapping("/")
//    public String getAll(Model model){
//        model.addAttribute("records",service.findAllRooms());
//        return "first";
//    }
//    @GetMapping("/showrooms/{list}")
//    public String printAllRoom( @PathVariable(value = "list") List<Room> roomList, Model model){
//        model.addAttribute("rooms",roomList);
//        return "rooms";
//    }

}
