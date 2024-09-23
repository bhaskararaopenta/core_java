import java.util.Map;
import java.util.HashMap;

public class Apartment {

	private Map<String, Double> apartmentDetailsMap = new HashMap<String, Double>();

    public Map<String, Double> getApartmentDetailsMap() {
		return apartmentDetailsMap;
	}

	public void setApartmentDetailsMap(Map<String, Double> apartmentDetailsMap) {
		this.apartmentDetailsMap = apartmentDetailsMap;
	}
	
	public void addApartmentDetails(String apartmentNumber, double rent) {
        apartmentDetailsMap.put(apartmentNumber, rent);
    
	}

	public double findTotalRentOfApartmentsInTheGivenRange(double minimumRent, double maximumRent) {
		double tr=0;
		for(double rent: apartmentDetailsMap.values()) {
			if(rent>=minimumRent && rent<=maximumRent) {
				tr=rent+tr;
			}
		}
		return tr;
	}

}
