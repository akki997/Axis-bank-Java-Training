package Day5


import Day5.Dao.conn
import java.sql.*
import java.util.*


var read=Scanner(System.`in`)
var transaction:ArrayList<Transaction> = arrayListOf()
fun InserintoLoan(accountNumber:String,loanType:String,principal:Long,rateofinterest:Int,time:Int,si:Long,emi:Long)
{
    val preparedStatement:PreparedStatement= conn!!.prepareStatement("insert into loan values(?,?,?,?,?,?,?)")
    preparedStatement.setString(1,accountNumber)
    preparedStatement.setString(2,loanType)
    preparedStatement.setLong(3,principal)
    preparedStatement.setInt(4,rateofinterest)
    preparedStatement.setInt(5,time)
    preparedStatement.setLong(6,si)
    preparedStatement.setLong(7,emi)
    preparedStatement.executeUpdate()
}
fun LoanDetails()
{
    println("Please Enter the Account number to see Loan Details")
    var accountNumber:String= read.next()
    println("You Loan Details are:")
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
fun calculateEmi(accountNumber: String,type:String,l:Long,r:Int,t:Int)
{

    var si=(l*r*t)/100
   // println(si)
    var emi=si/t
    //println("EMI is $emi")
    InserintoLoan(accountNumber,type,l,r,t,si,emi)
}
fun EducationLoan()
{
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
fun VehicleLoan()
{
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
fun HousingLoan()
{
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
fun ApplyLoan()
{

    println("Enter the Type of Loan you want to take")
    println("1. Education Loan")
    println("2. Vehicle Loan")
    println("3. Housing Loan")
    var x:Int= read.nextInt()
    var y=when(x)
    {
        1-> EducationLoan()
        2-> VehicleLoan()
        3-> HousingLoan()
        else ->
            System.exit(0)
    }

}
fun TransactionHistory()
{
    println("Enter you Account Number to see transaction history")
    var accountNumber= read.next()
    println("Enter the pin")
    var pin= read.next()

    val preparedStatement1:PreparedStatement = conn!!.prepareStatement("select *from transaction where accountNumber=? and pin=?")
    preparedStatement1.setString(1,accountNumber)
    preparedStatement1.setString(2,pin)
    var resultSet:ResultSet=preparedStatement1.executeQuery()

        println("Your Transaction History:")
        println("Account Number \t\t CurrentAmount")
        while (resultSet.next()) {
            println(resultSet.getString(1) + " \t\t " + resultSet.getString(2))
        }


}
fun AddMoney()
{
    println("Enter the Account Number")
    var accountNumber= read.next()
    println("Enter the pin")
    var pin= read.next()

    val preparedStatement1:PreparedStatement= conn!!.prepareStatement("select currentAmount from userdetails where accountNumber=? and pin=?")
    preparedStatement1.setString(1,accountNumber)
    preparedStatement1.setString(2,pin)
    val resultSet:ResultSet=preparedStatement1.executeQuery()
    if(resultSet.next()) {
        println("Enter the amount you want to deposit")
        var amount:Int=read.nextInt()
        var updateamount:Int=0
        updateamount = Integer.parseInt(resultSet.getString(1)) + amount

        val preparedStatement: PreparedStatement = conn!!.prepareStatement("update userdetails set currentAmount=? where accountNumber=$accountNumber")
        preparedStatement.setInt(1, updateamount)
        preparedStatement.executeUpdate()

        val preparedStatement1:PreparedStatement = conn!!.prepareStatement("insert into transaction values(?,?,?)")
        preparedStatement1.setString(1,accountNumber)
        preparedStatement1.setInt(2,updateamount)
        preparedStatement1.setString(3,pin)
        preparedStatement1.executeUpdate()
        println("ThankYou for depositing ")
    }
    else
    {
        println()
        println("Invalid AccountNumber or pin or AccountNumber Does not Exist..!!")
        println()
    }


}
fun WithdrawMoney()
{
    println("Enter the Account Number")
    var accountNumber= read.next()

    println("Enter the pin")
    var pin= read.next()

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
            val preparedStatement1:PreparedStatement = conn!!.prepareStatement("insert into transaction values(?,?,?)")
            preparedStatement1.setString(1,accountNumber)
            preparedStatement1.setInt(2,balance)
            preparedStatement1.setString(3,pin)
            preparedStatement1.executeUpdate()



        }
    }
    else
    {
        println()
        println("Invalid AccountNumber or pin or AccountNumber Does not Exist..!!")
        println()
    }


}
fun OpenAccount()
{
    println("Enter user Name")
    read.nextLine()
    var name= read.nextLine()
    println("Enter user Phone Number")
    var phone= read.next()
    println("Enter user EmailID")
    var email= read.next()
    println("Enter user Address")
    read.nextLine()
    var address= read.nextLine()
    println("Enter 4 digit Pin you want to set")
    var pin= read.next()

    var AccountNumber="01600000"+phone.substring(1,8)
    val preparedStatement: PreparedStatement = conn!!.prepareStatement("insert into userdetails values(?,?,?,?,?,?,?)")

    preparedStatement.setString(1, name)
    preparedStatement.setString(2, phone)
    preparedStatement.setString(3,email)
    preparedStatement.setString(4,address)
    preparedStatement.setString(5,AccountNumber)
    preparedStatement.setLong(6,0)
    preparedStatement.setString(7,pin)
    preparedStatement.executeUpdate()
    println("ThankYou for Opening the new Account")
    println("You Account Number is $AccountNumber")



}
fun Menu()
{
     var st="*********Welcome to the Online Banking System***********"
    for(item in st)
    {
        print(item)
        try {
            Thread.sleep(50)
        }
        catch (e:java.lang.Exception)
        {
            println(e.message)
        }

    }
    var flag:Boolean=true
    while(flag)
    {
        println("Select whether you are:-")
        println("1. Customer")
        println("2. Bank Employee")
        println("Enter your choice")
        var choice:Int= read.nextInt()
        when(choice) {
            1 -> {
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
                    var cho: Int = read.nextInt()
                    when (cho) {
                        1 -> OpenAccount()
                        2 -> AddMoney()
                        3 -> WithdrawMoney()
                        4 -> CheckBalnce()
                        5 -> TransactionHistory()
                        6 -> ApplyLoan()
                        7 -> LoanDetails()
                        8 -> MoneyTransfer()
                        9 -> RemoveUser()
                        else -> {
                            println("Invalid Input")
                            flag1 = false
                        }
                    }
                }
            }
            2 -> {
                println("########Welcome to the Employee Section#######")

                verifyEmp()

            }
            else -> {

            println("Invalid Input")
            flag = false

        }
        }
    }
}
fun MoneyTransfer()
{
    println("Enter the Account Number of Customer")
    var accountNumber= read.next()
    println("Enter the Pin")
    var pin= read.next()
    val preparedStatement:PreparedStatement = conn!!.prepareStatement("select currentAmount from userdetails where accountNumber=? and pin=?")
    preparedStatement.setString(1,accountNumber)
    preparedStatement.setString(2,pin)
    val rs: ResultSet = preparedStatement.executeQuery()
    if(rs.next())
    {
        println("Enter the Account Number you want to transfer to...!!")
        var accountNumber1= read.next()
        println("Enter the Amount you want to transfer..!!")
        var amount:Int=read.nextInt()
        val preparedStatement2:PreparedStatement = conn!!.prepareStatement("select currentAmount from userdetails where accountNumber=$accountNumber1")


        val rs1: ResultSet = preparedStatement2.executeQuery()
        if(rs1.next()) {
            var updateamount: Int = 0
            updateamount = Integer.parseInt(rs1.getString(1)) + amount

            val preparedStatement5: PreparedStatement = conn!!.prepareStatement("update userdetails set currentAmount=? where accountNumber=$accountNumber1")
            preparedStatement5.setInt(1, updateamount)
            preparedStatement5.executeUpdate()

            val preparedStatement1: PreparedStatement = conn!!.prepareStatement("insert into transaction values(?,?,?)")
            preparedStatement1.setString(1, accountNumber1)
            preparedStatement1.setInt(2, updateamount)
            preparedStatement1.setString(3, pin)
            preparedStatement1.executeUpdate()
        }

        var balance=Integer.parseInt(rs.getString(1))-amount
        println("Your Balance Amount is $balance")
        val preparedStatement3:PreparedStatement = conn!!.prepareStatement("update userdetails set currentAmount=$balance where accountNumber=$accountNumber")
        preparedStatement3.executeUpdate()
        val preparedStatement4:PreparedStatement = conn!!.prepareStatement("insert into transaction values(?,?,?)")
        preparedStatement4.setString(1,accountNumber)
        preparedStatement4.setInt(2,balance)
        preparedStatement4.setString(3,pin)
        preparedStatement4.executeUpdate()
        println("Amount $amount has been transfer to Account Number: $accountNumber1")



    }
    else
        println("Invalid Pin or Account Number")
}
fun CheckBalnce()
{
    println("Enter the Account Number of Customer")
    var accountNumber= read.next()
    val preparedStatement:PreparedStatement = conn!!.prepareStatement("select accountNumber,currentAmount from userdetails where accountNumber=?")
    preparedStatement.setString(1,accountNumber)
    val rs: ResultSet = preparedStatement.executeQuery()
    println("Account Number \t\t Balance Amount")
    while(rs.next())
    {
        println(rs.getString(1)+" \t\t "+rs.getString(2))
    }


}
fun RemoveUser()
{
    println("Enter the Account Number of Customer")
    var accountNumber= read.next()
    val preparedStatement:PreparedStatement = conn!!.prepareStatement("Delete from userdetails where accountNumber=?")
    preparedStatement.setString(1,accountNumber)
    preparedStatement.executeUpdate()
    println()
    println("Account Removed Successfully..!!")



}

fun verifyEmp() {
    println("Enter your Employee Id")
    var eid = read.next()
    val preparedStatement:PreparedStatement = conn!!.prepareStatement("select * from Emp where empid=?")
    preparedStatement.setString(1,eid)
    val rs: ResultSet = preparedStatement.executeQuery()

    if(rs.next()) {
        println("Welcome ${rs.getString(2)}")
        var f = true
        while (f) {
            println()

            println("******Select from Menu********")
            println("1. Check Customer Details")
            println("2. Check Customer Loan Details")
            var ch: Int = read.nextInt()
            when (ch) {
                1 -> CustomerDetails()
                2 -> LoanDetails()

                else-> {
                    println("Invalid Input")
                    f = false
                }
            }
        }
        }
        else
        println("Invalid Employee ID")


}
fun CustomerDetails()
{
   /* println("Enter the Account Number of Customer")
    var accountNumber= read.next()*/
    val preparedStatement:PreparedStatement = conn!!.prepareStatement("select * from userdetails")
    val resultSet: ResultSet = preparedStatement.executeQuery()
    println("Name \t\t Mobile Number \t\t Email \t\t Address \t\t AccountNumber \t\t CurrentAmount")
    while(resultSet.next()) {
        println(resultSet.getString(1)+" \t\t "+resultSet.getString(2)+" \t\t "+resultSet.getString(3)+" \t\t "+resultSet.getString(4)
                +" \t\t "+resultSet.getString(5)+" \t\t "+resultSet.getString(6))
    }
}

object Dao {
    internal var conn: Connection? = null
    internal var username = "root" // provide the username
    internal var password = "root" // provide the corresponding password
    @JvmStatic fun main(args: Array<String>) {
        // make a connection to MySQL Server
        getConnection()
        Menu()

    }

    fun getConnection() {
        val connectionProps = Properties()
        connectionProps.put("user", username)
        connectionProps.put("password", password)
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance()
            conn = DriverManager.getConnection(
                    "jdbc:" + "mysql" + "://" +
                            "localhost" +
                            ":" + "3306" + "/banking" +
                            "",
                    connectionProps)
        } catch (ex: SQLException) {
            // handle any errors
            ex.printStackTrace()
        }catch (ex: Exception) {
            // handle any errors
            ex.printStackTrace()
        }
    }
}
