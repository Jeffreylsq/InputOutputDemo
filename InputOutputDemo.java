package homeWork2;
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
public class InputOutputDemo {
	public static void main(String[]args)throws IOException
	{
		Scanner kb = new Scanner(System.in);
		String name = JOptionPane.showInputDialog("Please enter your name."); // Enter name
		System.out.println(name + "'s grades");
		System.out.println("Please enter your file name");
		String fileName = kb.next();
		File file = new File(fileName);       // Find source file
		Scanner inputFile = new Scanner(file);
		PrintWriter outputFile = new PrintWriter("D:\\jeffrey.txt");    //Create aim file
		outputFile.println(name + "'s grades");
		outputFile.println("No. " + "Grade");
		outputFile.println("--------------------");
		
		double sum = 0.0;
		String index = null;
		int lastIndex = 0;
		while(inputFile.hasNext())
		{
			 index = inputFile.nextLine();
			 int num =index.indexOf(".");
			 String str = index.substring(num+1, index.length());
			outputFile.println(index);
			sum += Double.parseDouble(str);
			
			String str1 = index.substring(0,num);
			lastIndex = Integer.parseInt(str1);
			
			
		}
		outputFile.println("--------------------");
		outputFile.println("Count: " + lastIndex);
		outputFile.println("Average: " + ((int)((sum/lastIndex)*100))/100.0);
		outputFile.close();
		
		
		
		
		
	}
}
