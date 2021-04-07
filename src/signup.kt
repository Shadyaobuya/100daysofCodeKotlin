fun signup(){
    println("Enter your Username")
    var userName=readLine()
    println("Enter your Password")
    var password=readLine()!!
    var pass=password.toLowerCase()
    if (password.length<=6){
        println("password should be more than 6 characters")
        if (password==pass) {
            println("You should Have at least one Uppercase letter")
        }
    }
    else{
        println("Successful Signup")
    }
}

fun main(){
    signup()
}