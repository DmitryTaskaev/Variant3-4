/**
 * Класс кабель
 * @property type - Тип кабеля [String]
 * @property amount - Количество жил кабеля [Double]
 * @property diameter - Диаметр кабеля [Double]
 * @property P - Наличие оплетки [Boolean]
 *
 * @author Таскаев Дмитрий
 */
class CableChild(_type: String, _amount: Double, _diameter: Double, _P: Boolean) : Cable(_type,_amount,_diameter) {
    private var P: Boolean
    init {
        P = _P
    }
    /**
     * Расчёт качества объекта с условием
     * Если @param[P] = true
     * @return Качество кабеля умножается на 2 [Double]
     * Если @param[P] = False
     * @return Качество кабеля умножается на 0.7 [Double]
     *
     * @author Таскаев Дмитрий
     */
    override fun Quality(): Double {
        return if (P){
            super.Quality() * 2
        } else {
            super.Quality() * 0.7
        }
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
    open override fun printInfo(): String{
        return super.printInfo()
    }
}