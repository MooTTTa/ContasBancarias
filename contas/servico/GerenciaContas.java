package contasBancarias.contas.servico;

import java.util.ArrayList;

import contasBancarias.contas.modelos.Conta;
import contasBancarias.contas.modelos.ContaCorrente;
import contasBancarias.contas.modelos.ContaEspecial;
import contasBancarias.contas.modelos.ContaPoupanca;

public class GerenciaContas {
    private ArrayList<Conta> contas;

    public GerenciaContas() {
        contas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta){
        contas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaPoupanca(int numeroConta){
        contas.add(new ContaPoupanca(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite){
        contas.add(new ContaEspecial(numeroConta,  limite));
    }

    public boolean depositar(int numeroConta, double valor) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta.depositar(valor);
            }    
        }
        return false;
    }

    public boolean sacar(int numeroConta, double valor) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta.sacar(valor);
            }    
        }
        return false;
    }

    public String consultaSaldo(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta.toString();
            }    
        }
        return "conta não encontrada!";
    }
}

