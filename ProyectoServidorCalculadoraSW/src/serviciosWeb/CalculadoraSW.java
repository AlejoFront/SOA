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
    public double sumar(@WebParam(name = "arg0") double x, @WebParam(name = "arg1") double y){
        return ServicioCalculadora.sumar(x, y);
    }
}
