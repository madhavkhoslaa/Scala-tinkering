import scala.math.pow
import scala.math.sin

class Vector(val x: Int, val y: Int){
    def +(other: Vector): Vector= {
        new Vector(this.x+ other.x, this.y+ other.y)
    }

    def *(other: Vector, angle: Double): Double= {
        val abs_this: Double= pow(pow(this.x, 2)+ pow(this.y, 2), 1/2)
        val abs_other: Double= pow(pow(other.x, 2)+ pow(other.y, 2), 1/2)
        val sine_val: Double= sin(angle)
        return abs_other*abs_this*sine_val
    }

    def dot(other: Vector, angle:Double): Double= {
        val abs_this: Double= pow(pow(this.x, 2)+ pow(this.y, 2), 1/2)
        val abs_other: Double= pow(pow(other.x, 2)+ pow(other.y, 2), 1/2)
        val cos_val: Double= cos(angle)
        return abs_other*abs_this*cos_val
    }

    def -(other: Vector): Vector= {
        return new Vector(this.x- other.x, this.y- other.y)
    }
}

val v1= new Vector(1, 2)
val v2= new Vector(2, 3)
val v3= v1+ v2
println(v3.x, v3.y)
val cross: Double= v1 *(v2, 45)
val dot: Double= v1.dot(v2, 46)
print(cross)
print(dot)
