class Vector(val x: Int, val y: Int){
    def +(other: Vector): Vector={
        new Vector(this.x+ other.x, this.y+ other.y)
    }
}

val v1= new Vector(1, 2)
val v2= new Vector(2, 3)
val v3= v1+ v2
println(v3.x, v3.y)