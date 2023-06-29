package org.jspiders.customerapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.jspiders.customerapi.model.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RoomRequest {
    private User user;
}
