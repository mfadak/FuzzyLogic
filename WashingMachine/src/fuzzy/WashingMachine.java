package fuzzy;

import java.io.File;
import java.net.URISyntaxException;
import net.sourceforge.jFuzzyLogic.FIS;

public class WashingMachine {
	private final FIS fis;
    private final double dirtyRate;
    private final double laundryType;
    
    public WashingMachine(double dirtyRate,double laundryType)throws URISyntaxException{
    	this.dirtyRate = dirtyRate;
        this.laundryType=laundryType;
        
        File file = new File(getClass().getResource("WashingMachine.fcl").toURI());
        fis = FIS.load(file.getPath(),true);
        fis.setVariable("dirtyRate", dirtyRate);
        fis.setVariable("laundryType", laundryType);
        fis.evaluate();
    }
    public FIS getModel() {
    	return fis;
    }
    @Override
    public String toString() {
        String output = "Washing Time :"+Math.round(fis.getVariable("washingTime").getValue())+" minutes";
        return output;
    } 

}
