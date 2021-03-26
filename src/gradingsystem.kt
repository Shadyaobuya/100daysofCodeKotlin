fun main(){
    println("Enter Your Average marks")
    var average=gradingSystem(readLine()!!.toFloat())
    println(average)
}

fun gradingSystem(average:Float):String{


    if (average>=80){
        return "You scored an A"
    }
    else if(average>=70){
        return "You scored a B"
    }
    else if(average>=60){
        return "You scored a C"
    }
    else if(average>=50){
        return "You scored a D"
    }
    else if(average>=40){
        return "You scored an E"
    }
    else if(average>=0){
        return "You scored an F"
    }
    else{
        return "Enter valid marks"
    }



    }