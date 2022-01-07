// Sobrecarga de operadores: Cuando hay mas de una funcionalidad de un solo operador
class Rational(n:Int, d:Int){
    private val g = gcd(n.abs, d.abs) // MCD de ambos numeros
    val numer: Int = n/g
    val denom: Int = d/g

    // Contructor auxiliar
    def this(n:Int) = this(n,1)

    // Redefiniendo operadores
    def +(that: Rational): Rational =
        new Rational(
            numer*that.denom + that.numer*denom,
            denom*that.denom
        )
    
    def +(i:Int): Rational =
        new Rational(numer + i*denom, denom)

    def -(that: Rational): Rational = 
        new Rational(
            numer*that.denom - that.numer*denom,
            denom*that.denom
        )
    
    def -(i:Int): Rational =
        new Rational(numer - i*denom,denom)

    private def gcd(a:Int, b:Int): Int =
        if(b == 0) a else gcd(b, a % b)

    def lessThan(that: Rational): Boolean =
        this.numer * that.denom < that.numer * this.denom

    def max(that: Rational): Rational =
        if (this.lessThan(that)) that else this

    override def  toString: String = numer + "/" + denom  

}


object implicitConvertion {
    implicit def intToRational(x:Int): Rational =
        new Rational(x)
}

