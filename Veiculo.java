//Classe veiculo que implementa fretavel
public abstract class Veiculo implements Fretavel {
    String placa;
    int ano;

    //construtor
    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    //get e set
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
