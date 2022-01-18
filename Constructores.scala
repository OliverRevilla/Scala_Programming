// Se tienen dos tipos de constructores
// Constructor primario: Implicitamente es la definicion de la clase
// Constructores auxiliares
// Se pueden definir con las palabras def y this. Se definen en el cuerpo de la clase
// Cada constructor auxiliar debería llamar uno de los constructores auxiliares definidos previamente.
class Employee(idEmp: Int, nameEmp: String, salaryEmp: Double){
    val empId: Int = idEmp
    val name: String = nameEmp
    val salary: Double = salaryEmp
    def this () { // Si puede tener argumentos pero no más que la definicion de la clase
        this(0,"Andrés",0.0) // Se invoca el contructor primario con this
        println("[Auxiliary Constructor]No arguments")

    }

    def this(empId: Int, name: String){
        this(empId,"",0.0)
        println("[Auxiliary Constructor] Two arguments")
    }
    println("[Primary Constructor]")
}


object Pizzeria extends App{
    class Pizza(size_pizza: Int, flag_cheese: Boolean, form_pizza: String, type_masa: String){
        def this(size_pizza: Int, flag_cheese: Boolean){
            this(size_pizza, flag_cheese, "Redonda", "Delgada")
        }
        def this(size_pizza: Int){
            this(size_pizza, true, "Cuadrada", "Gruesa")
        }
        def this(){// Invoca al primer constructor auxiliar
            this(5, false)
        }

        def this(size_pizza: Int, flag_cheese: Boolean, form_pizza: String){
            this(size_pizza)// Invoca al segundo constructor auxiliar

        }
    }
}







