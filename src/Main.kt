fun main() {
    val array = arrayOf("Привет","как", null,"дела")

    var newArray: List<String?> = array.filter { it != null }
    println(array.contentToString())
    println(newArray)


}