import static java.lang.String.format;

public class Caminhao extends Veiculo{
    String cacamba;
    String tipoDeCarga;

    public String getCacamba() {
        return cacamba;
    };
    public String getTipoDeCarga() {
        return tipoDeCarga;
    };

    public String setCacamba(String cacamba) {
        return this.cacamba = cacamba;
    };

    public String setTipoDeCarga(String tipoDeCarga){
        return this.tipoDeCarga = tipoDeCarga;
    }

    @Override
    public  String  toString() {
        return format("%s %s %d %s %s", this.getMarca(), this.getModelo(), this.getAno(), this.getCacamba(), this.getTipoDeCarga());

    }

}
