import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int USER_INPUT = scanner.nextInt();
		ArrayList al = new ArrayList();
	    int NUMBERS_PRINTED = 0;
	    
	    for(int i = 1; i<= USER_INPUT; i++) {
	        int SPACES_TO_PRINT = (USER_INPUT - i) * 2;
	        String finalString = "";
	        for(int j = 0; j < SPACES_TO_PRINT; j++) {
	            finalString += " ";
	        }
	        for(int k = 1; k<=i; k++) {
	            finalString = finalString+""+(NUMBERS_PRINTED + k);
	        }
	        System.out.println(finalString);
	        NUMBERS_PRINTED = NUMBERS_PRINTED + i;
	    }
	}
}