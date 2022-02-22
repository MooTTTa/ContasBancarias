    package Repositorios.contasBancarias.contas.modelos;

public class ContaCorrente extends Conta {
    final double TAXA_DEPOSITO = 0.1;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public boolean sacar(double valor) {
        if(getSaldo() >= valor){           
            return super.sacar(valor);
        }   
        return false;
    }      

    @Override
    public boolean depositar(double valor) {

        return super.depositar(valor - TAXA_DEPOSITO);

    }

    @Override
    public String toString() {
      
        return "cc: " +  super.toString();
    }
}
