import java.util.ArrayList;
import java.util.List;

public class ServicoDeEntrega {
    private List<Fretavel> itens = new ArrayList<>();
    private double distancia;

    //construtor
    public ServicoDeEntrega(double distancia) {
        this.distancia = distancia;
    }

    public void adicionarItem(Fretavel item) {
        itens.add(item);
    }

    public double calcularCustoTotal() {
        double total = 0;
        for (Fretavel f : itens) {
            total += f.calcularCustoFrete(distancia);
        }
        return total;
    }
}
