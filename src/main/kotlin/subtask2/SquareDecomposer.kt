package subtask2

import java.lang.Math.sqrt

class SquareDecomposer {
    fun decomposeNumber(number: Int): Array<Int>? {
        val squareNumber = number.toLong() * number.toLong()
        val result = decomposer(number.toLong(), squareNumber)

        return when {
            squareNumber < 0L -> null
            result?.size == 1 -> null
            else -> result?.toTypedArray()
        }
    }

    private fun decomposer(number: Long, squareNumber: Long): ArrayList<Int>? {
        if (squareNumber == 0L) return arrayListOf()
        var list: ArrayList<Int>? = null

        for (i in number - 1 downTo 1) {
            val num = squareNumber - (i * i)
            if (num >= 0) {
                list = decomposer(i, num)
                list?.add(i.toInt())
            }

            if (list != null) {
                return list
            }
        }

        return list
    }
}

