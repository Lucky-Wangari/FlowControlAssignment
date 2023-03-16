fun main() {
    numbers()

    names(arrayOf("Jonathan", "Anne","Joy", "Farida", "Singing"))

    softDrink(5)
    softDrink(14)
    softDrink(20)

    numerals()

}
fun numbers() {
    var number = 1..100
    for (x in number){
        if (x % 2 == 1){
          println(x)
        }
    }
}
fun names(name: Array<String>){
    for (y in name){
        if (y.length > 5){
            println(y)
        }
    }
}
fun softDrink(age: Int){
    if (age in 0..6){
          println("A glass of milk")
    } else if (age in 7..15){
        println("A bottle of fanta")
    }else{
        println("A bottle of Cocacola")
    }
}
fun numerals(){
    var numericals = 1..100
    for (z in numericals){
        if (z % 3 == 0 && z % 5 == 0){
            println("FizzBuzz")
        } else if (z % 3 == 0){
            println("Fizz")
        } else if (z % 5 == 0){
            println("Buzz")
        }
    }

    }
