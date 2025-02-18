//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.soap.client.generated;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap.client.generated package. 
 * <p>An ObjectFactory allows you to programmatically 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetScoreRequest }
     * 
     * @return
     *     the new instance of {@link GetScoreRequest }
     */
    public GetScoreRequest createGetScoreRequest() {
        return new GetScoreRequest();
    }

    /**
     * Create an instance of {@link GetScoreResponse }
     * 
     * @return
     *     the new instance of {@link GetScoreResponse }
     */
    public GetScoreResponse createGetScoreResponse() {
        return new GetScoreResponse();
    }

    /**
     * Create an instance of {@link Score }
     * 
     * @return
     *     the new instance of {@link Score }
     */
    public Score createScore() {
        return new Score();
    }

    /**
     * Create an instance of {@link CreateProductRequest }
     * 
     * @return
     *     the new instance of {@link CreateProductRequest }
     */
    public CreateProductRequest createCreateProductRequest() {
        return new CreateProductRequest();
    }

    /**
     * Create an instance of {@link CreateProductResponse }
     * 
     * @return
     *     the new instance of {@link CreateProductResponse }
     */
    public CreateProductResponse createCreateProductResponse() {
        return new CreateProductResponse();
    }

    /**
     * Create an instance of {@link ServiceStatus }
     * 
     * @return
     *     the new instance of {@link ServiceStatus }
     */
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

}
