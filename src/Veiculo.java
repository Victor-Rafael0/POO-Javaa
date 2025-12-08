public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;



    // Getters and Setters
    public String getMarca() {
        return marca;
    };


    public String getModelo() {
        return modelo;
    };

    public int getAno() {
        return ano;
    };

    public String setMarca(String marca) {
        return this.marca = marca;
    };

    public String  setModelo(String modelo) {
        return this.modelo = modelo;
    };

    public int setAno(int ano) {
        return this.ano = ano;
    };

    @Override
    public String toString() {
        return this.marca + " " + this.modelo + " " + this.ano;
    }

}


