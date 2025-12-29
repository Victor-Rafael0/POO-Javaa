//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Loja loja1 = new Loja("São Paulo", "Americanas", "12.345.678/0001-90","rato@gmail.com", "Rato", 123456789);
        Loja loja2 = new Loja("Rio de Janeiro", "Magazine Luiza", "98.765.432/0001-12","Magazineluiza@gmail.com", "Luiza", 987654321);


        System.out.println("Informacoes da Loja " + loja1 + "\n"+
                           "Informacoes da Loja " + loja2);

    }
}
