//POO RESOLUÇÕES DE PROGRAMAÇÃO ORIENTADA A OBJETO (JAVA)
/*Crie uma classe Carro que contenha os atributos modelo, cor e ano.
Adicione um método ligar, que exiba a mensagem "O carro [modelo] está ligado". Crie um objeto dessa classe e teste o método ligar.*/

public class Carro {
    String modelo;
    int ano;
    String cor;

   public Carro(String modelo, int ano, String cor){
       this.modelo=modelo;
       this.ano=ano;
       this.cor=cor;
   }
   public void ligar(){
       System.out.print("O carro "+ modelo + " esta ligado\n");
   }
}

public class Main {
    public static void main(String[] args) {
        Carro carro1 =new Carro("Corolla", 2021,"azul");
        carro1.ligar();

        Carro carro2 =new Carro("Celta", 2020,"preto");
        carro2.ligar();
    }
}
