
import java.util.Scanner;
public class Formas {

public static void main(String[]args) {
double a, b, c;

Scanner sc = new Scanner(System.in);
System.out.println("CALCULADORA DE FÓRMULAS GEOMÉTRICAS\n"
+ "Escolha uma delas por número: \n1-Quadrado\n2-Triângulo\n3-Retângulo\n4-Trapézio\n5-Losango\n6-Círculo");
int opcao = sc.nextInt();


if (opcao == 1) {
System.out.println("fale um lado do quadrado: ");
a = sc.nextDouble();
System.out.println("Área do quadrado: "+ (a * a));

}else if (opcao == 2) {
System.out.println("Digite a base: ");
a = sc.nextDouble();
System.out.println("Digite a altura: ");
b = sc.nextDouble();
System.out.println("Área do triângulo: "+ ((a * b) / 2));

}else if (opcao == 3) {
System.out.print("Digite a base: ");
a = sc.nextDouble();
System.out.print("Digite a altura: ");
b = sc.nextDouble();
System.out.println("Área do retângulo: " + (a * b));

} else if (opcao == 4) {
System.out.print("Digite a base maior: ");
a = sc.nextDouble();
System.out.print("Digite a base menor: ");
b = sc.nextDouble();
System.out.print("Digite a altura: ");
c = sc.nextDouble();
System.out.println("Área do trapézio: " + ((a + b) * c / 2));

} else if (opcao == 5) {
System.out.print("Digite o raio: ");
a = sc.nextDouble();
System.out.println("Área do círculo: " + (Math.PI * a * a));

} else if (opcao == 6) {
System.out.print("Digite a diagonal maior: ");
a = sc.nextDouble();
System.out.print("Digite a diagonal menor: ");
b = sc.nextDouble();
System.out.println("Área do losango: " + ((a * b) / 2));

} else {
System.out.println("Opção inválida");
}

sc.close();
}
}