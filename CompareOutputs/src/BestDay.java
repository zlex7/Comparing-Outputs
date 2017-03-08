import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class BestDay {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner s = new Scanner(new File("bestday.dat"));
		int num = s.nextInt();
		String day = "";
		for(int j=0; j<num; j++){
			int answer=0;
			for(int i=0;i<7;i++){
				int sales = s.nextInt();
				if(sales>answer){
					answer=sales;
					if(i==1){
						day="MONDAY";
					}
					else if(i==2){
						day="TUESDAY";
					}
					else if(i==3){
						day="WEDNESDAY";
					}
					else if(i==4){
						day="THURSDAY";
					}
					else if(i==5){
						day="FRIDAY";
					}
					else if(i==6){
						day="SATURDAY";
					}
					else if(i==0){
						day="SUNDAY";
					}
				}
			}
			System.out.print(day);
			if(j<num-1){
				System.out.println();
			}
		}
	}

}
