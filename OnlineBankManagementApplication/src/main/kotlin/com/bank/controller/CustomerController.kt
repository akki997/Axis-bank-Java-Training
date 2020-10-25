package com.bank.controller

import com.bank.service.CustomerService
import java.util.*

class CustomerController {
    var read = Scanner(System.`in`)
    var customerService=CustomerService()
    fun customer()
    {
        println("#########Welcome to Bank you can open new Account or see details######## ")
        var flag1 = true
        while (flag1) {
            println("1. Open New Account")
            println("2. Add Money")
            println("3. Withdraw Money")
            println("4. Check Balance")
            println("5. See Transaction History of the Account")
            println("6. Apply for Loan")
            println("7. See Loan Details")
            println("8. Money Transfer")
            println("9. Remove Account")
            println("Enter Your choice")
            var choice: Int = read.nextInt()

            when(choice)
            {
                1-> customerService.openAccount()
                2-> customerService.addMoney()
                3-> customerService.withdrawMoney()
                4-> customerService.checkBalance()
                5-> customerService.transactionHistory()
                6-> customerService.applyLoan()
                7-> customerService.loanDetails()
                8-> customerService.moneyTransfer()
                9-> customerService.removeCustomer()

                else->{
                    println("Invalid Input")
                }
            }


        }
    }
}