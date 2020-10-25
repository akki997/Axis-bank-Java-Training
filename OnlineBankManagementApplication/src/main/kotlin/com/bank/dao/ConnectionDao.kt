package com.bank.dao

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.util.*

object ConnectionDao {
    internal var conn: Connection? = null
    internal var username = "root" // provide the username
    internal var password = "root" // provide the corresponding password

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