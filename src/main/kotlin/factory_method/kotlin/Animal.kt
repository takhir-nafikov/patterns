package factory_method.kotlin

interface Animal {
    val id: Int
}

class Cat(override val id: Int) : Animal { }
open class Dog(override val id: Int) : Animal { }

class Beagle(id: Int) : Dog(id)
class Bulldog(id: Int) : Dog(id)
