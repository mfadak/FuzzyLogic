package fuzzy;

import java.net.URISyntaxException;
import java.util.Scanner;

import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Dirty Rate (0-100):");
        double dirtyRate = in.nextDouble();
        System.out.print("Laundry Type (0-100):");
        double laundryType = in.nextDouble();
        try {
	        WashingMachine washingMachine = new WashingMachine(dirtyRate, laundryType);
	        System.out.println(washingMachine);
	        JFuzzyChart.get().chart(washingMachine.getModel());
        }
        catch (URISyntaxException ex) {
        	System.out.println(ex.getMessage());
		}
	}

}
