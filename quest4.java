//POO RESOLUÇÕES DE PROGRAMAÇÃO ORIENTADA A OBJETO (JAVA)
import java.util.Locale;

public class Animal {
    String nome;
    int idade;
    String especie;
    String som;

    public Animal(String nome, int idade, String especie, String som){
        this.especie=especie;
        this.nome=nome;
        this.idade=idade;
        this.som=som;
    }

    public void emitirSom() {
        System.out.println("O "+ especie + "emitiu o seguinte som: "+ som.toUpperCase(Locale.ROOT));
    }
}

public class Main {
    public static void main(String[] args) {
       Animal ani1 = new Animal("doguinho", 2,"Cachorro", "auauau");
       ani1.emitirSom();
       Animal ani2 = new Animal("wolf", 3,"lobo", "AUUUUUUUUUUUUUUUU");
       ani2.emitirSom();
    }
}
