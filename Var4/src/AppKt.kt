fun main(){
    println("Базовый класс")
    val Cupper = Cable("Медный кабель",4.0,5.0)
    println(Cupper.printInfo())
    println("Класс потомка")
    val CupperChild = CableChild("Медный кабель", 4.0,5.0,true)
    println(CupperChild.printInfo())
}