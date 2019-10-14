import java.io.*;
import java.util.*;
class Pancakes {
	
	
 static String flip(String str){
	
		int FirstIndexOfMinus = str.indexOf('-');
		int FirstIndexOfPlus = str.indexOf('+');
	 if (FirstIndexOfPlus==-1) {
		 return str.replace('-','+');
	 }
	 else if (FirstIndexOfMinus==-1) {
		 return str.replace('+','-');
	 }
	 
	 else if(FirstIndexOfMinus<FirstIndexOfPlus) {
		 String temp = str.substring(0, FirstIndexOfPlus).replace('-','+');
		 String newString = temp+str.substring(FirstIndexOfPlus);
		 return newString;
		 
		}
	 else if(FirstIndexOfPlus<FirstIndexOfMinus) {
		 String temp = str.substring(0, FirstIndexOfMinus).replace('+','-');
		 String newString = temp+str.substring(FirstIndexOfMinus);
		 return newString;
	 }
	 else return str;
 
 }
	
	
	public static void main(String args[]){
		
	Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	int caseAmount = in.nextInt();
	for (int i=0; i<=caseAmount; i++) {
		String a = in.nextLine();
		int countFlips = 0;
		int FirstIndexOfMin = a.indexOf('-'); 
		
				
		if (FirstIndexOfMin!=-1) {
			do {a=flip(a);
			countFlips++;
			} 
			while(a.indexOf('-')!=-1);
		}
			
		if(i>0)System.out.println("Case #"+i+": "+countFlips);
		

	}

}}