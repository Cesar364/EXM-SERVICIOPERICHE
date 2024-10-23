package pe.edu.cibertec.ef_soap_periche.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CUSTOM,
        customFaultCode = "{http://www.cibertec.edu.pe/ws}001")
public class NotFoundException extends RuntimeException {

    public NotFoundException(String message){
        super(message);
    }

}
