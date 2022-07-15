package dio.digitalinnovation.one.MAula03;

public class Main {
    public static void main(String[] args) {
        double areaQuadrado = Quadrilatero2.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero2.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero2.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);
    }
}
