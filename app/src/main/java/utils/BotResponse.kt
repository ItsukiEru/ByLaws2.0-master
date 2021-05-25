package utils

import utils.Constants.OPEN_GOOGLE
import utils.Constants.OPEN_SEARCH
import java.lang.Exception
import java.util.*

object BotResponse {

    fun basicResponses(_message: String): String {
        val random = (0..2).random()
        val message = _message.lowercase(Locale.getDefault())

        return when {
            //Hello
            message.contains("hello") -> {
                when (random) {
                    0 -> "Hello there!"
                    1 -> "Hello, my name is Bogart"
                    2 -> "Sup!"
                    else -> "I did not quite get that."
                }
            }
            //how are you
            message.contains("how are you") -> {
                when (random) {
                    0 -> "I'm good"
                    1 -> "I'm fine, just reading some traffic laws"
                    2 -> "I'm good, how are you with the laws?"
                    else -> "I did not quite get that."
                }
            }
            message.contains("flip") && message.contains("coin") -> {
                val r = (0..1).random()
                val result = if (r == 0) "Heads" else "tails"

                "I flipped $result"
            }

            //Solve maths
            message.contains("solve") -> {
                val equation: String? = message.substringAfter("solve")

                return try{
                    val answer = SolveMath.solveMath(equation ?: "0")
                    answer.toString()
                } catch (e: Exception){
                    "Sorry, I can't solve that"
                }
            }
            //Gets the current time
            message.contains("time") && message.contains("?") -> {
                Time.timeStamp()
            }
            message.contains("open") && message.contains("google") -> {
                OPEN_GOOGLE
            }

            message.contains("search") -> {
                OPEN_SEARCH
            }

            else -> {
                when (random) {
                    0 -> "I don't understand..."
                    1 -> "Idk"
                    2 -> "Try asking something else"
                    else -> "I did not quite get that."
                }
            }
        }
    }
}