abstract class FiguraGeometrica extends App{
    // Obligación a crear al menos un método abstracto
    // Método Abstracto: 
    // No se puede instanciar de una clase abstracta
    // Se puede instanciar de una clase hija de abstracta
    def perimetro(): Int
    def area(): Double

}

class Triangulo(base: Int, altura: Int) extends FiguraGeometrica {
    override def perimetro(): Int =  base * 3
    override def area(): Double = base * altura / 2
}