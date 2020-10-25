package com.bank.service

import com.bank.dao.CustomerDao
import com.bank.model.Customer
import java.sql.PreparedStatement
import java.util.*

class CustomerService {
    var customerDao=CustomerDao()
    var read = Scanner(System.`in`)
    var customer=Customer()

    fun openAccount() {
        println("Enter user Name")
        //read.nextLine()
        var cusName = read.nextLine()
        customer.name=cusName
        println("Enter user Phone Number")
        var phone = read.next()
        customer.phoneNumber=phone
        println("Enter user EmailID")
        var cusEmail = read.next()
        customer.email=cusEmail
        println("Enter user Address")
        read.nextLine()
        var cusAddress = read.nextLine()
        customer.address=cusAddress
        println("Enter 4 digit Pin you want to set")
        var cusPin = read.next()
        customer.pin=cusPin

        var AccountNumber = "01600000" + phone.substring(1, 8)
        customer.accountNumber=AccountNumber
        customerDao.addCustomer(customer)


    }

    fun addMoney() {
        println("Enter the Account Number")
        var accountNumber = read.next()
        println("Enter the pin")
        var pin = read.next()
        customerDao.addMoney(accountNumber,pin)

    }

    fun withdrawMoney()
    {
        println("Enter the Account Number")
        var accountNumber= read.next()
        println("Enter the pin")
        var pin= read.next()
        customerDao.withdrawMoney(accountNumber,pin)
    }

    fun checkBalance()
    {
        println("Enter the Account Number of Customer")
        var accountNumber= read.next()
        println("Enter the pin")
        var pin= read.next()
        if(customerDao.validateCustomer(accountNumber, pin))
            customerDao.checkBalance(accountNumber,pin)
        else
        {
            println("Invalid Account Number/Pin or Account does nit exists..!!")
        }
    }
    fun transactionHistory(){
        println("Enter the Account Number of Customer")
        var accountNumber= read.next()
        println("Enter the pin")
        var pin= read.next()
        if(customerDao.validateCustomer(accountNumber, pin))
            customerDao.transactionHistory(accountNumber,pin)
        else
        {
            println("Invalid Account Number/Pin or Account does nit exists..!!")
        }

    }
    fun applyLoan()
    {
        var loanService=LoanService()
        println("Enter the Type of Loan you want to take")
        println("1. Education Loan")
        println("2. Vehicle Loan")
        println("3. Housing Loan")
        var x:Int= read.nextInt()
        var y=when(x)
        {
            1-> loanService.educationLoan()
            2-> loanService.vehicleLoan()
            3-> loanService.housingLoan()
            else ->
                System.exit(0)
        }
    }
    fun loanDetails()
    {
        println("Please Enter the Account number to see Loan Details")
        var accountNumber:String= read.next()
        println("Loan Details are:")
        customerDao.getLoanDetails(accountNumber)
    }


    fun moneyTransfer()
    {

        println("Enter your Account Number")
        var accountNumber= read.next()
        println("Enter the Pin")
        var pin= read.next()
        if(customerDao.validateCustomer(accountNumber, pin))
        {
             customerDao.moneyTransfer(accountNumber,pin)
        }
        else
            println("Invalid Pin or Account Number")


    }
    fun removeCustomer()

    {
        println("Enter the Account Number of Customer")
        var accountNumber= read.next()
        println("Enter the pin")
        var pin= read.next()
        if(customerDao.validateCustomer(accountNumber,pin)) {

          customerDao.removeCustomer(accountNumber)
        }
        else
            println("Invalid Account Number/Pin or Account does nit exists..!!")
    }
}