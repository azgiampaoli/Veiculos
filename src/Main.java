import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

            Onibus onibus = new Onibus(42);
            onibus.setAno(2020);
            onibus.setPlaca("KDF4521");
        onibus.exibirOnibus();

            Caminhao caminhao = new Caminhao(6);
            caminhao.setAno(2022);
            caminhao.setPlaca("DFE4578");

        caminhao.exibirCaminhao();




    }
}
