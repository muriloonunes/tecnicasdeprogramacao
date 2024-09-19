package aula3.exercicio2;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        boolean verdadeira = true;

        while (verdadeira) {
            System.out.println("Selecione o tipo da figura geométrica:");
            System.out.println("1 - Círculo\n2 - Quadrado\n3 - Retangulo\n4 - Triangulo\n5 para sair");
            int forma = ler.nextInt();

            switch (forma) {
                case 1:
                    System.out.println("Qual a cor do circulo?");
                    String corCirculo = ler.next();
                    System.out.println("Qual o raio do circulo?");
                    double raioCirculo = ler.nextDouble();
                    Circulo circulo = new Circulo(corCirculo, raioCirculo);
                    System.out.println(circulo);
                    break;
                case 2:
                    System.out.println("Qual a cor do quadrado?");
                    String corQuadrado = ler.next();
                    System.out.println("Qual o tamanho do lado do quadrado?");
                    double ladoQuadrado = ler.nextDouble();
                    Quadrado quadrado = new Quadrado(corQuadrado, ladoQuadrado, ladoQuadrado);
                    System.out.println(quadrado);
                    break;
                case 3:
                    System.out.println("Qual a cor do retangulo?");
                    String corRetangulo = ler.next();
                    System.out.println("Qual a base do retangulo?");
                    double ladoRetangulo1 = ler.nextDouble();
                    System.out.println("Qual a altura do retangulo?");
                    double ladoRetangulo2 = ler.nextDouble();
                    Retangulo retangulo = new Retangulo(corRetangulo, ladoRetangulo1, ladoRetangulo2);
                    System.out.println(retangulo);
                    break;
                case 4:
                    System.out.println("Qual a cor do triangulo?");
                    String corTriangulo = ler.next();
                    System.out.println("Qual a base do triangulo?");
                    double baseTriangulo = ler.nextDouble();
                    System.out.println("Qual a altura do triangulo?");
                    double alturaTriangulo = ler.nextDouble();
                    Triangulo triangulo = new Triangulo(corTriangulo, baseTriangulo, alturaTriangulo);
                    System.out.println(triangulo);
                    break;
                case 5:
                    verdadeira = false;
            }
        }
    }
}