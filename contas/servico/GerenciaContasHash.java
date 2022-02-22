package contasBancarias.contas.servico;

import java.util.HashMap;

import contasBancarias.contas.modelos.Conta;
import contasBancarias.contas.modelos.ContaCorrente;
import contasBancarias.contas.modelos.ContaEspecial;
import contasBancarias.contas.modelos.ContaPoupanca;

public class GerenciaContasHash {
    private HashMap<Integer, Conta> contas;

    public GerenciaContasHash() {
        contas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta){
        contas.put(numeroConta, new ContaCorrente(numeroConta));
    }

    public void novaContaPoupanca(int numeroConta){
        contas.put(numeroConta, new ContaPoupanca(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite){
        contas.put(numeroConta, new ContaEspecial(numeroConta,  limite));
    }

    public boolean depositar(int numeroConta, double valor) {
        Conta conta = contas.get(numeroConta);
        
        if (conta != null) {
            return conta.depositar(valor);  
        }
        return false;
    }

    public boolean sacar(int numeroConta, double valor) {
        Conta conta = contas.get(numeroConta);
        
        
        if (conta != null) {
            return conta.sacar(valor);   
        }
        return false;
    }

    public String consultaSaldo(int numeroConta, int valor) {
        Conta conta = contas.get(numeroConta);
        
        
        if (conta != null) {
            return conta.toString();   
        }

        return "conta não encontrada!";
    }
}

