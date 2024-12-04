package favcolor;
import java.util.Scanner;

public class FavoriteColor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String choice;
		String ANSI_RED = "\u001b[31m";
		String ANSI_YELLOW = "\u001B[33m";
		String ANSI_BLUE = "\u001B[34m";
		System.out.println("Welcome to the favorite color app!\n\n");
		do 
		{
		System.out.print("What is your favorite primary color? (yellow, blue, red): ");
		String favColor = scanner.next();
		switch(favColor) 
		{
		case "blue":
			System.out.print(ANSI_BLUE + "You've chosen blue!");
			break;
		case "red":
			System.out.print(ANSI_RED + "You've chosen red!");
			break;
		case "yellow":
			System.out.print(ANSI_YELLOW + "You've chosen yellow!");
			break;
		}
		System.out.print("\n\nWould you like to go again? (y/n): ");
		choice = scanner.next();
		}while(true);
	}

}
