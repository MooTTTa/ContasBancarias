package contasBancarias.contas.modelos;

public class Conta {
    private double saldo;
    private int numero;

    public Conta() {

    }

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public double getNumero() {
        return numero;
    }

    public double getSaldo() {
        return numero;
    }
 
    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        } 
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override   
    public String toString() {
        return numero + " saldo: " + saldo;
    }
}
