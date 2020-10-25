package com.bank.service

import com.bank.dao.CustomerDao
import java.util.*

class LoanService {
    var read=Scanner(System.`in`)
    var customerDao= CustomerDao()
    fun educationLoan() {

        println("*******Welcome To Education Loan*******")
        println("Enter the Account Number")
        var accountNumber= read.next()
        println("Enter the Amount you want to take loan")
        var loanamount:Long=read.nextLong()
        println("Enter the Time period ")
        var time:Int= read.nextInt()
        var type="Education Loan"
        println("ThankYou for taking Education Loan")
        calculateEmi(accountNumber,type,loanamount,7,time)

    }



    fun vehicleLoan() {
        println("*******Welcome To Vehicle Loan*******")
        println("Enter the Account Number")
        var accountNumber= read.next()
        println("Enter the Amount you want to take loan")
        var loanamount:Long=read.nextLong()
        println("Enter the Time period ")
        var time:Int= read.nextInt()
        var type="Vehicle Loan"
        println("ThankYou for taking Vehicle Loan")
        calculateEmi(accountNumber,type,loanamount,5,time)
    }

    fun housingLoan() {

        println("*******Welcome To Housing Loan*******")
        println("Enter the Account Number")
        var accountNumber= read.next()
        println("Enter the Amount you want to take loan")
        var loanamount:Long=read.nextLong()
        println("Enter the Time period ")
        var time:Int= read.nextInt()
        var type="House Loan"
        println("ThankYou for taking Housing Loan")
        calculateEmi(accountNumber,type,loanamount,8,time)
    }

    private fun calculateEmi(accountNumber: String?, type: String, loanamount: Long, rate: Int, time: Int) {

        var si=(loanamount*rate*time)/100
        var emi=si/time
        customerDao.insertIntoLoan(accountNumber,type,loanamount,rate,time,si,emi)
    }

}