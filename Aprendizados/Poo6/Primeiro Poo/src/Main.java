//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Veiculo carro1 = new Veiculo();
        carro1.setMarca("Toyota");
        carro1.setModelo("Corolla");
        carro1.setAno(2020);

        Veiculo carro2 = new Veiculo();
        carro2.setMarca("Bmw");
        carro2.setModelo("M8 Competition");
        carro2.setAno(2025);

        Caminhao caminhao1 = new Caminhao();
        caminhao1.setMarca("Volvo");
        caminhao1.setModelo("FH16");
        caminhao1.setAno(2019);
        caminhao1.setCacamba("Grande");
        caminhao1.setTipoDeCarga("Ferro");

        Caminhao caminhao2 = new Caminhao();
        caminhao2.setMarca("Scania");
        caminhao2.setModelo("R500");
        caminhao2.setAno(2024);
        caminhao2.setCacamba("Media");
        caminhao2.setTipoDeCarga("Ferro");

        Aviao aviao1 = new Aviao();
        aviao1.setMarca("Airbus");
        aviao1.setModelo("A320");
        aviao1.setAno(2018);
        aviao1.setModeloDoAviao("A320");
        aviao1.setCapacidadeDePassageiros(180);
        aviao1.setTipoDeTurbina("Turbina Nacional");

        Aviao aviao2 = new Aviao();
        aviao2.setMarca("Boeing");
        aviao2.setModelo("737");
        aviao2.setAno(2021);
        aviao2.setModeloDoAviao("737 Max");
        aviao2.setCapacidadeDePassageiros(200);
        aviao2.setTipoDeTurbina("Turbina Internacional");

        Moto moto1 = new Moto();
        moto1.setMarca("Honda");
        moto1.setModelo("XRE300");
        moto1.setAno(2023);
        moto1.setTipoDeGuidon("Guidon Reto");
        moto1.setTemBagageiro(true);

        Moto moto2 = new Moto();
        moto2.setMarca("Yamaha");
        moto2.setModelo("R15");
        moto2.setAno(2024);
        moto2.setTipoDeGuidon(" Guidon Esportivo");
        moto2.setTemBagageiro(false);

        Carro carro3 = new Carro();
        carro3.setMarca("Ferrari");
        carro3.setModelo("F8 Tributo");
        carro3.setAno(2022);
        carro3.setEesportivo(true);
        carro3.setNumeroDePortas(2);
        carro3.setTemABS(true);
        carro3.setTemAirbag(true);

        Carro carro4 = new Carro();
        carro4.setMarca("Volkswagen");
        carro4.setModelo("Golf Gti");
        carro4.setAno(2020);
        carro4.setEesportivo(false);
        carro4.setNumeroDePortas(4);
        carro4.setTemABS(false);
        carro4.setTemAirbag(true);

        System.out.println("----- Veículos ----- ");
        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(caminhao1);
        System.out.println(caminhao2);
        System.out.println(aviao1);
        System.out.println(aviao2);
        System.out.println(moto1);
        System.out.println(moto2);
        System.out.println(carro3);
        System.out.println(carro4);




    }
}