fun main(){
    println("Базовый класс")
    val Computer = Product("Игровой компьютер",10000.99,12.0)
    println(Computer.printInfo())
    println("Класс потомка")
    val ComputerChild = ProductChild("Игровой компьютер",10000.99,12.0,2004,2022)
    println(ComputerChild.printInfo())
}