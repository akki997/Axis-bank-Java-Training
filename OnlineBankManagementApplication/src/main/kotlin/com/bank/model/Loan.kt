package com.bank.model

class Loan {
    var accountNumber:String=""
    var loanType:String=""
    var principal:Long=0
    var rateOfInterest:Int=0
    var time:Int=0
    var si:Long=0
    var emi:Long=0
    get() = field
    set(value) {
        field=value
    }
}