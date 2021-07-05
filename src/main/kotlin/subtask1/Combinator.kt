package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0] //m: количество плакатов для дизайна
        val n = array[1] //n: общее количество доступных цветов

        var c = 1 // n choose x

        if (m >= 0 && n > 0){
            for (x in 1..n/2+1){
                c = c * (n+1-x) / x
                if(c == m){
                    return x
                }
            }
        }
        return null
    }
}
