package pe.edu.cibertec.ef_soap_periche.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class PlatoWsdlConfig {

    @Bean(name = "platos")
    public DefaultWsdl11Definition platoWsdl11Definition(XsdSchema platoEsquema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PlatosPort");
        wsdl11Definition.setLocationUri("/ws/platos");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(platoEsquema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema platoEsquema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/plato.xsd"));
    }

}
