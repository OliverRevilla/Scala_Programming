// Superclases: Son aquellas que son heredadas por otras clases.
// Se hereda una clase con la palabra reservada extend.

class Persona(nombre: String, edad: Int) {
    def Presentacion: Unit = println(s"Mi nombres es $nombre y tengo de $edad edad")
}

class Profesor(nombre: String, edad: Int, val materia: String) extends Persona(nombre, edad){
    def teach: Unit = println(s"Estoy enseñando: $materia")
    
    def evaluacion: Unit = calificar
    private def calificar: Unit = println("Edtoy calificando")
}


class AyudanteDeProfesor(nombre: String, edad: Int,materia: String,val jefe: Profesor) extends Profesor(nombre,edad,materia){
    def ayudar: Unit = println(s"Estoy ayudando en la materia de: $materia al profesor: $jefe.nombre")
    override def teach: Unit = {
        super.teach  // Podemos sobreescribir de esta forma el método de la clase padre
        println("Solo enseño medio tiempo")
    }
    override def Presentacion: Unit = {
        super.Presentacion
        println("Me desempeño como ayudante de profesor.")
    }

}

object Test extends App {
    val Profesor1: Profesor = new Profesor(nombre = "Luis", edad = 45, materia = "Matemáticas")
    val Ayudante1: AyudanteDeProfesor = new AyudanteDeProfesor(nombre = "Elvis", edad = 25, materia = "Matemáticas")
    val Persona1: Persona = new Persona(nombre = "Carla", edad = 25)
}


