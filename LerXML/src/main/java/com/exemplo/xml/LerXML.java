package com.exemplo.xml;
import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.SAXException;
import com.exemplo.xml.schema.Livraria;

public class LerXML {

    public static void main(String[] args) {
        try {
            File xmlFile = new File("C:/Dev/Aprimora/LerXML/src/main/resources/exemplo.xml");

            // Inicializa o contexto JAXB com as classes geradas
            JAXBContext context = JAXBContext.newInstance(Livraria.class.getPackage().getName());
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // Configura a validação do XML usando o XSD
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(new File("C:/Dev/Aprimora/LerXML/src/main/resources/exemplo.xsd")); // Caminho para o seu arquivo XSD
            unmarshaller.setSchema(schema);

            // Faz a leitura e valida o XML
            Livraria livraria = (Livraria) unmarshaller.unmarshal(xmlFile);

            System.out.println("XML validado com sucesso!");

           
            // Exemplo de acesso aos livros
            for (Livraria.Livro livro : livraria.getLivro()) {
            	System.out.println("----------");
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Preço: " + livro.getPreco());
                System.out.println("----------");
            }

        } catch (JAXBException | SAXException e) {
        	//System.out.println(e.toString());
        	System.out.println(e.getCause().getMessage());	
        	// e.printStackTrace();
         
        }
    }
}
