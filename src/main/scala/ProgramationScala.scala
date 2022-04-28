//import scala.collection.mutable._
import scala.Tuple1
import scala.collection.immutable._




object ProgramationScala {

  def main (args : Array[String]) : Unit =
  println("Hello World, Scala")

  //Definition de un methode
  def testHello(texte:String):Unit={
    val a = 10
    val b = 150
    val c = a+b
    println("voici votre $essqge" + texte)
    return c
  }//def testHello (text:string) String={
   // val a = 10
    //val b = 150
   // val c = a+b
    //println("voici votre $essqge" + texte)
    ////return c.toString
  }
}

def structuresDataScala():Unit={
  //liste
  val liste1:List[Int]=List(1,8,6,9,59,23,15,4)
  val liste_names:List[String=List("Jose","Aurelien","Vincent")
  val nums=List.range(0,15)
  for (name<-liste_names){
    println(liste_names)
  }

  val liste_maj:List[String]=liste_names.map(e=>e.toUpperCase)
  liste_maj.foreach(e=>println(e))
    //foreach(e=>e.toUpperCase):Unit

val liste_v=liste_names.map(l=>l.startsWith("v"))
  liste_v.foreach(l=>println(l))

  //creer une liste dont le resultat es le double de la liste1

  val liste2:List[Int]=liste1.map(e=>e+2)

    println(liste2)
  liste2.foreach(e=>println(e))

  //Liste dont les valeurs sont superieur à partir de la liste 1
  val liste3:List[Int]=liste1.filter(_>5)
  liste3.foreach(e=>println(e))

  //tuple
  val nom_tuple:(String, Int, Boolean)=("jvc",40,true)
  val tuple2=(45,"lion","terre",false)
  val vehicule2=("Moteur Diesel","Automati","Method")

  println(tuple2._3.toUpperCase)
  vehicule2.3

  //Map ou table de machage ou table de cle valeurs

  val villes:Map[String,String]=Map(
    "PS"->"Paris",
    "LS"->"Lyon",
    "MA"->"Marseille"
  )

  villes.foreach((k,v)=>println("cle"+k+"valeur"+v))


  //tableau
  val tab:Array[String]=Array("Jose","Aurlien","Oscar","Pepe")
  tab(0)="Jose"
  var k=0
  for (k<-0 to 6){
    println(tab(k))
  }

  tab.ma


}
