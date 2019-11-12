package edu.mario.mg

class Ticket {

    int code
    Projection projection
    Seat seat
    Invoice invoice






    static constraints = {

        table "tickets"
        description sqlType: "text"
    }
}
