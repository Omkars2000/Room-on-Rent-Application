package org.jspiders.customerapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "room_info")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private int roomId;
    @Column(name = "room_type")
    private String roomType;
    @Column(name = "room_location")
    private String roomLocation;
    @Column(name = "room_rent")
    private double roomRent;
//    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
//    @JoinColumn(name = "owner_ref")
//    private User userRef;
}
