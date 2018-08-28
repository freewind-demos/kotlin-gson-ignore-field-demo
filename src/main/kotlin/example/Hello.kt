package example

import com.google.gson.GsonBuilder

data class User(val name: String, @Transient val age: Int)

val user = User("Gson", 100)

fun main(args: Array<String>) {
    val gson = GsonBuilder().setPrettyPrinting().create()
    val json = gson.toJson(user)
    println(json)
}



