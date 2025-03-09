import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nome;
    final List<Compra> compras = new ArrayList<>();       // um cliente tem muitas compras

    void adicionarCompra(Compra compra) {
        compras.add(compra);
    }

    Cliente(String nome) {
        this.nome = nome;
    }


    double obterValorTotal(){
        double total = 0;

        for(Compra compra: compras){
            total += compra.obterValorTotal();
        }

        return total;
    }
}
