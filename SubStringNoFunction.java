import java.util.Scanner;

public class SubStringNoFunction {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String:");
		String string = s.next();
		System.out.println("Enter sub string:");
	    String substring = s.next();
	    
/* Convert string to character array */	    
	    char[] stringArray = string.toCharArray();
	    char[] substringArray = substring.toCharArray();
	    
	    
	    boolean result = isPresent(substringArray, stringArray);
	    if (result) {
			System.out.println("Substring " + substring + " Found in String " + string);
		}else{
			System.out.println("Substring " + substring + " NOT Found in String " + string);
		}
	}
	
	public static boolean isPresent(char[] substring, char[] string) {
	    for (int i = 0; i < string.length - substring.length+1; i++) {
	        for (int j = 0; j < substring.length; j++) {
	            if (string[i + j] == substring[j]) {
	                if (j == substring.length - 1) {
	                    return true;
	                }
	            } else {
	                break;
	            }
	        }
	    }
	    return false;
	}
}
