//POO RESOLUÇÕES DE PROGRAMAÇÃO ORIENTADA A OBJETO (JAVA)
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
