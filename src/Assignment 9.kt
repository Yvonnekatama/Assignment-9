fun main() {

    println(evenLists(listOf("Mercy","Yvonne","Aisha","Evens","Paul","Asha","Eunice","Pamela","Leon","Lorna")))
    var heights=totalAvg(listOf(20.3,23.9,34.6,45.8,45.9))
    println(heights)
    var person= listOf(
        Person("Mary",24,52.1,56.4),
        Person("Perlin",34,59.2,56.7),
        Person("Mark",36,56.9,78.9)
    )
  var sortedAge=person.sortedByDescending{person->person.age }
    println(sortedAge)

    addDetails(mutableListOf(Person("Sharon",25,52.4,50.7)))

    var mycar= listOf(
        Car("KDB 234C",13000),
        Car("KCY 345D",12000),
        Car("KBV 456C",14000)
    )
    println(carObjects(listOf(13000,12000,14000)))
}
fun evenLists(names: List<String>):List<String> {
    var namePosition= mutableListOf<String>()
    for (name in names){
        if (names.indexOf(name)%2==0){
            namePosition.add(name)
            }
    }
         return namePosition

}
data class Heights(var total:Double,var average:Double)
fun totalAvg(theHeights:List<Double>):Heights{
    var total=theHeights.sum()
    var average=theHeights.average()

    return Heights(total, average)
}
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)

fun addDetails(people:MutableList<Person>){
    var person=Person("Matthew",36,52.1,67.9)
    var person2=Person("Jane",29,50.8,50.3)
    people.addAll(listOf(person,person2))
    println(people)

}

data class Car(var regisration:String,var mileage:Int)
fun carObjects(mileage:List<Int>):Int{
var avgMileage=mileage.average().toInt()
    return avgMileage
}