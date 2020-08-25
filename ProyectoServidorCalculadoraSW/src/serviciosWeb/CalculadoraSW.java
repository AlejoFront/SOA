package serviciosWeb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import servicios.ServicioCalculadora;

@WebService(serviceName = "ServicioCalculadoraSW")
public class CalculadoraSW {
    public CalculadoraSW() {
        super();
    }

    @WebMethod
    public double suma(@WebParam(name = "arg0") double x, @WebParam(name = "arg1") double y){
        return ServicioCalculadora.sumar(x, y);
    }

    @WebMethod
    public double resta(@WebParam(name = "arg0") double x, @WebParam(name = "arg1") double y){
        return ServicioCalculadora.restar(x, y);
    }

    @WebMethod
    public double multiplicacion(@WebParam(name = "arg0") double x, @WebParam(name = "arg1") double y){
        return ServicioCalculadora.multiplicar(x, y);
    }

    @WebMethod
    public double division(@WebParam(name = "arg0") double x, @WebParam(name = "arg1") double y){
        return ServicioCalculadora.dividir(x, y);
    }
    
    @WebMethod
    public double raiz(@WebParam(name = "arg0") double x){
        return ServicioCalculadora.raiz(x);
    }
    
    @WebMethod
    public double seno(@WebParam(name = "arg0") double x){
        return ServicioCalculadora.seno(x);
    }
    
    @WebMethod
    public double coseno(@WebParam(name = "arg0") double x){
        return ServicioCalculadora.coseno(x);
    }
    
    @WebMethod
    public double tangente(@WebParam(name = "arg0") double x){
        return ServicioCalculadora.tangente(x);
    }
    
    @WebMethod
    public double elevarNumero(@WebParam(name = "arg0") double x, @WebParam(name = "arg1") int y){
        return ServicioCalculadora.potencia(x,y);
    }
    
}
