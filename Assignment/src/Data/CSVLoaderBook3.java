package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVLoaderBook3 {
    
	public static Book3[] Book3Loader(String filePath) {
		List<Book3> Book3List = new ArrayList<Book3>();
		try {
			File file = new File(filePath);
			if (!file.exists())
				System.out.println("No file");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			String[] tokens = null;
			int Nullvalue = 0;
			while ((line = reader.readLine()) != null) {
				//System.out.println(line);
				line = line.replaceAll("'", " ");
				tokens = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
				if (tokens.length < 17 && Integer.parseInt(tokens[0]) % 100 == 0) {
					//System.out.println(lineCount + ": Token length is less than 17: " + tokens.length);
					System.out.println(line);
					Nullvalue += 17 - tokens.length;
					continue;
				}
				for (int i = 0; i < tokens.length; i++) {
					if (tokens[i].equals("") && Integer.parseInt(tokens[0]) % 100 == 0) {
						Nullvalue ++;
					}
				}
				Book3 Book3 = new Book3(
						(tokens[0].equals(""))? -1 : Integer.parseInt(tokens[0]), 
                        (tokens[1].equals(""))? "NULL" : tokens[1],
						(tokens[0] == null || tokens[2].equals(""))? "NULL" : tokens[2],
						(tokens[0] == null || tokens[3].equals(""))? "NULL" : tokens[3],
						(tokens[0] == null || tokens[4].equals(""))? "NULL" : tokens[4],
						(tokens[0] == null || tokens[5].equals(""))? "NULL" : tokens[5],
						(tokens[0] == null || tokens[6].equals(""))? -1 : Double.parseDouble(tokens[6]),
						(tokens[0] == null || tokens[7].equals(""))? tokens[7] : "NULL",
						(tokens[0] == null || tokens[8].equals(""))? -1 : Integer.parseInt(tokens[8]),
						(tokens[0] == null || tokens[9].equals(""))? tokens[9] : "NULL",
						(tokens[0] == null || tokens[10].equals(""))? -1 : Integer.parseInt(tokens[10]),
						(tokens[0] == null || tokens[11].equals(""))? -1 : Integer.parseInt(tokens[11]),
						(tokens[0] == null || tokens[12].equals(""))? -1 : Double.parseDouble(tokens[12]),
						(tokens[0] == null || tokens[13].equals(""))? tokens[13] : "NULL",
						(tokens[0] == null || tokens[14].equals(""))? tokens[14] : "NULL",
						(tokens[0] == null || tokens[15].equals(""))? tokens[15] : "NULL",
						(tokens[0] == null || tokens[16].equals(""))? tokens[16] : "NULL"
				);

				Book3List.add(Book3);
			}
			reader.close();
			
			System.out.println("Number of Null is: " + Nullvalue);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return Book3List.toArray(new Book3[0]);
	}
}
