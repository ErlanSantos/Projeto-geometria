package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    public double base, lado2, lado3, area, perimetro, altura, hipotenusa, cateto1, cateto2;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() {
        System.out.println("/*********************/");
        System.out.println("/* Cadastro Triângulo */");
        System.out.println("/*********************/");
        System.out.print("/* Informe o lado 1:  */ ");
        base = scanner.nextDouble();
        System.out.print("/* Informe o lado 2:  */ ");
        lado2 = scanner.nextDouble();
        System.out.print("/* Informe o lado 3:  */ ");
        lado3 = scanner.nextDouble();
        System.out.print("/* Informe a altura:  */ ");
        altura = scanner.nextDouble();
        System.out.println("/* Triângulo Cadastrado com Sucesso */");
        System.out.println("/***********************************/");

        definirHipotenusa();

        return true;
    }
    private void definirHipotenusa() {
        // a condição abaixo Determina qual lado é a hipotenusa

        if (base > lado2 && base > lado3) {
            hipotenusa = base;
            cateto1 = lado2;
            cateto2 = lado3;
        } else if (lado2 > base && lado2 > lado3) {
            hipotenusa = lado2;
            cateto1 = base;
            cateto2 = lado3;
        } else {
            hipotenusa = lado3;
            cateto1 = base;
            cateto2 = lado2;
        }
    }

    public void calcularArea() {
        System.out.println("/********************************/");
        System.out.println("/*        Calculando Área        */");
        System.out.println("/********************************/");
        area = (base * altura) / 2;
        System.out.println("A área é: " + area);
        System.out.println("/********************************/");
    }

    public void calcularPerimetro() {
        System.out.println("/********************************/");
        System.out.println("/*        Calculando Perímetro   */");
        System.out.println("/********************************/");
        perimetro = base + lado2 + lado3;
        System.out.println("O perímetro é: " + perimetro);
        System.out.println("/********************************/");
    }

    public void definirTipo() {
        System.out.println("/********************************/");
        System.out.println("/*        Definir Tipo          */");
        System.out.println("/********************************/");

        if (base == lado2 && base == lado3) {
            System.out.println("Este triângulo é Equilátero.");
        } else if (base != lado2 && base != lado3 && lado2 != lado3) {
            System.out.println("Este triângulo é Escaleno.");
        } else {
            System.out.println("Este triângulo é Isósceles.");
        }

        System.out.println("/********************************/");
    }
    // Verifica se o triângulo é retângulo.
    // Math.pow,eleva um número à potência desejada.

    public void calculaTrianguloRetangulo() {
        if (Math.pow(hipotenusa, 2) == Math.pow(cateto1, 2) + Math.pow(cateto2, 2)) {
            System.out.println("É um triângulo retângulo.");
        } else {
            System.out.println("Não é um triângulo retângulo.");
        }
    }

    public void verificaTriangulo345(int lado1, int lado2, int lado3) {

        // Descobre o maior lado (que pode ser a hipotenusa).
        // O operador ternário (? :) funciona como um "if" tive que pesquisa no youtube:
        // Se lado1 for o maior, ele é escolhido. Se não, verificamos entre lado2 e lado3

        int maior = (lado1 > lado2 && lado1 > lado3) ? lado1 : (lado2 > lado3 ? lado2 : lado3);

        // Define os catetos
        int cateto1, cateto2;
        if (maior == lado1) {
            cateto1 = lado2;
            cateto2 = lado3;
        } else if (maior == lado2) {
            cateto1 = lado1;
            cateto2 = lado3;
        } else {
            cateto1 = lado1;
            cateto2 = lado2;
        }

        // Verifica se é um triângulo retângulo.
        if ((maior * maior) == (cateto1 * cateto1) + (cateto2 * cateto2)) {
            // Calcula os restos da divisão dos lados pelos fatores 3, 4 e 5
            if (maior % 5 == 0 && cateto1 % 3 == 0 && cateto2 % 4 == 0) {
                System.out.println("É um triângulo 3,4,5 ");
            } else if (maior % 5 == 0 && cateto1 % 4 == 0 && cateto2 % 3 == 0) {
                System.out.println("É um triângulo 3,4,5 ");
            }

        } else {
            System.out.println("Não é um triângulo 3,4,5.");
        }
    }

}









