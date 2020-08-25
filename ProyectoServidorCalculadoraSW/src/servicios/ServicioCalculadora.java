package servicios;

public class ServicioCalculadora {
    public ServicioCalculadora() {
        super();
    }
    
    public static double sumar(double x, double y){
        return x+y;
    }
    
    public static double restar(double x, double y){
        return x-y;
    }
    
    public static double multiplicar(double x, double y){
        return x*y;
    }
    
    public static double dividir(double x, double y){
        return x/y;
    }
    
    public static double raiz(double x){
        return Math.abs(x);
    }
    
    public static double seno(double x){
        return Math.sin(x);
    }
    
    public static double coseno(double x){
        return Math.cos(x);
    }
    
    public static double tangente(double x){
        return Math.tan(x);
    }
    
    public static double potencia(double x , int y){
        return  Math.pow(x, y);
    }
    
}
