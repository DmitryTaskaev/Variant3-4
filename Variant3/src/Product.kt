/**
 * Класс товар на складе
 * @property name - Название товара [String]
 * @property price - Цена товара [Double]
 * @property amount - Количество товара [Double]
 *
 * @author Таскаев Дмитрий
 */
open class Product(_name:String, _price:Double, _amount:Double) {
    private var name: String
    private var price: Double
    private var amount: Double

    init {
        name = _name
        price = _price
        amount = _amount
    }
    /**
     * Расчёт качества товара
     * @return - Качество товара расчитывается по формуле (цена)/ (количество) [Double]
     *
     * @author Таскаев Дмитрий
     */
    open fun Quality():  Double{
        //return "${sot_kol/sp_win}"
        return (price/amount)
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

    open fun printInfo(): String{
        return "Наименование товара: $name\nЦена товара: $price\nКоличество товара: $amount\nКачество товара: ${Quality()}\n"
    }

}