import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ForensicReport {

	private Map<String,Date> reportMap=new HashMap<String,Date>();

	public Map<String, Date> getReportMap() {
		return reportMap;
	}

	public void setReportMap(Map<String, Date> reportMap) {
		this.reportMap = reportMap;
	}

    public void addReportDetails(String reportingOfficer, Date reportFiledDate) {
		//Fill the code here
    	reportMap.put(reportingOfficer, reportFiledDate);
		
	}

	public List<String> getOfficersWhoFiledReportsOnDate(Date reportFiledDate){

		List<String> al=new ArrayList<String>();
		//Fill the code here
		
		Set<Entry<String, Date>> entry = reportMap.entrySet();
		Iterator<Entry<String, Date>> itr = entry.iterator();
		while (itr.hasNext()) {
		Entry<String, Date> solution = itr.next();
		Date res = solution.getValue();
		if (res.equals(reportFiledDate)) {
			String neee = solution.getKey();
			al.add(neee);
		}
		}
		return al;
	}
}
