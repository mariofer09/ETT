package edu.mario.mg

import edu.mario.mg.security.UserS

import java.text.DecimalFormat

class Invoice {


    int code
    Date date
    UserS user
    DecimalFormat total

    static constraints = {
        table "invoices"
        description sqlType: "text"
    }
}
