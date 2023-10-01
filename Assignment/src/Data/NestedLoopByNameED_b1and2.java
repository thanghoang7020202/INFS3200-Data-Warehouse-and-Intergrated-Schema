package Data;

import java.util.ArrayList;
import java.util.List;

//import Oracle.DBConnection;

public class NestedLoopByNameED_b1and2 {
	
	private static double threshold = 0.75;

	public static void main(String[] args) {
		/* option1: read data from database
		DBConnection.OpenConnection();
		String query = "SELECT * FROM RESTAURANT";
		Restaurant[] restaurants = DBConnection.ExecuteQuery(query);
		DBConnection.CloseConnection();
		*/
		// option2: read data from csv file, switch to this option by commenting the above code and uncommenting next line
		//Restaurant[] restaurants = CSVLoaderRestaurant.restaurantLoader("data\\restaurant.csv");
		Book1[] book1s = CSVLoaderBook1.Book1Loader("data\\book1.csv");
		Book2[] book2s = CSVLoaderBook2.Book2Loader("data\\book2.csv");
		List<String> result = new ArrayList<String>();
		//Restaurant restaurant1 = null, restaurant2 = null;
		Book1 book1 = null;
		Book2 book2 = null;
		int id1 = 0, id2 = 0;
		String name1 = null, name2 = null;
		long start = System.currentTimeMillis();
		for (int i = 0; i < book1s.length; i++) {
			System.out.println("i=" + i);
			book1 = book1s[i];
			id1 = book1.GetID();
			name1 = book1.GetTitle();
			for (int j = 0; j < book2s.length;j++) {
				book2 = book2s[j];
				id2 = book2.GetID();
				name2 = book2.Getbook_title();
				double sim = Similarity.CalcuEDSim(name1, name2);
				if (sim >= threshold) result.add(id1 + "," + id2);
			}
		}
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("Time=" + time + "ms");
		
		Measurement.LoadBenchmark();
		Measurement.CalcuMeasure(result);
	}

}
