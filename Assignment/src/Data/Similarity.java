package Data;

import java.util.*;

public class Similarity {
	
	public static double CalcuJaccard(String str1, String str2, int q) {
		HashSet<String> str1Tokens = Tokenize(str1, q); 
		HashSet<String> str2Tokens = Tokenize(str2, q); 

        HashSet<String> allTokens = new HashSet<String>(); 
        allTokens.addAll(str1Tokens);
        allTokens.addAll(str2Tokens);
 
        return (double) ((str1Tokens.size() + str2Tokens.size()) - allTokens.size()) / (double) (allTokens.size()); 
	}
	
	private static HashSet<String> Tokenize(String str, int q) {
		HashSet<String> tokens = new HashSet<String>();
		if (q == 0) {
			String[] temp = str.split(" "); // separate by space -> each full "word"
			for (int i = 0; i < temp.length; i++)
				tokens.add(temp[i]);
		} else {
			for (int i = 0; i < str.length() - q + 1; i++)
				tokens.add(str.substring(i, i + q));
		}
		return tokens;
	}
	
	public static double CalcuEDSim(String str1, String str2) {
		if (str1.equals(str2))
			return 1;
		
		int ed = CalcuED(str1, str2);
		return (1 - (double) ed / Math.max(str1.length(), str2.length()));
	}
	
	private static int getmin(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

	private static int CalcuED(String str1, String str2) {
		int ed = 0;
		/*
		 * Please implement the calculation of edit distance between two strings
		 * Dynamic programming should be used
		 * student: s4759487
		 */
		int edMatrix[][] = new int[str1.length()+1][str2.length()+1];
		edMatrix[0][0] = 0;
		// filling initial values
		for (int i = 1; i < str1.length() +1; i++) {
			edMatrix[i][0] = i;
		}
		for (int i = 1; i < str2.length() +1; i++) {
			edMatrix[0][i] = i;
		}
		//solving the matrix
		for (int i = 1; i < str1.length() +1; i++) {
			for (int j = 1 ; j < str2.length() +1; j++) {
				// if the characters are the same, 
				// then the edit distance is the same as the previous one
				if (str1.charAt(i -1) == str2.charAt(j - 1)) {
					edMatrix[i][j] = edMatrix[i-1][j-1];
				} else {
					// if the characters are different,
					// then the edit distance is the minimum of the previous ones + 1
					edMatrix[i][j] = getmin(edMatrix[i-1][j],
							edMatrix[i][j-1], edMatrix[i-1][j-1]) + 1;
				}	
			}
		}
        ed = edMatrix[str1.length()][str2.length()];
		return ed;
	}
}
