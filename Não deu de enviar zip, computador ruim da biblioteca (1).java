import java.util.Scanner;

public class Calculadora {

    // Atributos
    private double p1, v1, t1;
    private double p2, v2, t2;

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        cal.menu();
    }

    // Isotérmica: p1 * v1 = p2 * v2
    public void isotermica() {
        System.out.println("Digite o valor de p1: ");
        p1 = sc.nextDouble();
        System.out.println("Digite o valor de v1: ");
        v1 = sc.nextDouble();
        System.out.println("Digite o valor de p2: ");
        p2 = sc.nextDouble();
        v2 = (p1 * v1) / p2;
        

        System.out.println("O valor de V2 = " + v2);
    }

    // Isobárica: v1 / t1 = v2 / t2
    public void isobarica() {
        System.out.println("Digite o valor de v1: ");
        v1 = sc.nextDouble();
        System.out.println("Digite o valor de t1 (Kelvin): ");
        t1 = sc.nextDouble();
        System.out.println("Digite o valor de t2 (Kelvin): ");
        t2 = sc.nextDouble();

        v2 = (v1 * t2) / t1;

        System.out.println("O valor de V2 = " + v2);
    }

    // Isovolumétrica: p1 / t1 = p2 / t2
    public void isovolumetrica() {
        System.out.println("Digite o valor de p1: ");
        p1 = sc.nextDouble();
        System.out.println("Digite o valor de t1 ( Kelvin): ");
        t1 = sc.nextDouble();
        System.out.println("Digite o valor de t2 (Kelvin): ");
        t2 = sc.nextDouble();

        p2 = (p1 * t2) / t1;

        System.out.println("O valor de P2 = " + p2);
    }

    // Equação Geral: p1 * v1 / t1 = p2 * v2 / t2
    public void geral() {
        int escolha;
        System.out.println("calcular valume,pressao ou temperatura?");
        System.out.println("1 - Volume (V2)");
        System.out.println("2 - Pressao (P2)");
        System.out.println("3 - Temperatura (T2)");
        System.out.print("Escolha: ");
        escolha = sc.nextInt();

        switch (escolha) {
            case 1 -> {
                System.out.println("Digite p1:");
                p1 = sc.nextDouble();

                System.out.println("Digite v1:");
                v1 = sc.nextDouble();

                System.out.println("Digite t1:");
                t1 = sc.nextDouble();

                System.out.println("Digite p2:");
                p2 = sc.nextDouble();
                
                System.out.println("Digite t2:");
                t2 = sc.nextDouble();

                v2 = (p1 * v1 * t2) / (p2 * t1);
                System.out.println("O valor de V2 = " + v2);
            }

            case 2 -> {
                System.out.println("Digite p1:");
                p1 = sc.nextDouble();

                System.out.println("Digite v1:");
                v1 = sc.nextDouble();

                System.out.println("Digite t1:");
                t1 = sc.nextDouble();

                System.out.println("Digite v2:");
                v2 = sc.nextDouble();

                System.out.println("Digite t2:");
                t2 = sc.nextDouble();

                p2 = (p1 * v1 * t2) / (v2 * t1);
                System.out.println("O valor de P2 = " + p2);
            }

            case 3 -> {
                System.out.println("Digite p1:");
                p1 = sc.nextDouble();

                System.out.println("Digite v1:");
                v1 = sc.nextDouble();
                
                System.out.println("Digite t1:");
                t1 = sc.nextDouble();

                System.out.println("Digite p2:");
                p2 = sc.nextDouble();

                System.out.println("Digite v2:");
                v2 = sc.nextDouble();

                t2 = (p2 * v2 * t1) / (p1 * v1);
                System.out.println("O valor de T2 = " + t2);
            }

            default -> System.out.println("Opção inválida!");
        }
    }

    // Menu

    public void menu() {

        int opcao;
        do {
            System.out.println("\n Calculadora de Gases \n");

            System.out.println("1 - Transformacao Isotérmica");

            System.out.println("2 - Transformacao Isobárica");

            System.out.println("3 - Transformacao Isovolumétrica");

            System.out.println("4 - Equacaoo Geral dos Gases");

            System.out.println("0 - Sair\n");

            System.out.print("Escolha: ");
            
            opcao = sc.nextInt();

            switch (opcao) {

                case 1 -> isotermica();

                case 2 -> isobarica();

                case 3 -> isovolumetrica();

                case 4 -> geral();

                case 0 -> System.out.println("Finalizado!");


                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}