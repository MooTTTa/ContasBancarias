package Repositorios.contasBancarias.contas.modelos;

public class ContaEspecial extends Conta{
    
    private double limite;

    public ContaEspecial (int numero, double limite) {
        super(numero);
        this.limite = limite;
    }
    
    
    @Override
    public boolean sacar(double valor) {
        if(getSaldo() + limite >= valor ){
            
            return super.sacar(valor);

        }
        return false;
    }

    @Override
    public String toString() {
        
        return "ce: " + super.toString() + " limite: " + limite;
    }
}
