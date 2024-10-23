package pe.edu.cibertec.ef_soap_periche.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class MesaWsdlConfig {

    @Bean(name = "mesas")
    public DefaultWsdl11Definition mesaWsdl11Definition(XsdSchema mesaEsquema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("MesasPort");
        wsdl11Definition.setLocationUri("/ws/mesas");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(mesaEsquema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema mesaEsquema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/mesa.xsd"));
    }
}

