package org.jspiders.customerapi.service;

import org.jspiders.customerapi.dto.RoomRequest;
import org.jspiders.customerapi.dto.RoomResponse;
import org.jspiders.customerapi.model.Room;
import org.jspiders.customerapi.model.User;
import org.jspiders.customerapi.repository.RoomRepository;
import org.jspiders.customerapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.Blob;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    private UserRepository userRepository;

    public User placeRooms(RoomRequest request){
        return userRepository.save(request.getUser());
    }
    public List<User> findAllRooms(){
        return userRepository.findAll();
    }
    public Map<String,Object> getAllRoom(int id){
        Map<String,Object> data=new LinkedHashMap<>();
        Room r=roomRepository.findById(id).orElse(null);
       if(r!=null) {
           data.put("USER_Id", r.getRoomId());
           data.put("ROOM_TYPE", r.getRoomType());
           data.put("ROOM_LOCATION", r.getRoomLocation());
//           data.put("OWNER ID", r.getUserRef().getUserId());
//           data.put("OWNER NAME", r.getUserRef().getUserName());
//           data.put("OWNER CONTACT", r.getUserRef().getContactNo());
       }
        return data;
    }


    public void save(Object c) {

    }

    public List<RoomResponse> findUserAndRoom() {
        return userRepository.getJoinInformation();
    }

    public List<RoomResponse> findUserInfo() {
//        return userRepository.getOwnerInformation();
        return null;
    }

//    public Map<String, Object> getAll() {
//
//    }
//  public void addRoom(MultipartFile file) throws IOException {
//    Room r1=new Room(file.getBytes());
//    repository.save(r1);
//  }
}
