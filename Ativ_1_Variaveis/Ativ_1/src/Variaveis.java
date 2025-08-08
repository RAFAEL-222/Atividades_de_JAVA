import java.util.Scanner;

public class Variaveis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // 1
        System.out.println("Digite a temperatura em Celsius: ");
        double temp = entrada.nextDouble();
        double fahrenheit = (temp * 9/5) + 32;
        double kelvin = temp + 273.15;
        System.out.println("A temperatura em Fahrenheit e igual a  " + fahrenheit);
        System.out.println("A temperatura em Kelvin e igual a  " + kelvin);
        System.out.println();

        //2
        double cap;
        System.out.println("Digite o capital inicial: ");
        cap = entrada.nextDouble();
        double juros;
        System.out.println("Digite a taxa de juros (em %): ");
        juros = entrada.nextDouble();
        int tempo;
        System.out.println("Digite o tempo(meses): ");
        tempo = entrada.nextInt();
        double resultado = cap * Math.pow((1 + juros/100), tempo);
        System.out.printf("O valor com os juros, apos %d meses e igual a %.2f %n", tempo, resultado);
        System.out.println();

        //3
        double nota1;
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        double nota2;
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();
        double nota3;
        System.out.println("Digite a terceira nota: ");
        nota3 = entrada.nextDouble();
        double media = (nota1 + nota2 + nota3 ) / 3;
        System.out.printf("A media das notas e igual a %.1f %n", media);
        System.out.println();

        //4
        double capSimples;
        System.out.println("Digite o capital inicial: ");
        capSimples = entrada.nextDouble();
        double jurosSimples;
        System.out.println("Digite a taxa de juros (em %): ");
        jurosSimples = entrada.nextDouble();
        int tempoSimples;
        System.out.println("Digite o tempo(meses): ");
        tempoSimples = entrada.nextInt();
        double valorJuros = capSimples * jurosSimples/100 * tempoSimples;
        double valorTotal = capSimples + valorJuros;
        System.out.printf("O valor dos juros após %d meses é igual a R$ %.2f%n", tempoSimples, valorJuros);
        System.out.printf("O valor total (capital + juros) é igual a R$ %.2f%n", valorTotal);
        System.out.println();

        //5
        double raio;
        System.out.println("Digite o raio do circulo: ");
        raio = entrada.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;
        System.out.printf("A area do circulo e igual a %.2f %n", area);
        System.out.printf("O perimetro do circulo e igual a %.2f %n", perimetro);
        entrada.close();
    }
}
