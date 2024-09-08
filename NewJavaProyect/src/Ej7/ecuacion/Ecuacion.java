package Ej7.ecuacion;

public class Ecuacion {
    private int a;
    private int b;
    private int c;
    private double x1;
    private double x2;
    private int y;
    private double discriminante;

    public Ecuacion(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
        discriminante = (Math.pow(b, 2) - (4 * a * c));
        double v = (-b) + Math.sqrt(discriminante) / (2 * a);
        if (discriminante == 0){
            x2 = v;
        }
        else{
            x1 = v;
            x2 = ((-b) - Math.sqrt(discriminante) / (2 * a));
        }

    }

    public int calcularY(int x){
        y = a*x + b*x + c;
        return y;
    }
    public void mostrarEc(){
        System.out.println(a + " * x^2 + " + b + "* x + " + c);
    }
    public void mostrarRes(){
        if (discriminante == 0){
            System.out.println("La ecuación tiene una única raíz: ");
            System.out.println("Raíz 2: " + x2);
        }
        else{
            System.out.println("La ecuación tiene dos raíces: ");
            System.out.println("Raíz 1: " + x1);
            System.out.println("Raíz 2: " + x2);
        }
        if (y != 0){
            System.out.println("La derivada Y tiene como resultado: " + y);
        }
    }
}
