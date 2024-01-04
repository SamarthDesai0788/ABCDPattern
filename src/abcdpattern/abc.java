package abcdpattern;

public class abc {
	    public static void main(String[] args) {
	        int i = 1;
	        char N = 'A';

	        while (i <= 5) {
	            int j = 1;

	            while (j <= i) {
	                System.out.print(N);
	                j++;
	            }
	            System.out.println();
	            N++;
	            i++;
	        }
	    }
	}

