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
        double sqrt = Math.abs(x);
        return sqrt;
    }
}
