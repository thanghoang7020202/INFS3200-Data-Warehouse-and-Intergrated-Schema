package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
// to ensure all tuple are collected
public class Book1_book2_jaccard{
	
	private static double threshold = 0.75; // acceptable line
	private static int q = 3; // token of length 3

	public static void Book1And2Loader_Jaccard(String filePathBook1, String filePathBook2) {
		List<Book1> Book1List = new ArrayList<Book1>();
		List<Book2> Book2List = new ArrayList<Book2>();
		List<String> result = new ArrayList<String>();	
		List<String> resultOnHighest = new ArrayList<String>();
		try {
			File file = new File(filePathBook1);
			if (!file.exists())
				System.out.println("No file");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			String[] tokens = null;
			while ((line = reader.readLine()) != null) {
				//System.out.println(line);
				line = line.replaceAll("'", " ");
				tokens = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
				
				Book1 Book1 = new Book1();
				Book1.SetID(Integer.parseInt(tokens[0].equals("")? null : tokens[0])); //id
				Book1.SetTitle((tokens[1].equals(""))? null : tokens[1]); //title
				Book1List.add(Book1);
			}
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Book1[] Book1s = Book1List.toArray(new Book1[0]);
		
		try {
			File file = new File(filePathBook2);
			if (!file.exists())
				System.out.println("No file");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			String[] tokens = null;
			while ((line = reader.readLine()) != null) {
				//System.out.println(line);
				line = line.replaceAll("'", " ");
				tokens = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
				
				Book2 Book2 = new Book2();
				Book2.SetID(Integer.parseInt(tokens[0].equals("")? null : tokens[0])); //id
				Book2.Setbook_title((tokens[1].equals(""))? null : tokens[1]); //title
				Book2List.add(Book2);
			}
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Book2[] Book2s = Book2List.toArray(new Book2[0]);

		Book1 book1 = null;
		Book2 book2 = null;

		int id1 = 0, id2 = 0;
		String name1 = null, name2 = null;
		int highestsim = 0, highestid = 0;
		long start = System.currentTimeMillis();
		for (int i = 0; i < Book1s.length; i++) {
			book1 = Book1s[i];
			id1 = book1.GetID();
			name1 = book1.GetTitle();
			if (name1 == null || name1.isEmpty()) continue;
			for (int j = 0; j < Book2s.length;j++) {
				book2 = Book2s[j];
				id2 = book2.GetID();
				name2 = book2.Getbook_title();	
				if ( name2 == null || name2.isEmpty()) continue;			
				
				double sim = Similarity.CalcuJaccard(name1, name2, q);
				if (sim >= threshold) {
					result.add(id1 + "," + id2);
					highestid = (sim > highestsim) ? highestid = id2 : highestid;
					highestsim = (int) Math.max(sim, highestsim);
					//System.out.println(id1 + "," + id2);
					//System.out.println("("+name1+")" + "_" + "("+ name2 +")");
				}
					
			}
			resultOnHighest.add(id1 + "," + highestid);
			highestsim = 0; // reset highestsim
		}
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("Time=" + time + "ms");
		//student id: s4759487
		Measurement.LoadBenchmark();
		Measurement.CalcuMeasure(result);
	}

	public static void main(String[] args) {
		Book1_book2_jaccard.Book1And2Loader_Jaccard("data\\Book1.csv", "data\\Book2.csv");
	}
}