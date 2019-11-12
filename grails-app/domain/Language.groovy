package edu.mario.mg

class Language {
    int code
    String name
    String iso


    static constraints = {
        table "languages"
        description sqlType: "text"
    }
}
