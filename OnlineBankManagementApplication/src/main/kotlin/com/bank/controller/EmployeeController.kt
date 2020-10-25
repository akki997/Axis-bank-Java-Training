package com.bank.controller

import com.bank.service.EmployeeService

class EmployeeController {
var employeeService=EmployeeService()
    fun employee()
    {
        println("########Welcome to the Employee Section#######")

        employeeService.verifyEmployee()

    }


}