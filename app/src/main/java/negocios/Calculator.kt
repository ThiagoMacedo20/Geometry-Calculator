package negocios

class Calculator {

    fun areaTriangulo(base: Double,altura: Double): Double{
        return (base*altura) / 2
    }

    fun areaRetangulo(base: Double,altura: Double): Double{
        return base*altura
    }

    fun areaQuadrado(lado: Double):Double{
        return lado*lado
    }

    fun areaTrapezio(base: Double,baseMenor: Double,altura: Double): Double{
        return (base+baseMenor)*altura/2
    }

    fun areaLosango(diagonal: Double,diagonalMenor: Double): Double{
        return (diagonal* diagonalMenor)/2
    }
}