package edu.mario.mg


import edu.mario.mg.utils.Constants

import java.time.LocalDateTime

class Seat {

    int code
    int room
    int Posrow
    int  Poscolumn
    boolean available

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "seats "


        description sqlType: "text"
    }
}
