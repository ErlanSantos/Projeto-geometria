package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

public class Menu {
    //istaciando teclado
    Scanner scanner = new Scanner(System.in);

    public void  executarMenu () {

        boolean exit = false;
        while (!exit){
            System.out.println("/********************/");
            System.out.println("/*  Geometria   */");
            System.out.println("/********************/");
            System.out.println("/* 1 - Circulo   */");
            System.out.println("/* 2 - Retângulo  */");
            System.out.println("/* 3 - Triângulo   */");
            System.out.println("/* 4 - Sair   */");
            System.out.println("/********************/");

            System.out.println("Ibforme a opção desejada:");
            int optionUser = scanner.nextInt();

            switch (optionUser){
                case 1:
                    boolean exitCirculo = false;
                    Circulo circulo = new Circulo();
                    while (!exitCirculo) {
                        System.out.println("*/******************/");
                        System.out.println("*/****   Circulo   ***/");
                        System.out.println("*/******************/");
                        System.out.println("*/* 1 - Cadastrar Circulo */");
                        System.out.println("*/* 2 - Calcular Area */");
                        System.out.println("*/* 3 - Calcular Perimetro */");
                        System.out.println("*/*4 - Sair/");
                        System.out.println("*/******************/");
                        System.out.println("Infornme a opção desejada");

                        int optionCirculo = scanner.nextInt();

                        switch (optionCirculo){

                            case 1:

                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                System.out.println("Saindo do Circulo.....");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Digite uma opção valida");
                        }
                    }
                    break;
                case 2:

                    boolean exitRetangulo = false;

                    Retangulo retangulo = new Retangulo();

                    boolean validaRetangulo = false;

                    while (!exitRetangulo){
                        System.out.println("*/******************/");
                        System.out.println("*/****   Retângulo   ***/");
                        System.out.println("*/******************/");
                        System.out.println("*/* 1 - Cadastrar Retângulo */");
                        System.out.println("*/* 2 - Calcular Area */");
                        System.out.println("*/* 3 - Calcular Perimetro */");
                        System.out.println("*/*4 - Sair/");
                        System.out.println("*/******************/");
                        System.out.println("Infornme a opção desejada");

                        int optionRetangulo = scanner.nextInt();

                        switch (optionRetangulo){
                            case 1:
                                validaRetangulo = retangulo.cadastrarRetangulo();
                                break;
                            case 2:
                                if (validaRetangulo){
                                    retangulo.calcularArea();
                                }else {
                                    System.out.println("Cadastrar um Retângulo !");
                                }
                                break;
                            case 3:
                                if (validaRetangulo){
                                    retangulo.calcularPerimetro();
                                }else {
                                    System.out.println("Cadastrar um Retângulo !");
                                }
                                break;
                            case 4:
                                System.out.println("Saindo Retângulo....");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção valida!");
                        }

                    }
                    break;
                case 3:
                    boolean exitTriangulo = false;

                    Triangulo triangulo = new Triangulo();

                    boolean validaTriangulo = false;

                    while (!exitTriangulo){
                        System.out.println("*/******************/");
                        System.out.println("*/****   Triângulo   ***/");
                        System.out.println("*/******************/");
                        System.out.println("*/* 1 - Cadastrar Triângulo */");
                        System.out.println("*/* 2 - Calcular Area */");
                        System.out.println("*/* 3 - Calcular Perimetro */");
                        System.out.println("*/*4 - Ver se é triângulo retângulo/");
                        System.out.println("*/*5- Ver se é triângulo tres quatro cinco/");
                        System.out.println("*/*6 - Ver qual tipo de triagulo/");
                        System.out.println("*/*7 - sair/");
                        System.out.println("*/******************/");
                        System.out.println("Infornme a opção desejada");

                        int optionTriangulo = scanner.nextInt();

                        switch (optionTriangulo){
                            case 1:
                                validaTriangulo = triangulo.cadastrarTriangulo();
                                break;
                            case 2:
                                if (validaTriangulo){
                                    triangulo.calcularArea();
                                }else {
                                    System.out.println("Cadastrar um triangulo !");
                                }
                                break;
                            case 3:
                                if (validaTriangulo){
                                    triangulo.calcularPerimetro();
                                }else {
                                    System.out.println("Cadastrar um triangulo !");
                                }
                                break;
                            case 4:
                                if (validaTriangulo){
                                    triangulo.calculaTrianguloRetangulo();
                                }else {
                                    System.out.println("Cadastrar um triangulo !");
                                }

                                break;
                            case 5:
                                if (validaTriangulo){
                                    triangulo.verificaTriangulo345((int)triangulo.cateto1, (int)triangulo.cateto2,(int) triangulo.hipotenusa);
                                }else {
                                    System.out.println("Cadastrar um triangulo !");
                                }
                                break;
                            case 6:
                                if (validaTriangulo){
                                    triangulo.definirTipo();
                                }else {
                                    System.out.println("Cadastrar um triangulo !");
                                }
                                break;
                            case 7:
                                System.out.println("Saindo triangulo....");
                                exitRetangulo = true;
                            default:
                                System.out.println("Escolha uma opção valida!");
                        }

                    }
                    break;
                case 4:System.out.println("Escolheu 4");
                    exit = true;
                    break;
                default:
                    System.out.println("Escolha uma opção");
            }

        }
        }


}
