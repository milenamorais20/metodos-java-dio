package dio.digitalinnovation.one.MAula01;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextDouble();

        double soma = somar(a,  b);
        double subt = subtrair( a,  b);
        double mult = multiplicar( a,  b);
        double divi = dividir( a,  b);

        System.out.println("soma: "+ soma);
        System.out.println("sub: " + subt);
        System.out.println("mult: " + mult);
        System.out.println("divi: "+ divi);
    }



    public static double somar(double a, double b){
        return a + b;
    }
    public static double subtrair(double a, double b){
        return a - b;
    }
    public static double multiplicar(double a, double b){
        return a * b;
    }
    public static double dividir(double a, double b){
        return a / b;
    }
}

