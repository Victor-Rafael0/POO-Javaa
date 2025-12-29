public class Moto extends Veiculo{
    private String tipoDeGuidon;
    private boolean temBagageiro;

    public String getTipoDeGuidon() {
        return tipoDeGuidon;
    };

    public boolean isTemBagageiro() {
        return temBagageiro;
    };

    public String setTipoDeGuidon(String tipoDeGuidon) {
        return this.tipoDeGuidon = tipoDeGuidon;
    };

    public boolean setTemBagageiro(boolean temBagageiro) {
        return this.temBagageiro = temBagageiro;
    };

    @Override
    public String toString() {
        return this.getMarca() + " " + this.getModelo() + " " + this.getAno() + " " + this.getTipoDeGuidon() + " " + this.isTemBagageiro();
    }
}
