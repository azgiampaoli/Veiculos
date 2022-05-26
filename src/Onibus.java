public class Onibus extends Veiculos    {

    private int assentos;


    public Onibus(int assentos) {
        this.assentos = assentos;
    }

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public void exibirOnibus(){
        System.out.println("Onibus com " + getAssentos() + " de placa número " + getPlaca() + " e ano " + getAno());
    }
}
