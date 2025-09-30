
public class Autonomo extends Entregador {
    
    //sobrescrita da interface Fretavel
    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        return distanciaEmKm * 0.95;
    }
}
