package eu.tutorials.practicekotlin


fun main() {
    val HongPhuc = Person("Hong Phuc Dep Zai", 23, "Bandai toys", null)
    val ThanhCong = Person("Le Thanh Cong", 23, "playing basketball", null)
    HongPhuc.showProfile()
    ThanhCong.showProfile()
}

class Person(val name:String, val age:Int, val hobby:String?, val referrer: Person?){
    fun showProfile(){
        println("name :  $name, age : $age, hobby: $hobby, referrer: $referrer")
    }
}