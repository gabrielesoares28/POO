//Crie uma classe Pessoa que contenha os atributos nome, idade e sexo. Em seguida, crie um objeto dessa classe e exiba suas informações na tela.


import java.sql.SQLOutput;

public class Pessoa {
    String nome;
    int idade;
    String sexo;


    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;

    }

    void exibirInformacao(){
        System.out.println("nome: "+ this.nome);
        System.out.println("idade: "+ this.idade);
        System.out.println("sexo: "+ this.sexo);
    }
}


public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa ("Gabriele",21, "feminino");
        Pessoa p2 = new Pessoa("Iury",  24,"Masculino");
        p1.exibirInformacao();
        p2.exibirInformacao();
    }
}
