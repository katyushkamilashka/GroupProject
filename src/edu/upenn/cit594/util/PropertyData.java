package edu.upenn.cit594.util;

public class PropertyData {
    public double marketValue;
    public double totalLivableArea;
    public int zipCode;
    
    /**
    * 3 arg constructor
    * @param market value as double
    * @param liveable area as double
    * @param zipcode as int
    */
    public PropertyData(double mValue, double area, int zip) {
        marketValue = mValue;
        totalLivableArea = area;
        zipCode = zip;
    }
    
     /**
    * 3 arg constructor
    * @param market value as String
    * @param liveable area as String
    * @param zipcode as String
    */
    public PropertyData(String mValue, String area, String zip) {
       
    }
    
}
