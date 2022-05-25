import java.lang.Math;

public class Cone {
  double volume;
  double raio;
  double altura;
  double pi = 3.14159265359;

  double calculo() {
      volume = ((pi * Math.pow(raio, 2) * altura) / 3);
      return volume;
  }
  
  public Cone(double raio, double altura) {
      this.raio = raio;
      this.altura = altura;
  }
}