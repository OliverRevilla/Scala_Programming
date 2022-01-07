// Son usados para definir tipos de objetos especificando el comportamiento
// Permiten principalmente definir el comportamiento de algún objeto
// Los traits no pueden tener parámetros de constrructor
// Los traits permiten herencia múltiple
// Múltiples traits pueden ser heredados por la misma clase

object Spidertraits extends App {

    trait Tobey {
        def saveMJ: Unit = println("Salavar a Mary Jane")
    }

    trait Andrew {
        def createWebs(web: String):Unit // Método abstracto

    }

    trait Tom {
        val UCM: Boolean
    }

    class Spiderman extends Tobey with Andrew with Tom{
        def createWebs(web: String): Unit = println(web)
        override val UCM: Boolean = true

    }

    var sp = new Spiderman

    sp.saveMJ
    sp.createWebs("Creando telas")
    println(sp.UCM)
}
