fun main() {
    print("Введите сумму которую хотите перевести (руб.): ")
    val read = readln().toDouble()
    val amount:Int = (read*100).toInt()
    val coefficient: Double =0.0075
    val minCom:Int= 35*100
    val totalCom =(if((amount*coefficient)<=minCom) minCom else amount*coefficient).toInt()
    val kop:Int = (totalCom%100).toInt()
    val rub:Int =(totalCom/100).toInt()

    println("Сумма комиссии составляет $rub руб. $kop  коп.")
}