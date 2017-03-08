import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tic {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("tic.dat"));
		int n,m,i,j,q;
		n = s.nextInt();
		for (i=0; i<n; i++) {
			boolean won=false;
			m = s.nextInt();
			s.nextLine();
			String[][] board = new String[3][3];
			boolean X = true;
			for (j=0; j<m; j++) {
				String b = s.nextLine();
				String[] coor = b.split(" ");
				
				board[Integer.parseInt(coor[1])][Integer.parseInt(coor[0])] = (X?"X":"O");
				X=!X;
			}
			for (j=0;j<3;j++) {
				for (q=0;q<3;q++) {
					if (board[q][j]==null) {
						board[q][j]=" ";
					}
				}
			}
			for (j=0;j<3;j++) {
				for (q=0;q<3;q++) {
					System.out.print(board[q][j]);
					if (q==0 || q==1) {
						System.out.print("|");
					}
				}
				System.out.println();
				if (j==0 || j==1) {
					System.out.println("-----");
				}
			}
			if (board[0][0].equals("X")) {
				if ((board[0][1].equals("X")&&board[0][2].equals("X"))||(board[1][1].equals("X")&&board[2][2].equals("X"))||(board[1][0].equals("X")&&board[2][0].equals("X"))) {
					System.out.print("X wins!");
					won=true;
				}
			}
			if (board[1][0].equals("X") && !won) {
				if (board[1][1].equals("X")&&board[1][2].equals("X")) {
					System.out.print("X wins!");
					won=true;
				}
			}
			if (board[2][0].equals("X") && !won) {
				if ((board[1][1].equals("X")&&board[0][2].equals("X"))||(board[2][1].equals("X")&&board[2][2].equals("X"))) {
					System.out.print("X wins!");
					won=true;
				}
			}
			if (board[0][1].equals("X")&&board[1][1].equals("X")&&board[2][1].equals("X") && !won) {
				System.out.print("X wins!");
				won=true;
			}
			else if (board[0][2].equals("X")&&board[1][2].equals("X")&&board[2][2].equals("X")) {
				System.out.print("X wins!");
				won=true;
			}
			else if (board[0][0].equals("O")) {
				if ((board[0][1].equals("O")&&board[0][2].equals("O"))||(board[1][1].equals("O")&&board[2][2].equals("O"))||(board[1][0].equals("O")&&board[2][0].equals("O"))) {
					System.out.print("O wins!");
					won=true;
				}
			}
			else if (board[1][0].equals("O")) {
				if (board[1][1].equals("O")&&board[1][2].equals("O")) {
					System.out.print("O wins!");
					won=true;
				}
			}
			else if (board[2][0].equals("O")) {
				if ((board[1][1].equals("O")&&board[0][2].equals("O"))||(board[2][1].equals("O")&&board[2][2].equals("O"))) {
					System.out.print("O wins!");
					won=true;
				}
			}
			else if (board[0][1].equals("O")&&board[1][1].equals("O")&&board[2][1].equals("O")) {
				System.out.print("O wins!");
				won=true;
			}
			else if (board[0][2].equals("O")&&board[1][2].equals("O")&&board[2][2].equals("O")) {
				System.out.print("O wins!");
				won=true;
			}
			if (!won) {
				boolean incom = false;
				for (String[] str1:board) {
					for (String str2:str1) {
						if (str2 == " " && !incom) {
							System.out.print("Incomplete");
							incom = true;
						}
					}
				}
				if (!incom) {
					System.out.print("Tie Game!");
				}
			}
			if (i!=n-1) {
				System.out.println("\n");
			}
			
		}
		s.close();
	}

}
