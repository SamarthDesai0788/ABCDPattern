package abcdpattern;

public class abcd {

	public static void main(String[] args) {
	int i=1;
	int n=5;
	while(i<=n) {
		int j=1;
	int ch=65;
		while(j<=i) {
			System.out.print((char)ch++);
			j++;
		}
		System.out.println();
		i++;
	}
	}
    }
