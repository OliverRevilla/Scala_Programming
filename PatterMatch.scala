object PatternMatching extends App{

    val aNumber: Any = 1

    def pmtest(x: Any): Any = {
        x match{
            case 1 =
                > "uno"
            case 2 => "dos"
            case 3 => "tres"
            case _ => "otros"
            case i: Integer => s"Es un entero: $i"

        }
    }

    // Listas
    List(0,1,454,23) match{
        case List(0,_*) =>  "Empieza con cero"
        case List(_, 2, _*) => println("Hay un dos en la segunda posicion")
 

    }

    // Pattern guards
    case Class Persona(nombre: String, edad: Int)

    val mexicana: Persona = new Persona("Maria", 16)

    mexicana match {
        case Persona(_,e) if e < 18 => println("No puede tomar alcohol")
        case _ => println("Puede tomar alcohol")
    }
}