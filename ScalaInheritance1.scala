package core

//scala Inheritance
class Employee{
  var salary1:Float = 10000
}

class Programmer extends Employee{
  var bonus:Int = 5000
  println("Salary = "+salary1)
  println("Bonus = "+bonus)
}

class emp_detail extends Programmer {
  def show(){
    println("salary1 = "+salary1)
    println("bonus = "+bonus)
  }
}

object ScalaInheritance1 {

    def main(args:Array[String]){
      new Programmer()
      var emp = new emp_detail
      emp.show()
    }


}
