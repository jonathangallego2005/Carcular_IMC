import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = entrada.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Su IMC es: " + imc);

        if (imc <= 18.5) {
            System.out.println("Bajo peso");
        } else if (imc <= 25.0) {
            System.out.println("Normal");
        } else if (imc <= 30.0) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obeso");
        }

    }
}
