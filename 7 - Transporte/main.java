public class main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        
        // Transporte[] transportes = {new Bicicleta(20), new Carro(120), new Aviao(800)};

        // for (Transporte transporte : transportes) {
        //     transporte.mover();
        // }
        Bicicleta bicicleta = new Bicicleta(20);
        Carro carro = new Carro(140);
        Transporte aviao = new Aviao(550); // Polimorfismo

        bicicleta.mover();
        carro.mover();
        aviao.mover();
    
    }
}