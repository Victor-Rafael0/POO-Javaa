public class Aviao extends Veiculo{
    private String modeloDoAviao;
    private int capacidadeDePassageiros;
    private String tipoDeTurbina;

    public String getModeloDoAviao() {
        return modeloDoAviao;
    };

    public int getCapacidadeDePassageiros() {
        return capacidadeDePassageiros;
    };

    public String getTipoDeTurbina() {
        return tipoDeTurbina;
    };

    public String setModeloDoAviao(String modeloDoAviao) {
        return this.modeloDoAviao = modeloDoAviao;
    };

    public String setTipoDeTurbina(String tipoDeTurbina) {
        return this.tipoDeTurbina = tipoDeTurbina;
    };

    public int setCapacidadeDePassageiros(int capacidadeDePassageiros) {
        return this.capacidadeDePassageiros = capacidadeDePassageiros;
    };

    @Override
    public String toString() {
        return this.getMarca() + " " + this.getModelo() + " " + this.getAno() + 
               " - Modelo: " + this.modeloDoAviao + 
               " - Capacidade: " + this.capacidadeDePassageiros + 
               " - Turbina: " + this.tipoDeTurbina;
    }
}
