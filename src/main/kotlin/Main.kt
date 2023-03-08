import java.time.MonthDay

fun main(){
info()
acces(7)
acces(4)
numbers(arrayOf(25,78,9,12,18))
    gramatical()
    var woman=Human("female","dark",6.5,50.0)
    woman.rest()
    woman.identity()
var story=Book("Daniel Noe","Back in ciudad de k",1002,2022)
    story.author
    println(story.author)
    rule()
    location("Monday")
    please()
}
fun info(){
    var name="Nairobi"
    println(name[2])
    for (x in name)
        println(x)
    println(name.length)

    var names="it's possible"
    println(names.map { it.lowercase() })
    println(names.lowercase())
    println(names.uppercase())
    println(names.capitalize())
}
fun acces(num:Int){

if (num==7){
    println("neutral")}
    else if(num !=7){
       println("acidic")
}


}
fun numbers(num:Array<Int>){
    println(num.max())

}
fun gramatical(){
    var name= arrayOf("anitab", "adalab", "hopperlab", "rwanda", "kenya", "tanzania")
    println(name.map { it.capitalize() })
}
fun rule(){
    var fullname="my name is clarine"
    var age="i am 19 years old"
    println("my name is clarine" + "  " +"i am 19 years old")
}
class Human(var gender:String,var colour:String,var height:Double,var weight:Double){
fun rest(){
    var sleep="sleep eight hours "
    println(sleep)
}
    fun identity(){
        println("my name is Phelisa")
    }
}
data class Book(var author:String,var title:String,var pages:Int,var year:Int){


}
fun location(day:String){
    if (day=="Monday")
        println("Today")
    else{
        println("Tommorow")
    }
}
fun please(){
    var txt="please locate the place"
    println(txt.indexOf("locate"))
    var names= arrayOf("Tom","Njeri","Mary")
    println(names.indexOf("Njeri"))
    println(names.plus("Ann").contentToString())
    println(names.contentToString())
    println(txt.trimEnd())
    println(txt.trimEnd())

}
fun result(){
    var numbers= arrayOf(23,6,90,4,6,7)
    println(numbers.contentToString()[0])

}



