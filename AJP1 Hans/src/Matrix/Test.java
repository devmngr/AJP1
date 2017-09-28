package Matrix;

import Cryptography.Cryptography;

public class Test {

	public static void main(String[] args) {
		

		int A[][] = {
					{-3, -3, -4},
					{0, 1, 1},
					{4, 3, 4}
					};
		
		int B[][] = {	{8, 16, 5},
						{5, 27, 27},
						{12, 13, 27}
					};
		int[][] C = {{ 3, 5},
					{ 1, 2}
               };
		int[][] inverseC = {{  2, -5},
                { -1,  3}
               };
		int[][] I = {{  1, 0},
                { 0,  1}
               };
		
		System.out.println();
		//System.out.println(Cryptography.arrayToString(Cryptography.matrixToArray(inverseC)));
		//System.out.println( MatrixIntOp.asString(MatrixIntOp.multiply(C, I)));

/*		String alphabet = "abcdefghijklmnopqrstuvwxyz ";	
	  	String message = "Ma ma".toLowerCase();
	  	
	  	
	  		//ok
	  		
	  		int [] finalMSG = new int[message.length()];
	  	
	  	for(int j = 0; j < message.length(); j++)
			  for (int k = 0; k<alphabet.length(); k++)
				  	if(message.charAt(j) == alphabet.charAt(k))
				  	{				  		
				  			finalMSG[j] = k+1;
				  						  
				  	}	  

	  	for(int q = 0; q<message.length(); q++)
	  		System.out.println(finalMSG[q]);
	  		*/
		
		//System.out.println(Cryptography.arrayToString(Cryptography.stringToArray("Help ME")));
		//System.out.println(MatrixIntOp.asString(B));
		
	}

	

}