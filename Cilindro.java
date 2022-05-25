import java.lang.Math;

public class Cilindro {
  double volume;
  double raio;
  double altura;
  double pi = 3.14159265359;

  double calculo() {
    volume = pi * Math.pow(raio, 2) * altura;
    return volume;
  }

  public Cilindro(double raio, double altura) {
    this.raio = raio;
    this.altura = altura;

  }
}
