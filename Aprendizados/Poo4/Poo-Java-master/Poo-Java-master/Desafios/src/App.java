import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        
        Computador PC = new Computador();

        PC.Fonte = "ATX 800w 80 plus";
        PC.Cpu = "Ryzen 5 4600g";
        PC.MemoriaRam = "Memoria Ram Asgard 2x16";
        PC.MemoriaRom = "Nvme Samsung 2T";
        PC.PlacaM = "B450m-HDV 4.0";
        PC.PlacaV = "Vega 7 26 Cache LM3";

        Software CpuZ = new Software();
        PC.Windows = CpuZ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a Opcao Pra Usar o Software");
        String option = scanner.nextLine();
        PC.runOption(option);


    }
}
