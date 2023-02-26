fun main(args: Array<String>) {
    println("Hello World!")

//    fun String?.isEmptyOrBlank(): Boolean {
//        return this == null || this.isEmpty() || this.isBlank()
//    }
//
//    fun String.acronym(): String {
//        val words = this.split(" ", "-")
//        var acronym = ""
//        for (word in words) {
//            acronym += word.firstOrNull()?.toUpperCase()
//        }
//        return acronym
//    }
    val projectDir = System.getProperty("user.dir")
    println(projectDir)

}