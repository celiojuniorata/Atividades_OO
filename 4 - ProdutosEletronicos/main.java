import java.util.Arrays;
import java.util.Vector;

public class main {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

    
        Vector<ProdutoEletronico> dispositivos = new Vector<>();
        dispositivos.addAll(Arrays.asList(
            new Smartphone("Samsung", "Galaxy S10"),
            new Notebook("Apple", "iPhone 11"),
            new Televisao("Dell", "Inspiron 15")
        ));

        for (ProdutoEletronico dispositivo : dispositivos) {
            // System.out.println("Marca: " + dispositivo.marca + " Modelo: " + dispositivo.modelo);
            dispositivo.ligar();
            // dispositivo.mensagem();
            // System.out.println();
        }                                   
     }
}
