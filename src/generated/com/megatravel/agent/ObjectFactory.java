
package com.megatravel.agent;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.megatravel.agent package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.megatravel.agent
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UnitTypeDTO }
     * 
     */
    public UnitTypeDTO createUnitTypeDTO() {
        return new UnitTypeDTO();
    }

    /**
     * Create an instance of {@link ExtraServiceDTO }
     * 
     */
    public ExtraServiceDTO createExtraServiceDTO() {
        return new ExtraServiceDTO();
    }

    /**
     * Create an instance of {@link AccommodationDTO }
     * 
     */
    public AccommodationDTO createAccommodationDTO() {
        return new AccommodationDTO();
    }

    /**
     * Create an instance of {@link AccommodationTypeDTO }
     * 
     */
    public AccommodationTypeDTO createAccommodationTypeDTO() {
        return new AccommodationTypeDTO();
    }

    /**
     * Create an instance of {@link AccommodationUnitDTO }
     * 
     */
    public AccommodationUnitDTO createAccommodationUnitDTO() {
        return new AccommodationUnitDTO();
    }

    /**
     * Create an instance of {@link ImageDTO }
     * 
     */
    public ImageDTO createImageDTO() {
        return new ImageDTO();
    }

    /**
     * Create an instance of {@link PricingDTO }
     * 
     */
    public PricingDTO createPricingDTO() {
        return new PricingDTO();
    }

    /**
     * Create an instance of {@link SyncDataDTO }
     * 
     */
    public SyncDataDTO createSyncDataDTO() {
        return new SyncDataDTO();
    }

}
