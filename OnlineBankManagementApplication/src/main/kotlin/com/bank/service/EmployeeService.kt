package com.bank.service

import com.bank.dao.CustomerDao
import com.bank.dao.EmployeeDao
import java.util.*

class EmployeeService {
    var employeeDao=EmployeeDao()
    var customerDao=CustomerDao()
    var read=Scanner(System.`in`)
    fun verifyEmployee() {
        println("Enter your Employee Id")
        var employeeId = read.next()

        if(employeeDao.verifyEmployee(employeeId))
        {
            var flag = true
            while (flag) {
                println()

                println("******Select from Menu********")
                println("1. Check Customer Details")
                println("2. Check Customer Loan Details")
                var ch: Int = read.nextInt()
                when (ch) {
                    1 -> employeeDao.customerDetails()
                    2 -> employeeDao.loanDetails()

                    else-> {
                        println("Invalid Input")
                        flag = false
                    }
                }
            }
        }
        else
            println("Invalid Employee ID")

    }


}