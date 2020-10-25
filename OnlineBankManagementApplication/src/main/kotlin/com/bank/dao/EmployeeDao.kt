package com.bank.dao

import com.bank.dao.ConnectionDao.conn
import com.bank.model.Customer
import com.bank.model.Employee
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.util.*
import kotlin.collections.ArrayList


class EmployeeDao {
    fun verifyEmployee(employeeId: String?):Boolean {

        val preparedStatement: PreparedStatement = conn!!.prepareStatement("select * from Emp where empid=?")
        preparedStatement.setString(1, employeeId)
        val rs: ResultSet = preparedStatement.executeQuery()

        if (rs.next()) {
            println("Welcome ${rs.getString(2)}")
            return true


        }
        return false

    }

    fun customerDetails() {

        val preparedStatement: PreparedStatement = conn!!.prepareStatement("select * from userdetails")
        val resultSet: ResultSet = preparedStatement.executeQuery()
        val li: MutableList<Customer> = ArrayList<Customer>()
        println("Name \t\t Mobile Number \t\t Email \t\t Address \t\t AccountNumber \t\t CurrentAmount")
        while (resultSet.next()) {
            var customer = Customer()
            customer.name = resultSet.getString(1)
            customer.phoneNumber = resultSet.getString(2)
            customer.email = resultSet.getString(3)
            customer.address = resultSet.getString(4)
            customer.accountNumber = resultSet.getString(5)
            li.add(customer)
            for (item in li) {

                println(
                    item.name + " \t\t " + item.phoneNumber + " \t\t " + item.email + " \t\t " + item.address

                            + " \t\t " + item.accountNumber + " \t\t " + resultSet.getString(6)
                )
            }
        }
    }

    fun loanDetails() {
        var read=Scanner(System.`in`)
        println("Please Enter the Account number to see Loan Details")

        var accountNumber:String= read.next()
        println("Loan Details are:")
        val preparedStatement: PreparedStatement = conn!!.prepareStatement("select *from loan where accountNumber=?")
        preparedStatement.setString(1,accountNumber)
        var resultSet:ResultSet=preparedStatement.executeQuery()
        println("Account Number \t Loan Type \t Principal Amount \t Rate of Interest \t Time Period \t Simple Interest \t EMI")
        while(resultSet.next()) {

            println()

            println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3) + "\t\t\t\t\t" + resultSet.getString(4)
                    + "\t\t\t\t\t" + resultSet.getString(5) + "\t\t\t" + resultSet.getString(6) + "\t\t\t" + resultSet.getString(7))

        }

        println()

    }
}