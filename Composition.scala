// La composición es una ténica de diseño.
// Una clase puede tener una instancia de otra clase como un campo de su clase.

object Composition extends App{

    class Spider_man(lanzador: Lanzatelarana, moto : Moto){
        val spiderweb: Lanzatelarana = lanzador
        val spidermoto: Moto = moto

        println(spiderweb.lanzar())
        println(spiderweb.Dispositivo)
        println(spidermoto.driving())
    }

    class Lanzatelarana {
        val Dispositivo : String = "lanzador"

        def lanzar(): String = {
            "Lanzando telarañas"
        }
    }

    class Moto {
        def driving(): String = {
            "driving moto"
        }
    }

    // Herencia
    class Superhero {
        val marvel: String = "Super héroe de marvel"
        
        def Presentacion (Frase: String): Unit = {
            println(Presentacion)
        }
    }

    class Spiderman extends Superhero{
        println(marvel)
        println(Presentacion("Hola soy Spiderman"))
        
    }

    class Ironman extends Superhero{
        println(marvel)
        println(Presentacion("Hola soy Ironman"))
    }

    // Composicion
    new Spider_man(new Lanzatelarana, new Moto) // Spiderman tiene ambos métodos como clases


}

