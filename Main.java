//Projeto: Caixa eletrônico//

package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int chances = 2;
        int erro = 0;
        int password = 01020304;
        int s = 0;

        System.out.println("---- Bem-vindo ao Caixa Eletrônico ----");

        String cpf = "123.456.789-00";
        String n;
        System.out.println("Entrando...");

        System.out.println("Digite seu CPF: ");
        n = ler.nextLine();

        if (n.equals(cpf)) {
            System.out.println("---- CPF permitido ----");
        } else {
            System.out.println("---- CPF inválido ----");
            main(args);
        }
        for (int i = 0; i <= chances; i++) {

            if (erro < 2) {
                System.out.println("Aguarde...");
                System.out.println("Digite sua senha para prosseguirmos: ");
                s = ler.nextInt();

                if (s != password) {
                    System.out.println("---- Senha inválida ----");
                    erro++;
                } else {
                    System.out.println("---- Senha válida ----");
                    break;
                }
                } else {
                    System.out.println("Conta bloqueada.");
                    System.out.println("Motivo: Máximo de tentativas atingidas.");
                    main(args);
                 }
            }

            long saldo = 1000L;
            int opcao = 0;

            do {

                System.out.println("---- Bem-vindo a sua conta ----");
                System.out.println("-------------------");
                System.out.println("Menu de opções: ");
                System.out.println("1 -- Saldo");
                System.out.println("2 -- Depósito");
                System.out.println("3 -- Saque");
                System.out.println("0 -- Sair");
                System.out.println("-------------------");


                long deposito = 0L;
                long saque = 0L;
                System.out.println("Digite o número referente a sua opção: ");
                opcao = ler.nextInt();
                ler.nextLine();
                switch (opcao) {
                    case 1:
                        System.out.println("Saldo : R$ " + saldo);
                        ler.nextLine();
                        break;

                    case 2:
                        System.out.println("Digite  o valor do depósito: ");
                        deposito = ler.nextLong();
                        ler.nextLine();
                        if (deposito > 0) {
                            saldo = saldo + deposito;
                            System.out.println("Seu novo saldo é: R$ " + saldo);
                        }
                        ler.nextLine();
                        break;

                    case 3:
                        System.out.println("Digite o valor do saque: ");
                        saque = ler.nextLong();
                        ler.nextLine();
                        if (saque > saldo) {
                            System.out.println("Valor indisponível no saldo");
                            ler.nextLine();
                            break;

                        }
                        saldo = saldo - saque;
                        System.out.println("Seu novo saldo é: R$ " + saldo);
                        ler.nextLine();
                        break;

                    case 0:
                        System.out.println("Obrigado por utilizar nossos serviços!");
                        main(args);
                        break;

                    default:
                        System.out.println("---- Opção inválida ----");
                        break;
                }

            } while (opcao != 0);

        }
    }






