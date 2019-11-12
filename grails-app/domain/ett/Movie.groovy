package ett


import java.time.LocalDateTime

class Movie {

    int code
    String name
    String gender
    String clasification
    String imagen
    String descripcion

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static constraints = {
        table "movies"

        description sqlType: "text"
    }
}
