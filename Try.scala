// Lanzamiento de excepciones
object ExampleTC extends App{
    val s = "2"
    try {
        val i = s.toInt
    } catch {
        case e: Exception => e.printStackTrace
        case _:     
    } finally{
        println("Adios Mundo")
    }
}

object ExampleCigarettes extends App{
    case class Customer(age: Int)
    class Cigarettes

    case class UnderAgeException(message: String) extends Exception(message)
        def buyCigarettes(customer: Customer): Cigarettes =
            if (customer.age < 16){
                throw UnderAgeException(s"Customer must be pñder than 16 but was ${customer.age}")
            }
            else {
                new Cigarettes
            }
    
    def youngCustomerBoy: String = {
        val youngCustomer = Customer(18)
        try {
            buyCigarettes(youngCustomer)
        }
        catch {
            case UnderAgeException(msg) => msg
        }
    }
}
