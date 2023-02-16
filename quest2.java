# POO RESOLUÇÕES DE PROGRAMAÇÃO ORIENTADA A OBJETO (JAVA)
  public class ContaBancaria {
    int numeroConta;
    double saldo;
    String nomeTitular;

    public ContaBancaria(int numeroConta, double saldo, String nomeTitular){
        this.numeroConta= numeroConta;
        this.saldo= saldo;
        this.nomeTitular= nomeTitular;


    }
    void sacar (double valor){
        if (this.saldo<valor){
            System.out.println("Saldo insuficente boy!");

        } else if (this.saldo>valor) {
           saldo= saldo - valor;

        }

    }

    public void depositar(double valor){
        this.saldo= this.saldo + valor;

    }

    public double getSaldo(){
        return this.saldo;
    }
}




public class Main {
    public static void main (String[]args){
        ContaBancaria cliente1= new ContaBancaria(202201,15.000, "Gabriele");
        cliente1.depositar(3000.00);
        System.out.println("O titular dessa conta corresponde a:" + cliente1.nomeTitular +" O novo saldo consiste em: "+ cliente1.saldo);
        cliente1.sacar(800.00);
        System.out.println("O saldo atualizado de: "+ cliente1.nomeTitular +" Consiste em: "+ cliente1.saldo);

        ContaBancaria cliente2= new ContaBancaria(202202,0, "Iury");
        cliente2.depositar(14);
        System.out.println("O titular dessa conta corresponde a: "+ cliente2.nomeTitular +" O novo saldo consiste em: "+ cliente2.saldo);
        cliente2.sacar(15);
        System.out.println("O saldo atualizado de: "+ cliente2.nomeTitular +" Consiste em: "+ cliente2.saldo);

        ContaBancaria cliente3= new ContaBancaria(202203,0, "Fabio");
        cliente3.depositar(0);
        System.out.println("O titular dessa conta corresponde a: "+ cliente3.nomeTitular +" O novo saldo consiste em: "+ cliente3.saldo);
        cliente3.sacar(10);
        System.out.println("O saldo atualizado de: "+ cliente3.nomeTitular +" Consiste em: "+ cliente3.saldo);
    }
}
