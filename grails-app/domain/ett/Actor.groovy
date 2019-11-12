package ett

class Actor {

    int code
    String first_name
    String last_name





    static constraints = {
        table "actors"

        description sqlType: "text"
    }
}
