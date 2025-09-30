public class Motocicleta extends Veiculo {
    
    //construtor 
    public Motocicleta(String placa, int ano) {
        super(placa, ano);
    }

    //sobrescrita da interface fretavel
    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        return distanciaEmKm * 0.45;
    }
}
