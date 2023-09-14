fun main() {
    var a: Int = 10
    //var is keyword
    //a is variable
    //Int is type
    //10 is literal(value)

    //hello is variable
    //var is keyword
    //()->Unit is type: function type
    //fun(){} - literal/value
    var hello: () -> Unit = fun() {
        //function body
        println("Hello function literal")
    }
    //invoke function :using variable called hello
    hello()

    //Type Inference with function literals
    var hai = fun() {
        //function body
        println("Hai function literal")
    }
    hai()
}