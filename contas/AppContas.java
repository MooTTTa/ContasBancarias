package Repositorios.contasBancarias.contas;


import java.util.Scanner;

//oi

import Repositorios.contasBancarias.contas.servico.GerenciaContas;

public class AppContas {
    public static void main(String[] args) {

        //ArrayList<Conta> Contas = new ArrayList<>();
        GerenciaContas contas = new GerenciaContas();
        
        Scanner SC = new Scanner(System.in);
        int opcao = 0;
        int numeroConta;
        double limite, valor;

        while (opcao != 7) {
            System.out.println("1 - CC");
            System.out.println("2 - CP");
            System.out.println("3 - CE");
            System.out.println("4 - DEPOSITO");
            System.out.println("5 - SACAR");
            System.out.println("6 - CONSULTAR SALDO");
            System.out.println("7 - SAIR");
            opcao = SC.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = SC.nextInt();
                    contas.novaContaCorrente(numeroConta);
                    break;

                case 2:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = SC.nextInt();
                    contas.novaContaPoupanca(numeroConta);
                    break;

                case 3:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = SC.nextInt();
                    System.out.println("Informe o limite da conta: ");
                    limite = SC.nextInt();
                    contas.novaContaEspecial(numeroConta, limite);

                    break;

                case 4:
                    System.out.println("Informe o numero da conta: ");
                    numeroConta = SC.nextInt();
                    System.out.println("informe o valor que deseja depositar: ");
                    valor = SC.nextDouble();
                       
                    if (contas.depositar(numeroConta, valor)) {
                        System.out.println("Operação concluida!");                       
                    } else {
                        System.out.println("Falha na operação! ");
                    } 

                    break;

                case 5:

                    System.out.println("Informe o numero da conta: ");
                    numeroConta = SC.nextInt();
                    System.out.println("informe o valor que deseja sacaar: ");
                    valor = SC.nextDouble();

                    if (contas.sacar(numeroConta, valor)) {
                        System.out.println("Operação concluida!");                       
                    } else {
                        System.out.println("Falha na operação! ");
                    } 
                    break;

                case 6:
                    System.out.println("qual conta deseja conferir: ");
                    numeroConta = SC.nextInt();
                        System.out.println(contas.consultaSaldo(numeroConta));
                    break;

                case 7:
                    System.out.println("saindo do programa...");
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }

        }

        SC.close();

    }
}
