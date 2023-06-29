package org.jspiders.customerapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class RoomResponse {
    private String userName;
    private String roomType;
    private long contactNo ;
    private String roomLocation;

    public RoomResponse(String userName, String roomType) {
        this.userName = userName;
        this.roomType = roomType;
    }

    public RoomResponse(String userName, long contactNo, String roomLocation) {
        this.userName = userName;
        this.contactNo = contactNo;
        this.roomLocation = roomLocation;
    }
}
