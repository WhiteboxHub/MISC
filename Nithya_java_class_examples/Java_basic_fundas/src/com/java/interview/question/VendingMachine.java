package com.java.interview.question;


import java.util.Scanner;
/*

Design vending machine in Java
which vends Item based upon four denomination of coins and return coin if there is no Item.
		 */

public class VendingMachine {
	
	
	static String[] itemAvailabe = {"Cofee","Tea","GreenTea"};
	static int[] coinsAcceptable = {1,3,5,7};
	static String itemEntered ; 
	static int coinEntered;

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the item Needed:"); 
		itemEntered = s.nextLine();
		System.out.println("put the coin please"); 
		coinEntered = s.nextInt();

		boolean itemAva = false, coinAva = false ; 

		for(int i=0;i<itemAvailabe.length;i++){
			if(itemEntered.equalsIgnoreCase(itemAvailabe[i])){
				itemAva  = true;
			}
		}
		for(int j = 0; j <coinsAcceptable.length;j++){
			if(coinEntered ==coinsAcceptable[j]){
				coinAva = true;
			}
		}

		String completed = vendingProcess(itemAva , coinAva);
		System.out.println(completed);

	}

	public static String vendingProcess(boolean itemAva, boolean coinAva){
		String outPut = "";
		if(itemAva && coinAva){

			outPut = "Here is your " + itemEntered + " !!! Enjoy ";
			return outPut ;
		}
		else if(itemAva==true && coinAva==false){
			outPut = "Sorry denomination not  accepeted  please take your paise " + coinEntered + "  !! denominationd accepeted are 1,3,5,7" ;
			return outPut ;
		}
		else if(itemAva==false && coinAva==true){
			outPut = "Sorry Item not available";
			return outPut ;
		}

		return outPut ;

	}

}
