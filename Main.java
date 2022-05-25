public class Main {

  public static void main(String[] args) {
    System.out.println("=== Exemplo de cálculo de volume de formas geométricas ===");

    Esfera esfera = new Esfera(3);
    System.out.println("=> Esfera: " + esfera.calculo() + " m3");

    Cilindro cilindro = new Cilindro(10, 2);
    System.out.println("=> Cilindro: " + cilindro.calculo() + " m3");

    Cubo cubo = new Cubo(6);
    System.out.println("=> Cubo: " + cubo.calculo() + " m3");

    Cone cone = new Cone(12, 5);
    System.out.println("=> Cone: " + cone.calculo() + " m3");
  }

}