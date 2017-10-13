package co.simplon.Recall;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.*;

import javax.sound.midi.Synthesizer;

public class PlayingWithAlgo {
	
	public static String helloWorld(String name) {
		
		//assertEquals("Hello World",PlayingWithAlgo.helloWorld(""));
		//assertEquals("Hello Manu",PlayingWithAlgo.helloWorld("Manu"));
		//assertEquals("Hello Laetitia",PlayingWithAlgo.helloWorld("Laetitia"));
		
		String message;       //message = name == "" ? "Hello World": "Hello "+name;
		if (name == "")
			message = "Hello World";
		else
			message = "Hello " + name;
		return message;
	}

	public static List<String> selectElementsStartingWithA(String array[]) {
		
		ArrayList<String> resultat = new ArrayList<String>();
		
			for(int i = 0; i < array.length; i++) {
				if(array[i].startsWith("a")) {
					resultat.add(array[i]);
				}
		
			}
			return resultat;
		//String arrayIn[] = { "bananas", "apples", "pears", "avocados" };
		//ArrayList<String> resultat = new ArrayList<String>();
		//resultat.add("apples");
		//resultat.add("avocados");
			

		//assertEquals(resultat, PlayingWithAlgo.selectElementsStartingWithA(arrayIn));
		
	}

	public static List<String> selectElementsStartingWithVowel(String array[]) {
		
		ArrayList<String> resultat = new ArrayList<String>();
		
		for(int i = 0; i < array.length; i++) {
			
			
			if(array[i].startsWith("a")|| array[i].startsWith("e")||array[i].startsWith("i")||array[i].startsWith("o")||array[i].startsWith("u")||array[i].startsWith("y")){
				resultat.add(array[i]);
			} 
			else if (array[i] != ""){
				return null;
			}
	
		}
		return resultat;
		
		
		//public void selectElementsStartingWithVowel() {
			//String arrayIn[] = { "john", "david", "omar", "fred", null, "idris", "angela" };
			//ArrayList<String> resultat = new ArrayList<String>();
			//resultat.add("omar");
			//resultat.add("idris");
			//resultat.add("angela");

			//assertEquals(resultat, PlayingWithAlgo.selectElementsStartingWithVowel(arrayIn));
		
		
	}

	public static String[] removeNullElements(String array[]) {
		
		return null;
	}

	public static String[] reverseWordsInMyStringArray(String array[]) {
		return null;
	}

	public static String[] reverseOrderInArray(String array[]) {
		return null;
	}

	public static String[][] everyPossiblePair(String array[]) {
		return null;
	}

	public static List<String> sortByLastLetter(String array[]) {
		return null;
	}

	public static String getFirstHalf(String string) {
		return null;
	}

	public static String exportWordWithoutALetter(String array[], char letter) {
		return null;
	}

	public static int numberOfPalindromeWord(String text) {
		return 0;
	}

	public static int numberOfPalindromeText(String text) {
		return 0;
	}
	
	public static String shortestWord(String text) {
		return null;
	}

	public static String longestWord(String text) {
		return null;
	}

	public static String getAllLetters(String[] array) {
		return null;
	}
	
	public static String removeCapitals(String text) {
		return null;
	}
	
	public static String formatDateNicely(String text) {
		return null;
	}
	
	public static String getDomainName(String email) {
		return null;
	}

	public static String titleize(String title) {
		return null;
	}
	
	public static boolean checkForSpecialCharacters(String string) {
		return false;
	}
	
	public static String[] findAnagrams(String name) {
		return null;
	}

	public static int[] letterPosition(String name) {
		return null;
	}
	
	public static long addingTwoNumbers(long number1, long number2) { // c'est faaaaaiiiiiiiitttt
		
		long reponse = 0;
		
		reponse = number1 + number2; 
			
		return  reponse;
	}
	//assertEquals(30, PlayingWithAlgo.addingTwoNumbers(10, 20));
	
	
	public static long addingThreeNumbers(long number1, long number2, long number3) { // c'est faaaaaiiiiiiiitttt
			long reponse = 0;
		
			reponse = number1 + number2 + number3; 
			
			return  reponse;
		
	}

	public static long addingSeveralNumbers(final long... numbers) {
		return 0;
	}

	public static int[] allElementsExceptFirstThree(int array[]) {
		return null;
	}

	public static int[] addElementToBeginning(int array[], int element) {
		return null;
	}

	public static Float makeNegative(Float number) { // C'EST FAAAAAAAAAAAAAIIIIT!!!!!!!!!!!!!!!!!!!
		float reponse = 0;
		if (number>0) {
			reponse = number *(-1);
		}
		else {
			reponse = number;
		}
		return reponse;
	}
	//assertEquals(new Float(-4.52),PlayingWithAlgo.makeNegative(new Float(4.52)));
	//assertEquals(new Float(-8),PlayingWithAlgo.makeNegative(new Float(-8)));
	
	
	public static String[] getElementsLowerThanSix(String[] array) {
		return null;
	}
	
	public static int[] sortTabBySelection(int[] array) {
		return null;
	}
	
	public static int[] sortTabByInsertion(int[] array) {
		return null;
	}

	public static int[] sortTabByBubble(int[] array) {
		return null;
	}
	
	public static int findIndexByDichotomy(int elemet, int[] array) {
		return 0;
	}
	
	public static int roundUp(float number) {
		return 0;
	}

	public static int findLastDayOfMonth(int month, int year) {
		return 0;
	}

	public static int factorial(int number) {
		return 0;
	}

	public static int convertToCelsius(int temperature) {
		return 0;
	}
	
	public static boolean checkIfPair(int number) { // c'est faaaaaaaaaaaaaaaaait !!!!!!!!!!!!!!!
		
	
		if(number%2 == 0) {
			 return true;
		}
		else {
			return false;
		}
	}
	
	//public void checkIfPair() {
	//assertEquals(true, PlayingWithAlgo.checkIfPair(10));
	//assertEquals(false, PlayingWithAlgo.checkIfPair(21));
	
	public static boolean checkIfPairPairImpair(int number1, int number2, int number3) { // c'est faaaaaaaaaaaaaaaaait !!!!!!!!!!!!!!!
		
		if(number1 %2 == 0 && number2 %2 == 0 && number3 %2 != 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	//assertEquals(false, PlayingWithAlgo.checkIfPairPairImpair(10, 20, 10));
	//assertEquals(false, PlayingWithAlgo.checkIfPairPairImpair(10, 21, 10));
	//assertEquals(false, PlayingWithAlgo.checkIfPairPairImpair(10, 21, 11));
	//assertEquals(false, PlayingWithAlgo.checkIfPairPairImpair(11, 20, 10));
	//assertEquals(false, PlayingWithAlgo.checkIfPairPairImpair(11, 21, 10));
	//assertEquals(false, PlayingWithAlgo.checkIfPairPairImpair(11, 21, 11));
	//assertEquals(true, PlayingWithAlgo.checkIfPairPairImpair(10, 20, 11));
	
	public static boolean checkIfSumIsPair(int number1, int number2, int number3) { // c'est faaaaaaaaaaaaaaaaait !!!!!!!!!!!!!!!
		
		if ((number1 + number2 + number3)%2 == 0) {
			return true;
		}
		else {
		return false;
		}
	}
	//assertEquals(true, PlayingWithAlgo.checkIfSumIsPair(10, 20, 10));
	//assertEquals(false, PlayingWithAlgo.checkIfSumIsPair(10, 21, 10));
	//assertEquals(true, PlayingWithAlgo.checkIfSumIsPair(10, 21, 11));
	//assertEquals(false, PlayingWithAlgo.checkIfSumIsPair(11, 20, 10));
	//assertEquals(true, PlayingWithAlgo.checkIfSumIsPair(11, 21, 10));
	//assertEquals(false, PlayingWithAlgo.checkIfSumIsPair(11, 21, 11));
	//assertEquals(false, PlayingWithAlgo.checkIfSumIsPair(10, 20, 11));
	
	public static boolean checkIfAllElementsPair(int[] array) { // c'est faaaaaaaaaaaaaaaaaaaait !!!!
		 boolean reponse = true;
		  for (int i = 0; i < array.length; i++) {
			  if ( array[i]%2 == 0) {
				  reponse = true;
			  }
			  else {
				  reponse = false;
				  break;
			  }
		  }
		 
		
			 
		 return reponse;
	}
	
	//int[] arrayIn = {  2, 10,  4,  6,  8 };
	//assertEquals(true, PlayingWithAlgo.checkIfAllElementsPair(arrayIn) );
	//int[] arrayIn1 = {  2, 10, 4,  6,  8, 7 };
	//assertEquals(false, PlayingWithAlgo.checkIfAllElementsPair(arrayIn1) );
	
	
	public static ArrayList<Integer> exportAllElementsPair(int[] array) {
		return null;
	}
	
	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {
		return null;
	}
	
	public static boolean checkIfTriangleRectangle(int number1, int number2, int number3) {
		boolean reponse = true;
		int cote1 = number1*number1;
		int cote2 = number2*number2;
		int cote3 = number3*number3;
		
		
		
		if(cote1 + cote2 == cote3 || cote2+cote3==cote1 || cote1+cote3 == cote2) {
			
			reponse = true;
		} else {
			reponse = false;
		}
		
		
		return reponse;
	}
	
	//assertEquals(true, PlayingWithAlgo.checkIfTriangleRectangle(3, 4, 5));
	//assertEquals(true, PlayingWithAlgo.checkIfTriangleRectangle(5, 4, 3));
	//assertEquals(true, PlayingWithAlgo.checkIfTriangleRectangle(5, 3, 4));
	//assertEquals(false, PlayingWithAlgo.checkIfTriangleRectangle(5, 3, 3));
	
	
	public static boolean checkSiTuPeuxAcheter(int prix) { // c'est faaaaaaaiiiit
		// t'as 22 euros en monnaies de 2 euros, la machine ne rend pas de monnaie, check si tu peux payer
		boolean reponse = true;
		if (prix%2==0 && prix <= 22) {
			reponse = true;
		}
		else {
			reponse = false;
		}
		return reponse;
	}
	//assertEquals(false, PlayingWithAlgo.checkSiTuPeuxAcheter(3));
	//assertEquals(false, PlayingWithAlgo.checkSiTuPeuxAcheter(24));
	//assertEquals(true, PlayingWithAlgo.checkSiTuPeuxAcheter(20));
	//assertEquals(false, PlayingWithAlgo.checkSiTuPeuxAcheter(23));
	
	public static boolean checkCase1(double prix, int pourcentDeRemise) { // c'est faaaaaaaaaaiiitttt
		// t'as 100 euros, verifie si tu peux acheter l'article solde
		boolean reponse;
		
		double prixSolde = prix - (prix*pourcentDeRemise/100);
		
		if(prixSolde<=100) {
			reponse = true;
		}
		else {
			reponse = false;
		}
		
		return reponse;
	}
	
	//assertEquals(true, PlayingWithAlgo.checkCase1(30.0, 44));
	//assertEquals(true, PlayingWithAlgo.checkCase1(120.0, 30));
	//assertEquals(true, PlayingWithAlgo.checkCase1(200, 55));
	//assertEquals(false, PlayingWithAlgo.checkCase1(200, 10));
	
	public static boolean checkCase2(int number1, int number2) { // c'est faaaaaaaaaaaiiiittttttt
		// check si un des 2 chiffres, ou leur somme se divise par 7
		
		boolean reponse;
		if ( number1%7 == 0 || number2%7 == 0 || (number1+number2)%7 == 0) {
			reponse = true;
		}
		else {
			reponse = false;
		}
		
		return reponse;
	}
	
	//assertEquals(true, PlayingWithAlgo.checkCase2(13,14));
	//assertEquals(true, PlayingWithAlgo.checkCase2(14,13));
	//assertEquals(true, PlayingWithAlgo.checkCase2(21, 14));
	//assertEquals(true, PlayingWithAlgo.checkCase2(13, 8));	
	
	public static boolean checkCase2a(int number1, int number2) { //c'est ffaaaiiiiitttttttttttt
		// check si un des 2 chiffres mais pas leur somme se divise par 7

		boolean reponse;
		
		if ( (number1%7 == 0 || number2%7 == 0) && (number1+number2)%7 != 0) {
			
			reponse = true;
		}
		else {
			reponse = false;
		}
		
		return reponse;
		
	}
	
//	assertEquals(true, PlayingWithAlgo.checkCase2a(13,14))
//	assertEquals(true, PlayingWithAlgo.checkCase2a(14,13));
//	assertEquals(false, PlayingWithAlgo.checkCase2a(21, 14));
//	assertEquals(false, PlayingWithAlgo.checkCase2a(13, 8));	
	
	public static boolean checkCase3(int number1, int number2, int number3) {
		// check si les trois chiffres sont dans l'ordre, soit croissant ou decroissant
		boolean reponse;
		
		return reponse;
	}
	
//	assertEquals(true, PlayingWithAlgo.checkCase3(13,14,17));
//	assertEquals(true, PlayingWithAlgo.checkCase3(14,13, 10));
//	assertEquals(false, PlayingWithAlgo.checkCase3(21, 14, 15));
//	assertEquals(false, PlayingWithAlgo.checkCase3(5, 13, 8));	
	
	public static ArrayList<Integer> allElementsExceptFirstAndLast(int array[]) {
	

		return null;
	}
	
	
	public static int[] allElementsExceptFirstAndLastInt(int array[]) {
		return null;
	}
	
	
	public static ArrayList<Integer> allElementsWithIndexPair(int array[]) {
		return null;
	}
	
	public static ArrayList<Integer> reverseOrder(int array[]) {
		return null;
	}
	
	public static int[] reverseOrderInt(int array[]) {
		return null;
	}
	
	public static ArrayList<Integer> insertElementInTheMiddleOfAnArray(int array[], int element ) {
		return null;
	}
	
	public static ArrayList<Integer> exportElementsPair( ArrayList<Integer> list ) {
		
		return null;
	}
	
	public static ArrayList<Integer> exportElementsWithIndexPair( ArrayList<Integer> list ) {
		return null;
	}
	
	public static int Addition( HashMap<String, Integer> addition ) {
		return 0;
	}
	
	public static boolean checkIfStringStartsWithA( String word ) {
		return false;
	}
	
	public static boolean checkIfStringStartsWithVowel( String word ) {
		return false;
	}
	
	public static boolean checkIfStringEndsWithS( String word ) {
		return false;
	}
	
	public static String findShortestWord(String[] array ) {
		
		return null;
	}
	
	public static String swapFirstandLastLetter(String array ) {
		
		return null;
	}
	
	public static int[] swapFirstandLastElement(int[] array ) {
		
		return null;
	}

}