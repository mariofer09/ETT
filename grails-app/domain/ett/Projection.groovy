package ett
class Projection {
    int code
    Movie movie
    Room room
    Date date
    int timeInit
    int timeEnd




    static constraints = {
        table "projections"
        description sqlType: "text"
    }
}
