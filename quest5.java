//POO RESOLUÇÕES DE PROGRAMAÇÃO ORIENTADA A OBJETO (JAVA)
/*Crie uma classe Retangulo que contenha os atributos base e altura.
Adicione um método calcularArea, que deve retornar a área do retângulo. Em seguida, crie um objeto dessa classe e teste o método calcularArea.*/

public class Retangulo {
    double base;
    double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura= altura;
    }

    public void calcularArea(){
        double area;
        area= base*altura;
        System.out.println("A area desse retangulo corresponde a: "+ area);
    }
}


public class Main{
    public static void main(String[] args) {
        Retangulo r1= new Retangulo(2,4);
        r1.calcularArea();

        Retangulo r2 = new Retangulo(8,3);
        r2.calcularArea();

        Retangulo r3 = new Retangulo(9,13);
        r3.calcularArea();
    }
        }
