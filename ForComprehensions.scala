object ExamplePerson extends App{
// For comprehensions
// Contiene: Generadores, Filtros, Definiciones.

// Generadores: pattern <-expression
// Filtros: if(expression) 
  case class Person(name: String, isMale: Boolean, children: Person*)
  
  val lucy = Person("Lucy",false)
  val maria = Person("Maria",false)
  val charles = Person("Charles",true)
  val geofrey = Person("Geofrey", true)
  val jane = Person("Jane",false, lucy, maria)
  val people = List(lucy,charles,jane,geofrey)
  
  //val forResult = for(p <- people; if !p.isMale; c <- p.children) yield(p.name, c.name)
  //forResult.foreach(println)
  
  val ExpandFor = for {
    p <-people // Generador
    n = p.name // Definicion
    if (n.startsWith("Ge")) // Filtro
    
  }yield n
  
  println(ExpandFor)  
}

  