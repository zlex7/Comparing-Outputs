import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class sandbox {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("sandbox.dat"));
		int num=scan.nextInt();
		int count=0;
		while(scan.hasNextDouble()){;
			double l = scan.nextDouble();
			double w = scan.nextDouble();
			double d = scan.nextDouble();
			System.out.print((int)(Math.ceil(l*w*d/12/2)));
			count+=1;
			if(count<num){
				System.out.println();
			}
			
			
		}
	}

}
