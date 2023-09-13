//Defalut args
fun format(
    str: String = "Default Str",
    normalizeCast: Boolean = false,
    upperCaseFirstLetter: Boolean = false,
    wordSeparator: Char = '.'
) {

    println(
        "str $str normalizeCast $normalizeCast  upperCaseFirstLetter" +
                " $upperCaseFirstLetter wordSeparator $wordSeparator"
    )

}

fun main() {
    format("hello", true, false, ',')
    format("hai")
    format()

    //Named parameters
    format(wordSeparator = ':')
    format(str = "How are you", upperCaseFirstLetter = true, wordSeparator = ';')
}