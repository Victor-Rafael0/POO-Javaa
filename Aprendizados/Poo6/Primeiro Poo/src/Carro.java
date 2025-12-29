public class Carro extends Veiculo{

    private boolean temAirbag;
    private boolean temABS;
    private boolean eEsportivo;
    private boolean eHatchback;
    private int numeroDePortas;

    public boolean getEesportivo() {
        return eEsportivo;
    };

    public int getNumeroDePortas() {

        return numeroDePortas;
    };

    public boolean getTemABS() {

        return temABS;
    };

    public boolean getTemAirbag() {
        return temAirbag;
    };

    public boolean setEesportivo(boolean eEsportivo) {
        return this.eEsportivo = eEsportivo;
    };

    public int setNumeroDePortas(int numeroDePortas) {

        return this.numeroDePortas = numeroDePortas;
    };

    public boolean setTemABS(boolean temABS) {

        return this.temABS = temABS;
    };

    public boolean setTemAirbag(boolean temAirbag) {

        return this.temAirbag = temAirbag;
    };



    public boolean iseEsportivo() {
        return eEsportivo;
    }

    public boolean isTemABS() {
        return temABS;
    }

    public boolean iseHatchback() {
        return eHatchback;
    }

    public boolean isTemAirbag() {
        return temAirbag;
    }

    @Override
    public String toString() {
        return this.getMarca() + " " + this.getModelo() + " " + this.getAno() + 
               " - Portas: " + this.getNumeroDePortas() + 
               " - Esportivo: " + this.getEesportivo() + 
               " - ABS: " + this.getTemABS() + 
               " - Airbag: " + this.getTemAirbag();
    }
}
