package edu.mario.mg

import edu.mario.mg.utils.Constants

import java.time.LocalDateTime

class Room {

    int code
    int num_column
    int num_row
    



    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "rooms"

        description sqlType: "text"
    }

}
