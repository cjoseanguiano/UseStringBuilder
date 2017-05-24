/**
 * Created by carlosjoseanguiano on 23/05/17.
 */

fun main(arg: Array<String>) {
    val listString = ArrayList<String>()
    listString.add("Hola A")
    listString.add("Hola B")
    listString.add("Hola C")

    val stringBuilder = StringBuilder()
    for (i in listString.indices) {
        stringBuilder.append(listString[i])
    }
    val newString = stringBuilder.toString()
    println(newString)
}
