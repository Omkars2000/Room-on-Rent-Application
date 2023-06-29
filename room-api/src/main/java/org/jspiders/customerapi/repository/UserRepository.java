package org.jspiders.customerapi.repository;

import org.jspiders.customerapi.dto.RoomResponse;
import org.jspiders.customerapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
     @Query("select new org.jspiders.customerapi.dto.RoomResponse(u.userName,r.roomType) from User u join u.roomList r")
    public List<RoomResponse> getJoinInformation();

//     @Query("select new org.jspiders.customerapi.dto.RoomResponse(u.userName,u.contactNo,r.roomLocation) form User u join u.roomList r")
//     public List<RoomResponse> getOwnerInformation();
}
