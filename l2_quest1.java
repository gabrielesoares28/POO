# POO RESOLUÇÕES DE PROGRAMAÇÃO ORIENTADA A OBJETO (JAVA)


public class Pessoa {
    String nome;
    int idade;
    String cidade;

    public Pessoa (String nome, int idade, String cidade){
        this.nome=nome;
        this.cidade=cidade;
        this.idade=idade;

    }

    void informacao() {
        System.out.println("\n\nNome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cidade " + this.cidade);
    }

}







public class Main{
        public static void main(String[] args) {
            Pessoa a = new Pessoa ("Gabriele",21, "Campina Grande");
            Pessoa b = new Pessoa("Iury",  24,"Campina Grande");
            a.informacao();
            b.informacao();
        }
}
