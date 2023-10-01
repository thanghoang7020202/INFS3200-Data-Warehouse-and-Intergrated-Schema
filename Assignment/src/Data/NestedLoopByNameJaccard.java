package Data;

import java.util.ArrayList;
import java.util.List;

//import Oracle.DBConnection;

public class NestedLoopByNameJaccard {
	//student: s4759487
	private static double threshold = 0.75; // acceptable line
	private static int q = 3; // token of length 3

	public static void main(String[] args) {
		/*
		// option1: read data from database
		DBConnection.OpenConnection();
		String query = "SELECT * FROM RESTAURANT";
		Restaurant[] Book3s = DBConnection.ExecuteQuery(query);
		DBConnection.CloseConnection();
		*/
		// option2: read data from csv file, switch to this option by commenting the above code and uncommenting next line
		
		//Restaurant[] Book3s = CSVLoader.restaurantLoader("data\\restaurant.csv");
		//Book3[] Book3s = CSVLoaderBook3.Book3Loader("data\\Book3.csv");

		Book1[] Book1s = CSVLoaderBook1.Book1Loader("data\\book1.csv");
		Book2[] Book2s = CSVLoaderBook2.Book2Loader("data\\book2.csv");
		List<String> result = new ArrayList<String>();
		
		//Restaurant book1 = null, book2 = null;
		//Book3 book1 = null, book2 = null;
		Book1 book1 = null;
		Book2 book2 = null;

		int id1 = 0, id2 = 0;
		String name1 = null, name2 = null;
		long start = System.currentTimeMillis();
		for (int i = 0; i < Book1s.length - 1; i++) {
			book1 = Book1s[i];
			id1 = book1.GetID();
			name1 = book1.GetTitle();
			for (int j = i + 1; j < Book2s.length;j++) {
				book2 = Book2s[j];
				id2 = book2.GetID();
				name2 = book2.Getbook_title();				
				double sim = Similarity.CalcuJaccard(name1, name2, q);
				if (sim >= threshold)
					result.add(id1 + "," + id2);
			}
		}
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("Time=" + time + "ms");
		//student id: s4759487
		Measurement.LoadBenchmark();
		Measurement.CalcuMeasure(result);
		System.out.println("Number of pairs: " + result.size());
		for(int i = 0 ; i < result.size(); i++)
			System.out.println(result.get(i));
	}

}
