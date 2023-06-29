package org.jspiders.customerapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_info")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private int userId;
  @Column(name = "user_name")
  private String userName;
  @Column(name = "user_contact")
  private long contactNo;
  @OneToMany(targetEntity = Room.class,cascade = CascadeType.ALL)
  @JoinColumn(name = "owner_ref",referencedColumnName = "user_id")
    private List<Room> roomList;

}
