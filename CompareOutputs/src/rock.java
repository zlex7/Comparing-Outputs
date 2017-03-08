import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class rock {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		Scanner s = new Scanner(new File("rock.dat"));
		File output = new File("output.txt");
		FileWriter outwrite = new FileWriter(output);
		int n = s.nextInt();
		int count=0;
		while(s.hasNext()){
			int wins = 0;
			int losses =0;
			int ties =0;
			String input = s.next();
			String benmove = "R";
			for(int i =0; i<input.length(); i++){
				String move=Character.toString(input.charAt(i));
				if(move.equals(benmove)){
					ties++;
				}
				else if(move.equals("R")){
					if(benmove.equals("S")){
						wins++;
						benmove="P";
					}
					else if(benmove.equals("P")){
						losses++;
					}
				}
				else if(move.equals("S")){
					if(benmove.equals("P")){
						wins++;
						benmove="R";
					}
					else if(benmove.equals("R")){
						losses++;
					}
				}
				else if(move.equals("P")){
					if(benmove.equals("R")){
						wins++;
						benmove="S";
					}
					else if(benmove.equals("S")){
						losses++;
					}
				}
			}
			//System.out.println("Wins: "+Integer.toString(wins));
			//System.out.println("Losses: " + Integer.toString(losses));
			//System.out.print("Ties: " + Integer.toString(ties));
			outwrite.write("Wins: " + Integer.toString(wins) + "\n");
			outwrite.write("Losses: " + Integer.toString(losses) + "\n");
			outwrite.write("Ties: " + Integer.toString(ties));
			count+=1;
			if(count<n){
				//System.out.println("\n");
				outwrite.write("\n");
				outwrite.write("\n");
			}
		}
		outwrite.close();
		 Scanner scan = new Scanner(output);
		 while (scan.hasNextLine()) {
		   System.out.print(scan.nextLine());
		   if(scan.hasNextLine()){
			   System.out.println();
		   }
		 }
		 scan.close();
	}

}


