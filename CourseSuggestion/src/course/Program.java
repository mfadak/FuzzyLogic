package course;

import java.net.URISyntaxException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
        System.out.print("Discrete Math Grade [0-4)]:");
        double discreteMath = in.nextDouble();
        System.out.print("Concept Of Programming Languages Grade [0-4)]:");
        double conceptOfProgLang = in.nextDouble();
        System.out.print("Artificial Intelligence Grade [0-4)]:");
        double artificialIntel = in.nextDouble();
        try {
	        FuzzyLogicANNCourse fuzzyLogicANNCourse = new FuzzyLogicANNCourse(discreteMath, conceptOfProgLang,artificialIntel);
	        System.out.println(fuzzyLogicANNCourse);
        }
        catch(URISyntaxException ex) {
        	System.out.println(ex.getMessage());
        }
	}

}
