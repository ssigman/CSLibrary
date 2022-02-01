package cs.csmath.complexnumber;

import cs.csmath.exceptions.ComplexZeroDivisionException;

/**
 * The Complex Number class provides a data type for using complex numbers 
 * within a Java program.
 *  * 
 * @author S. Sigman
 * @version 1.0 (Feb 14, 2017)
 *
 */ 
public class ComplexNumber {

	/** 
	 * The real part of the complex number.
	 */
	private double realPart;
	
	/** 
	 * The imaginary part of the complex number.
	 */
	private double imagPart;
	
	// Constructors
	
	/**
	 * This constructor initializes a complex number with the
	 * specified real and imaginary parts.
	 * 
	 * @param realP The real part of the complex number.
	 * @param imagP The imaginary part of the complex number.
	 */
	public ComplexNumber(double realP, double imagP)
	{
		// TO DO: Initialize realPart to realP and imagPart
		//        to imageP.
	}
	
	/**
     * Constructs the complex number 0.0 + 0.0i.
     */
	public ComplexNumber() {
	    // TO DO: Set the complex number to 0 + 0i.
		// HINT: You can do this by calling the previous
		//       constructor using the this key word in place
		//       of the actual constructor name.
	}

    // Query Methods (getters and setters)
    
	// TO DO: Generate getter and setter methods for the
	//        instance variables realPart and imagPart.
	// HINT:  Use IntelliJ to do this.  See the
	//        Refactor/Encapsulate Fields menu.

	// Arithmetic Methods
	
	/**
     * This method adds the complex number otherCN to the
     * value of the current instance and replaces the value
     * of the instance with the sum.
     *  
     * @param otherCN The complex number to add.
     */
    public void add(ComplexNumber otherCN) {
        // TO DO: Complete this method
    }


    /**
     * This method subtracts the complex number otherCN
     * from the current instance and replaces the value of 
     * the current instance with the difference.
     * 
     * @param otherCN The complex number to subtract.
     */
    public void sub(ComplexNumber otherCN) {
    	this.realPart = this.realPart - otherCN.realPart;
        this.imagPart = this.imagPart - otherCN.imagPart;
    }

    /**
     * This method multiplies the current complex number by 
     * the complex number otherCN and replaces the current
     * complex number with the product.
     * 
     * @param otherCN The complex number to multiply by.
     */
    public void mult(ComplexNumber otherCN) {
        // TO DO: Implement complex number multiplication
    }

    /**
     * This method divides the current complex number by 
     * the complex number otherCN and replaces the current
     * complex number with the quotient.
     * 
     * @param otherCN The divisor to use.
     */
    public void div(ComplexNumber otherCN) {
    	// Implement this method next week.
    }

    
    /**
     * This method returns the conjugate of an instance of a
     * complex number.
     * 
     * @return The conjugate of this instance.
     */
    public ComplexNumber conj() {
    	//TO DO: Implement the conjugate operation.
        return null;
    }
    
    /**
     * This method returns the absolute value of the this 
     * complex number.  The value returned is:
     * square_root(realPart^2 + imagPart^2)
     * 
     * @return The absolute value of this complex number.
     */
    public double abs() {
    	// TO DO: Implement the absolute value operation.
        return 0.0;
    }
    
    /** 
	 * This method returns the complex number as a
	 * string formatted as:
	 *    realPart +/- imagPart i
	 * where the appropriate sign is placed before the imagPart
	 * of the number.  No space is placed before the i.
	 * 
     * @return A string representation of the complex number is returned.
     */
    public String toString() {
    	String sign = "+";
    	if (this.imagPart<0)
    		sign = "-";
    	return "" + this.realPart + sign + Math.abs(this.imagPart) + "i";
    }
}