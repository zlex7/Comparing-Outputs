import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Compare {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		String test;
		String official;
		ByteArrayOutputStream b = new ByteArrayOutputStream();
		PrintStream p = new PrintStream(b);
		PrintStream old = System.out;
		System.setOut(p);
		tic.main(args);
		test= new String(b.toByteArray());
		b.reset();
		System.out.flush();
		System.setOut(old);
		System.out.println(test);
		File solution = new File("Input and Output Files/tic.out");
		Scanner scan = new Scanner(solution);
		System.out.println("----------------------------------------------");
		System.setOut(p);
		while(scan.hasNextLine()){
			System.out.print(scan.nextLine());
			if(scan.hasNext()){
				System.out.println();
			}
		}
		official= new String(b.toByteArray());
		System.out.flush();
		System.setOut(old);
		System.out.println(official);
		scan.close();
		Scanner s = new Scanner(official);
		Scanner s1 = new Scanner(test);
		boolean correct = true;
		String official1;
		String test1;
		while(s.hasNext() || s1.hasNext()){
			if(s.hasNext()){
			official1= s.nextLine();
			}
			else{
				correct=false;
				System.out.println("sorry, your output has too many lines");
				break;
			}
			if(s1.hasNext()){
			test1= s1.nextLine();
			}
			else{
				 correct=false;
				 System.out.println("sorry, your output has too few lines");
				 break;
			}
			if(!(test1.equals(official1))){
				System.out.println("official line: " + official1);
				System.out.println("test line: " + test1);
				correct = false;
			}
		}
		s.close();
		s1.close();
		if(correct){
			System.out.println("The outputs match");
		}
		else{System.out.println("The outputs don't match");}
	}

}
