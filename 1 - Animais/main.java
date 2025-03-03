import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // List<Animal> list = new ArrayList<Animal>();

        // Cachorro cachorro = new Cachorro("Rex", 3);
        // Gato gato = new Gato("Lua", 12);
        // Passaro passaro = new Passaro("Pidgey", 1);

        // list.add(cachorro);
        // list.add(gato);
        // list.add(passaro);


        Animal[] animais = {new Cachorro("Rex", 3), new Gato("Lua", 12), new Passaro("Pidgey", 1)};

        // System.out.println();

        for (Animal animal : animais) {
            System.out.print(animal.nome + ": ");
            System.out.print(animal.idade + ": ");
            animal.emitirSom();
        }

        // System.out.println(cachorro.emitirSom());
        // System.out.println(gato.emitirSom());
        // System.out.println(passaro.emitirSom());
    }
}