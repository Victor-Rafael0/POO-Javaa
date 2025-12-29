public class Computador {
    public static int SERIAL = 0;
    
    String PlacaM;
    String PlacaV;
    String Fonte;
    String MemoriaRam;
    String MemoriaRom;
    String Cpu;
    Software Windows;


    public void runOption(String option) {
        if (option.equalsIgnoreCase("Cpu")) {
            Windows.exeCpu();
        } else if (option.equalsIgnoreCase("Ram")) {
            Windows.exeRam();
        } else if (option.equalsIgnoreCase("Fonte")) {
            Windows.ligandoFonte();
        } else if (option.equalsIgnoreCase("PlacaM")) {
            Windows.exePlacaM();
        } else if (option.equalsIgnoreCase("PlacaV")){
            Windows.exePlacaV();
        }else if (option.equalsIgnoreCase("Rom")){
            Windows.exeRom();
        } else {
            System.out.println("Funcionalidade Nao Disponivel ainda");
        }


    }

}


