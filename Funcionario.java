
public class Funcionario extends Entregador {
    
    //sobrescrita da interface Fretavel
    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        return 5.0; // fixo
    }
}
