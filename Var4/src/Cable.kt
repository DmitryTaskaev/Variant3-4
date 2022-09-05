/**
 * Класс кабель
 * @property type - Тип кабеля [String]
 * @property amount - Количество жил кабеля [Double]
 * @property diameter - Диаметр кабеля [Double]
 *
 * @author Таскаев Дмитрий
 */
open class Cable(_type: String, _amount: Double, _diameter: Double) {
    private var type: String
    private var amount: Double
    private var diameter: Double

    init {
        type = _type
        amount = _amount
        diameter = _diameter
    }
    open fun Quality():  Double{
        return (diameter/amount)
    }
    /**
     * Вывод иныормации на экран
     * @return - Строка с информацией [String]
     * @property type - Тип кабеля [String]
     * @property amount - Количество жил кабеля [Double]
     * @property diameter - Диаметр кабеля [Double]
     * @property Quality - Качество кабеля [Double]
     *
     * @author Таскаев Дмитрий
     */
    open fun printInfo(): String{
        return "Тип кабеля: $type\nКоличество жил кабеля: $amount\nДиаметр: $diameter см\nКачество кабеля: ${Quality()}\n"
    }

}