package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val listNumbers = mutableListOf<String>()

        if (number.all{it.isDigit()} && number.toInt() > 0) {
            number.forEach { i ->
                when (i) {
                    '0' -> {
                        listNumbers.add(number.replace(i, '8'))
                    }
                    '1' -> {
                        listNumbers.add(number.replace(i, '2'))
                        listNumbers.add(number.replace(i, '4'))
                    }
                    '2' -> {
                        listNumbers.add(number.replace(i, '1'))
                        listNumbers.add(number.replace(i, '3'))
                        listNumbers.add(number.replace(i, '5'))
                    }
                    '3' -> {
                        listNumbers.add(number.replace(i, '2'))
                        listNumbers.add(number.replace(i, '6'))
                    }
                    '4' -> {
                        listNumbers.add(number.replace(i, '1'))
                        listNumbers.add(number.replace(i, '7'))
                        listNumbers.add(number.replace(i, '5'))
                    }
                    '5' -> {
                        listNumbers.add(number.replace(i, '8'))
                        listNumbers.add(number.replace(i, '2'))
                        listNumbers.add(number.replace(i, '6'))
                        listNumbers.add(number.replace(i, '4'))
                    }
                    '6' -> {
                        listNumbers.add(number.replace(i, '5'))
                        listNumbers.add(number.replace(i, '3'))
                        listNumbers.add(number.replace(i, '9'))
                    }
                    '7' -> {
                        listNumbers.add(number.replace(i, '4'))
                        listNumbers.add(number.replace(i, '8'))
                    }
                    '8' -> {
                        listNumbers.add(number.replace(i, '5'))
                        listNumbers.add(number.replace(i, '7'))
                        listNumbers.add(number.replace(i, '9'))
                        listNumbers.add(number.replace(i, '0'))
                    }
                    '9' -> {
                        listNumbers.add(number.replace(i, '6'))
                        listNumbers.add(number.replace(i, '8'))
                    }
                }
            }
            return listNumbers.toTypedArray()

        } else {
            return null
        }
    }
}

