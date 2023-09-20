class Employee {
    //Property intialization inside class directly
    //val employeeId: Int? = 0
    var employeeId: Int?

    //init block
    init {
        println("Block 1")
        employeeId = 0
    }

    init {
        println("Block 2")
    }

    init {
        println("Block 3")
    }
}

fun main() {
    //var is keyword
    //employee is variable
    //Employee() is constructor call
    var employee = Employee();
    println("Id ${employee.employeeId}")

    //outside class
    employee.employeeId = 10
    println("Id ${employee.employeeId}")

}