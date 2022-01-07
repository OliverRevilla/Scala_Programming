// Nos permitre heredar las características de alguna otra clase.
// Métodos y atributos de la clase padre
// No se ppuede heredar métodos privados
// Con la palabra val este es un atributo sino solo es un parámetro

object Herencia extends App{
    class Vehiculo (val marca: String, val modelo: String, metraje: Float){
        def Presentacion: Unit = println(s"Soy de la marca $marca y modelo $modelo")
    }
//No poner val en atributos de la clase padre en la clase hija porque se sobreescribe el atributo
    class Auto(marca: String, modelo: String, metraje: Float,val clase: String) extends Vehiculo (marca, modelo, metraje){
        def Descripcion: Unit = println(s"Pertenezco a la clase $clase con un metraje de $metraje")
    }
  
    val Automovil1 = new Auto("Ferrari","SP500",500.67,"Automóvil ligero")
    Automovil1.Presentacion
    Automovil1.Descripcion
}

