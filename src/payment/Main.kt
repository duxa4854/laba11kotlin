package payment

fun main(){
    val processor = PaymentProcessor()
    val payment = listOf(
        Payment("5_228_600_502_700_851",1000,CardType.VISA),
        Payment("5_368_290_200_782_714",2000,CardType.MASTERCARD),
        Payment("4_276_673_381_463_713",1500,CardType.MIR),
        Payment("4_276_020_949_990_906",500,CardType.UNKNOWN),
        Payment("123",4000, CardType.VISA)
    )
}