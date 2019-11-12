package edu.mario.mg

class MovieLanguage {
    Movie movie
    Language language


    static constraints = {
        table"movie_languages"
        description sqlType: "text"
    }
}
