package com.java.basic.fundas;

class TestRoot
{
    public static void main(String[] args)
    {
    	
    	//String S = "-9";
        try
        {
          //  int n = Integer.parseInt(9);
            int n = -9;
            double root = findRoot(n); // Method Calling 
            System.out.println(" Square root of " + n + " is: " + root);
        }
        catch (NumberFormatException e)
        {
            System.out.println(" Please enter a numeric value as input.");
            System.exit(0);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(
            " Please enter some value as input - the correct format is: java TestRoot ");
            System.exit(0); // This is like the retrun Kind of statement , Which will allow you t exit out the the program 
        }
        catch (MyExceptionForNegativeArgument ex) // Customized Exceptions 
        {
            System.out.println("Error occurred in processing your request. Details are: ");
            System.out.println(ex.getMessage());
        }// end of 'try-catch'..
    }
    
    //Method Definition , where you should have your throws Keyword . throws mainly 
    //used to tell that this method will throw the 
    //MyExceptionForNegativeArgument type of exception .
    public static double findRoot (int m) throws MyExceptionForNegativeArgument // Who ist he Calleer of this method , Main Method
    {
        if (m < 0)
            throw new MyExceptionForNegativeArgument(
                    "Attempt to find the square root of a negative number."); // Creates the exception Object of type MyExceptionForNegativeArgument and throw to the caller . 
        else
            return Math.sqrt(m);
    }
}