/**
 * Класс товар на складе
 * @property name - Название товара [String]
 * @property price - Цена товара [Double]
 * @property amount - Количество товара [Double]
 * @property P - Год выпуска товара [Int]
 * @property T - Текущий год [Int]
 *
 * @author Таскаев Дмитрий
 */
class ProductChild(_name:String, _price:Double, _amount:Double, _P: Int, _T: Int): Product(_name, _price, _amount) {
    private var P: Int
    private var T: Int
    init {
        P = _P
        T = _T
    }
    /**
     * Расчёт качества объекта
     * @return - Качество объекта расчитывается по формуле (Качество) + 0.5 * ((Текущий год)-(Год выпуска товара)) [Double]
     *
     * @author Таскаев Дмитрий
     */
    override fun Quality(): Double {
        return super.Quality() + 0.5 * (T-P)
    }
    /**
     * Вывод иныормации на экран
     * @return - Строка с информацией о товаре [String]
     * @property name - Название товара [String]
     * @property price - Цена товара [Double]
     * @property amount - Количество товара [Double]
     * @property Quality - Качество товара [Double]
     *
     * @author Таскаев Дмитрий
     */

    open override fun printInfo(): String {
        return super.printInfo()
    }
}