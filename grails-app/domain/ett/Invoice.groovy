package ett



import java.text.DecimalFormat

class Invoice {


    int code
    Date date
    DecimalFormat total

    static constraints = {
        table "invoices"
        description sqlType: "text"
    }
}
