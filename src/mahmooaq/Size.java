/*
        [Size.java]
        Author: [Aqsa Mahmood]
        Date: [13-02-2020]

        Description
        [This enumeration creates an Enum type for a Size.
        It contains beside the constants, 
        and names in long notation and the relative cost ]
 */
package mahmooaq;

/**
 *
 * @author aksal
 */
public enum Size {
    //Initiate Enum constants using the private constructor
    XS("Extra Small", 0.80),
    S("Small", 0.90),
    M("Medium", 1.00),
    L("Large", 1.10),
    XL("Extra Large", 1.20);

    // data members for this Enum
    private String sizeName;
    private double cost;

    /**
     * The constructor for the enum should be private
     *
     * @param sizeName return the Size constants
     * @param cost return the relative cost of double type
     */
    private Size(String sizeName, double cost) {

        this.sizeName = sizeName;
        this.cost = cost;
    }

    /**
     * constructor for getter method to get the size name
     *
     * @return the size name in long notation(full size name)
     */
    public String getSizeName() {
        return sizeName;
    }

    /**
     * constructor for getter method to get the relative cost
     *
     * @return the relative cost of the size.
     */
    public double getCostCoefficient() {
        return cost;
    }

}
