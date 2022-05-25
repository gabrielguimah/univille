import java.lang.Math;

public class Cubo {
    double volume;
    double altura;

    double calculo() {
        volume = (Math.pow(altura, 3));
        return volume;
    }

    public Cubo(double altura) {
        this.altura = altura;
    }
}
