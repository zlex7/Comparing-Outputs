import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.lang.Math;

public class rooks {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner s = new Scanner(new File("rooks.dat"));
		int num=s.nextInt();
		while(s.hasNextInt()){
			long a=1;
			long answer=s.nextInt();
			for(long i=1; i<=answer;i++){
				a*=i;
			}
		System.out.print(a);
		if (s.hasNextInt()) {
			System.out.println();
		}
		}
	}

}
