import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannner = new Scanner(System.in);
		System.out.println("enter the number of students");
		int students = scannner.nextInt();
		String names[] = new String[students];
		String grade[] = new String[students];
		int mark1[] = new int[students];
		int mark2[] = new int[students];
		int mark3[] = new int[students];
		int total[] = new int[students];
		double average[] = new double[students];
		for(int i =0; i < students ; i++)
		{
			System.out.println("enter your name");
			names[i] = scannner.next();
			System.out.println("enter mark1");
			mark1[i] = scannner.nextInt();
			System.out.println("enter mark2");
			mark2[i] = scannner.nextInt();
			System.out.println("enter mark3");
			mark3[i] = scannner.nextInt();
			total[i] = mark1[i] + mark2[i] + mark3[i];
			average[i] = total[i]/3;
				if(average[i] >= 80) {
					grade[i] = "A";}
				else if(average[i] >= 75)
					grade[i] = "B+";
				else if(average[i] >= 65)
					grade[i] = "B";
				else if(average[i] >= 55)
					grade[i] = "C+";
				else if(average[i] >= 50)
					grade[i] = "C";
				else if(average[i] >= 40)
					grade[i] = "D";
				else if(average[i] >= 0)
					grade[i] = "F";
				else
					System.out.println("invalid grade");
		}
			System.out.println("**************************************************************");
			System.out.println("\t\t\t\tSTUDENT MARKLIST");
			System.out.println("**************************************************************");
			System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAverage");
			for(int i = 0; i < students; i++) {
				System.out.println((i + 101)+"\t" + names[i] + "\t" + mark1[i]+ "\t" + mark2[i]+ "\t" + mark3[i] + "\t" +total[i] +"\tP\t" + grade[i]);
			}
		
		}

	}


