import java.util.HashMap;
import java.util.Map;
public class Indigo implements AirFare {
    public Double showFare(String sourceCity, String destinationCity) {
		Indigo in= new Indigo();//Creating object for method AirIndia
		Map<String, Double> fares = in.getIndigoFares();//Getting fares map from getAirIndiaFares method
		double price=fares.get(sourceCity+"-"+destinationCity);//get values using destination and source combination as key
		return price;
	}
	//don't change this method
	public Map<String, Double> getIndigoFares() {
		Map<String, Double> fares =  new HashMap<String, Double>();
		fares.put("LONDON-NEWYORK", 20125D);
		fares.put("LONDON-PARIS", 4268D);
		fares.put("LONDON-DUBAI", 21586D);
		fares.put("LONDON-MUMBAI", 32365D);
		fares.put("NEWYORK-PARIS", 19853D);
		fares.put("NEWYORK-DUBAI", 43658D);
		fares.put("NEWYORK-MUMBAI", 45236D);
		fares.put("PARIS-DUBAI", 38965D);
		fares.put("PARIS-MUMBAI", 39812D);
		fares.put("DUBAI-MUMBAI", 4449D);
		fares.put("NEWYORK-LONDON", 20125D);
		fares.put("PARIS-LONDON", 4268D);
		fares.put("DUBAI-LONDON", 21586D);
		fares.put("MUMBAI-LONDON", 32365D);
		fares.put("PARIS-NEWYORK", 19853D);
		fares.put("DUBAI-NEWYORK", 43658D);
		fares.put("MUMBAI-NEWYORK", 45236D);
		fares.put("DUBAI-PARIS", 38965D);
		fares.put("MUMBAI-PARIS", 39812D);
		fares.put("MUMBAI-DUBAI", 4449D);
		return fares;
	}
}
