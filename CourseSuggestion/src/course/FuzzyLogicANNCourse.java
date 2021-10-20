package course;

import java.io.File;
import java.net.URISyntaxException;

import net.sourceforge.jFuzzyLogic.FIS;

public class FuzzyLogicANNCourse {
	private FIS fis;
	private double discreteMath;
	private double conceptOfProgLang;
	private double artificialIntel;
	
	public FuzzyLogicANNCourse(double discreteMath,double conceptOfProgLang,double artificialIntel) throws URISyntaxException {
		this.discreteMath = discreteMath;
		this.conceptOfProgLang = conceptOfProgLang;
		this.artificialIntel = artificialIntel;
		
		File file = new File(getClass().getResource("Model.fcl").toURI());
		fis = FIS.load(file.getPath(),true);
        fis.setVariable("discreteMath", discreteMath);
        fis.setVariable("conceptOfProgLang", conceptOfProgLang);
        fis.setVariable("artificialIntel", artificialIntel);
        fis.evaluate(); 
	}
	public FIS getModel() {
		return fis;
	}
	@Override
	public String toString() {
		String output = "\n\nModel Evaluation:\nDiscrete Math: "+discreteMath+
						"\nConcept Of Programming Languages: "+conceptOfProgLang+
						"\nArtificial Intelligence: "+artificialIntel+
						"\nFuzzy Logic & ANN Course Grade Prediction: "+String.format("%.1f", fis.getVariable("FuzzyLogicANN").getValue());
		return output;						
	}
}
