public class Carro extends Veiculo {
    
    //Construtor
    public Carro(String placa, int ano) {
        super(placa, ano);
    }

    //sobrescreve da interface Fretavel
    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        return distanciaEmKm * 1.25;
    }
}
