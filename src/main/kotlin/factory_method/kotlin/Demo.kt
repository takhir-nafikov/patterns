package factory_method.kotlin

fun main(args: Array<String>) {

    val animalTypes = listOf("dog" to "bulldog",
        "dog" to "beagle",
        "cat" to "persian",
        "cat" to "russian blue",
        "cat" to "siamese")

    val factory = AnimalFactory()
    for ((type, breed) in animalTypes) {
        val c = factory.createAnimal(type, breed)
        println(c)
    }
}