package edu.mario.mg

class MovieActor {

    Movie movie
    Actor actor

    static constraints = {
        table "movie_actors"

        description sqlType: "text"
    }
}
