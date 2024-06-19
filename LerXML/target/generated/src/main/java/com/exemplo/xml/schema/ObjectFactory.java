//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v2.3.4 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2024.06.19 às 11:25:45 AM BRT 
//


package com.exemplo.xml.schema;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.exemplo.xml.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.exemplo.xml.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Livraria }
     * 
     */
    public Livraria createLivraria() {
        return new Livraria();
    }

    /**
     * Create an instance of {@link Livraria.Livro }
     * 
     */
    public Livraria.Livro createLivrariaLivro() {
        return new Livraria.Livro();
    }

}
