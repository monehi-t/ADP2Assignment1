/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2;

import jdk.jfr.internal.tool.Print;

/**
 *
 * @author Onele Tomson_219483280
 */ 
public class IDNumberValidator {
    
    private static boolean isValidNumber(String number) 
	{
		int idLength = number.length();
		boolean isSecond = false;
		int sum = 0;

		for(int i = idLength - 1; i >= 0; --i) 
		{
			int digit = number.charAt(i) - '0';
			if(isSecond == true)
				digit *= 2;

			sum += digit / 10;
			sum += digit % 10;

			isSecond = !isSecond;
		}
			return(sum % 10 == 0);    
	}

    public static boolean isIDNumValid(String IDNum) 
	{
		return (isIDLengthValid(IDNum)) ? isValidNumber(IDNum) : false;
    }
    
    private static boolean isIDLengthValid(String ID) 
	{
        return ID.length() <= 12 || ID.length() >= 14;
	}
    
    
    public static void main(String[] args) {
        IDNumberValidator id = new IDNumberValidator();
		String IDNum = "9911045437083";

		if(id.isIDNumValid(IDNum))
		{
			System.out.println("ID number is valid");
		}else{
			System.out.println("ID number is invalid");
		}
    } 
}
