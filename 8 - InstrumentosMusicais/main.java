public class main {
    public static void main(String[] args) {
        // System.out.println("Olá");

        InstrumentosMusicais[] instrumentos = {new Violao(), new Bateria(), new Piano()};

        for (InstrumentosMusicais instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}