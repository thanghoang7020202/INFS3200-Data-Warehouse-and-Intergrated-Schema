// student: Cao Quoc Thang Hoang
// student id: 4759487
package Data;

import java.io.Console;
import java.util.HashSet;

import oracle.net.aso.b;

public class DataStatisticsBook3 {
	public static void main(String[] args) {
		Book3[] Book3s = CSVLoaderBook3.Book3Loader("data\\Book3.csv");
		int multipleOf100 = 0;
		for (int i = 0; i < Book3s.length; i++) {
			if(Book3s[i].GetID() % 100 == 0) {
				//if it is multiple of 100 -> in sample
				multipleOf100++; // inrease the sample size
			}
			
		}
		System.out.println("Number of Book3s with ID multiple of 100: " + multipleOf100);
		System.out.println("Epmo: " + 
				((float)286/(float)(multipleOf100 * (float)Book3s[0].elementCount) * 1000000) + " (epmo)");
	}
}
