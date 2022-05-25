import java.lang.Math;

public class Esfera {
  double volume;
  double raio;
  double pi = 3.14159265359;

  double calculo() {
      volume = (((4 * pi) / 3) * Math.pow(raio, 3));
      return volume;
  }
  
  public Esfera(double raio) {
      this.raio = raio;
  }
}
