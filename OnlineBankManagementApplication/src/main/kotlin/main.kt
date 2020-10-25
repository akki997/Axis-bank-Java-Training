import com.bank.controller.CustomerController
import com.bank.controller.EmployeeController
import com.bank.dao.ConnectionDao
import java.sql.Connection
import java.util.*

fun main(args: Array<String>) {
    var customerController=CustomerController()
    var employeeController=EmployeeController();
    ConnectionDao.getConnection()
    var read = Scanner(System.`in`)



    var st = "*********Welcome to the Online Banking System***********"



    for (item in st) {
        print(item)
        try {
            Thread.sleep(50)
        } catch (e: java.lang.Exception) {
            println(e.message)
        }

    }
    println()
    var flag: Boolean = true
    while (flag) {
        println("Select whether you are:-")
        println("1. Customer")
        println("2. Bank Employee")
        println("Enter your choice")
        var choice: Int = read.nextInt()
        when (choice) {
            1->customerController.customer()
            2->employeeController.employee()
            else->{
                println("Invalid Input")
                flag=false;
            }

        }
    }
}