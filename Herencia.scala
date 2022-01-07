// Nos permitre heredar las características de alguna otra clase.
// Métodos y atributos de la clase padre
object Herencia extends App{
    class Vehiculo (val marca: String, val modelo: String, metraje: Float){
        def Presentacion(): Unit = println(s"Soy de la marca $marca y modelo $modelo")
    }
}