package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVLoaderBook1 {
	public static Book1[] Book1Loader(String filePath) {
		List<Book1> Book1List = new ArrayList<Book1>();
		try {
			File file = new File(filePath);
			if (!file.exists())
				System.out.println("No file");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			String[] tokens = null;
			while ((line = reader.readLine()) != null) {
				//System.out.println(line);
				line = line.replaceAll("'", " ");
				tokens = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
				if (tokens.length < 12) {
					//System.out.println(lineCount + ": Token length is less than 17: " + tokens.length);
					continue;
				}
				
				Book1 Book1 = new Book1(
					Integer.parseInt(tokens[0].equals("")? "NULL" : tokens[0]), //id
					(tokens[1].equals(""))? "NULL" : tokens[1], //title
					(tokens[2].equals(""))? "NULL" : tokens[2], //authors
					(tokens[3].equals(""))? -1 : Integer.parseInt(tokens[3]), //pubyear
					(tokens[4].equals(""))? -1 : Integer.parseInt(tokens[4]), //pubmonth
					(tokens[5].equals(""))? -1 : Integer.parseInt(tokens[5]), // pubday
					(tokens[6].equals(""))? "NULL" : tokens[6], // edition
					(tokens[7].equals(""))? "NULL" : tokens[7], // publisher
					(tokens[8].equals(""))? -1 : Double.parseDouble(tokens[8]), //isbn13
					(tokens[9].equals(""))? "NULL" : tokens[9], //language
					(tokens[10].equals(""))? "NULL" : tokens[10], //series
					(tokens[11].equals(""))? -1 : Integer.parseInt(tokens[11]) // pages
                );
				Book1List.add(Book1);
			}
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Book1List.toArray(new Book1[0]);
	}
}