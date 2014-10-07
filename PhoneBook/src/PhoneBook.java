import java.util.Scanner;

public class PhoneBook {
  public static void main(String[] args) {
	Scanner myScanner = new Scanner(System.in);
	int choice;
	do { 
	  System.out.println("1. Add new record");
	  System.out.println("2. Find by name");
	  System.out.println("3. Show all records");
	  System.out.println("0. Exit");
	  choice = myScanner.nextInt();
	}
	while (choice != 0);
  }
}
