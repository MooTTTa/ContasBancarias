package contasBancarias.contas.modelos;

public class ContaPoupanca extends Conta {
    private  static double taxaSaque = 0.1;

    public ContaPoupanca(int numero){
        super(numero);
    }

    public void setTaxa(double novaTaxa) {
        if(novaTaxa > 0){
           taxaSaque = novaTaxa;
        }
    }

    @Override
    public boolean sacar(double valor) {
        if(getSaldo() >= valor + taxaSaque){
            
            return super.sacar(valor + taxaSaque );

        }
        return false;
    }
    @Override
    public String toString() {
       
        return "cp: " +  super.toString() + " taxa: " + taxaSaque;
    }
}
