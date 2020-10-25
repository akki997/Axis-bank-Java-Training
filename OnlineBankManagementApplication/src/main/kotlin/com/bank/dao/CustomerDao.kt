package com.bank.dao

import com.bank.dao.ConnectionDao.conn
import com.bank.model.Customer
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.util.*

class CustomerDao {

    var read = Scanner(System.`in`)


fun transactionUpdate(accountNumber: String?,updateAmount:Int,pin:String?)
{
    val preparedStatement1: PreparedStatement = conn!!.prepareStatement("insert into transaction values(?,?,?)")
    preparedStatement1.setString(1, accountNumber)
    preparedStatement1.setInt(2, updateAmount)
    preparedStatement1.setString(3, pin)
    preparedStatement1.executeUpdate()

}

    fun validateCustomer(accountNumber: String?, pin: String?): Boolean {
        val preparedStatement: PreparedStatement =
            conn!!.prepareStatement("select * from userdetails where accountNumber=? and pin=?")
        preparedStatement.setString(1, accountNumber)
        preparedStatement.setString(2, pin)
        var resultSet: ResultSet = preparedStatement.executeQuery()
        if (resultSet.next())
            return true
        return false

    }

    fun addCustomer(customer: Customer) {

        val preparedStatement: PreparedStatement =
            conn!!.prepareStatement("insert into userdetails values(?,?,?,?,?,?,?)")
        preparedStatement.setString(1, customer.name)
        preparedStatement.setString(2, customer.phoneNumber)
        preparedStatement.setString(3, customer.email)
        preparedStatement.setString(4, customer.address)
        preparedStatement.setString(5, customer.accountNumber)
        preparedStatement.setLong(6, 0)
        preparedStatement.setString(7, customer.pin)
        preparedStatement.executeUpdate()
        println("ThankYou for Opening the new Account")
        println("You Account Number is ${customer.accountNumber}")


    }

    fun addMoney(accountNumber: String?, pin: String?) {

        val preparedStatement1: PreparedStatement =
            conn!!.prepareStatement("select currentAmount from userdetails where accountNumber=? and pin=?")
        preparedStatement1.setString(1, accountNumber)
        preparedStatement1.setString(2, pin)
        val resultSet: ResultSet = preparedStatement1.executeQuery()
        if (resultSet.next()) {
            println("Enter the amount you want to deposit")
            var amount: Int = read.nextInt()
            var updateamount: Int = 0
            updateamount = Integer.parseInt(resultSet.getString(1)) + amount

            val preparedStatement: PreparedStatement =
                conn!!.prepareStatement("update userdetails set currentAmount=? where accountNumber=$accountNumber")
            preparedStatement.setInt(1, updateamount)
            preparedStatement.executeUpdate()
            transactionUpdate(accountNumber,updateamount,pin)

            println("ThankYou for depositing ")
        } else {
            println()
            println("Invalid AccountNumber or pin or AccountNumber Does not Exist..!!")
            println()
        }
    }

    fun withdrawMoney(accountNumber: String?, pin: String?) {

        val preparedStatement1:PreparedStatement= conn!!.prepareStatement("select currentAmount from userdetails where accountNumber=? and pin=?")
        preparedStatement1.setString(1,accountNumber)
        preparedStatement1.setString(2,pin)
        val resultSet:ResultSet=preparedStatement1.executeQuery()

        if(resultSet.next())
        {
            println("Enter the amount you want to withdraw")
            var withdrawamount:Int=read.nextInt()
            if(Integer.parseInt(resultSet.getString(1))< withdrawamount)
                println("Not Sufficient Amount present in your account")
            else
            {
                println("Amount Withdrawn is $withdrawamount")
                var balance=Integer.parseInt(resultSet.getString(1))-withdrawamount
                println("Your Balance Amount is $balance")
                val preparedStatement:PreparedStatement = conn!!.prepareStatement("update userdetails set currentAmount=$balance where accountNumber=$accountNumber")
                preparedStatement.executeUpdate()
                transactionUpdate(accountNumber,balance,pin)



            }
        }
        else
        {
            println()
            println("Invalid AccountNumber or pin or AccountNumber Does not Exist..!!")
            println()
        }
    }

    fun checkBalance(accountNumber: String?, pin: String?) {

        val preparedStatement: PreparedStatement = conn!!.prepareStatement("select accountNumber,currentAmount from userdetails where accountNumber=?")
        preparedStatement.setString(1, accountNumber)
        val rs: ResultSet = preparedStatement.executeQuery()
        println("Account Number \t\t Balance Amount")
        while (rs.next()) {
            println(rs.getString(1) + " \t\t " + rs.getString(2))
        }
    }

    fun transactionHistory(accountNumber: String?, pin: String?) {

        val preparedStatement1: PreparedStatement = conn!!.prepareStatement("select *from transaction where accountNumber=? and pin=?")
        preparedStatement1.setString(1, accountNumber)
        preparedStatement1.setString(2, pin)
        var resultSet: ResultSet = preparedStatement1.executeQuery()

        println("Your Transaction History:")
        println("Account Number \t\t CurrentAmount")
        while (resultSet.next()) {
            println(resultSet.getString(1) + " \t\t " + resultSet.getString(2))
        }
    }

    fun insertIntoLoan(accountNumber: String?, loanType: String, loanAmount: Long, rate: Int, time: Int, si: Long, emi: Long) {

        val preparedStatement:PreparedStatement= conn!!.prepareStatement("insert into loan values(?,?,?,?,?,?,?)")
        preparedStatement.setString(1,accountNumber)
        preparedStatement.setString(2,loanType)
        preparedStatement.setLong(3,loanAmount)
        preparedStatement.setInt(4,rate)
        preparedStatement.setInt(5,time)
        preparedStatement.setLong(6,si)
        preparedStatement.setLong(7,emi)
        preparedStatement.executeUpdate()

    }

    fun getLoanDetails(accountNumber: String) {

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

    fun moneyTransfer(accountNumber: String?, pin: String?) {

        val preparedStatement:PreparedStatement = conn!!.prepareStatement("select currentAmount from userdetails where accountNumber=? and pin=?")
        preparedStatement.setString(1,accountNumber)
        preparedStatement.setString(2,pin)
        val rs: ResultSet = preparedStatement.executeQuery()
        if(rs.next()) {
            println("Enter the Account Number you want to transfer to...!!")
            var accountNumber1 = read.next()
            println("Enter the Amount you want to transfer..!!")
            var amount: Int = read.nextInt()
            if (Integer.parseInt(rs.getString(1)) < amount)
                println("Not Sufficient amount present in your account..!!")
            else {
                val preparedStatement2: PreparedStatement =
                    conn!!.prepareStatement("select currentAmount from userdetails where accountNumber=$accountNumber1")
                val rs1: ResultSet = preparedStatement2.executeQuery()
                if (rs1.next()) {
                    var updateamount: Int = 0
                    updateamount = Integer.parseInt(rs1.getString(1)) + amount
                    val preparedStatement5: PreparedStatement =
                        conn!!.prepareStatement("update userdetails set currentAmount=? where accountNumber=$accountNumber1")
                    preparedStatement5.setInt(1, updateamount)
                    preparedStatement5.executeUpdate()
                }
                var balance = Integer.parseInt(rs.getString(1)) - amount
                println("Your Balance Amount is $balance")
                val preparedStatement3: PreparedStatement =
                    conn!!.prepareStatement("update userdetails set currentAmount=$balance where accountNumber=$accountNumber")
                preparedStatement3.executeUpdate()
                val preparedStatement4: PreparedStatement =
                    conn!!.prepareStatement("insert into transaction values(?,?,?)")
                preparedStatement4.setString(1, accountNumber)
                preparedStatement4.setInt(2, balance)
                preparedStatement4.setString(3, pin)
                preparedStatement4.executeUpdate()
                println("Amount $amount has been transfer to Account Number: $accountNumber1")


            }
        }
    }

    fun removeCustomer(accountNumber: String?) {

        val preparedStatement: PreparedStatement = conn!!.prepareStatement("Delete from userdetails where accountNumber=?")
        preparedStatement.setString(1, accountNumber)
        preparedStatement.executeUpdate()
        println()
        println("Account Removed Successfully..!!")

    }

}