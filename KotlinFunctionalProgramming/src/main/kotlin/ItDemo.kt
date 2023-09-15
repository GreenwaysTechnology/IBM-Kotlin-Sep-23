fun main() {
    //If lambda has single arg and parameter
    var sayMyName = { name: String ->
        name.uppercase()
    }
    println(sayMyName("subramanian"))

    //without variable name
    var sayYourName: (String) -> String = {
        it.uppercase()
    }


}