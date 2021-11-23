import java.sql.DriverManager
import java.util.*

fun main() {

    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val credentials = Credentials()

    // Prepare credentials
    val connectionProps = Properties()
    connectionProps["user"] = credentials.user
    connectionProps["password"] = credentials.password



    // Create the connection: this will allow us to run queries on it later
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                credentials.databaseName, connectionProps)

    val statement = connection.prepareStatement("SELECT * FROM trains")
    // Replace the var without allowing full queries to be entered
    val result = statement.executeQuery()
    while(result.next()) {
        result.getString("max_passengers")
    }



    trains()
}

fun trains(){
    println("Where to?")
    val input = readLine()
}