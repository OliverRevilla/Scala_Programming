object Recursion extends App{

    // Para optimizar funciones recursivas se necesita saber si puede serlo por el compilador
    // Se necesita además que la recursión esté en la última declaración
    // Solo se debe llamar a la función recursiva sin adicionales
    //annotation.tailrec
    @annotation.tailrec
    def exponencial(num: BigInt, exp: BigInt, aux : BigInt = 1): BigInt = {
        if (exp < 1) Aux
        else exponencial(num, exp -1, num*aux)       

    } 
}