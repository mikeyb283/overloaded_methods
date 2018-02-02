import java.util.Scanner;

public class OverloadedMethods {

  public static void main(String[] args) {

    char quit = 'y';
    int userChoice = 0;
    String custFirst;
    String custLast;
    String custPhone;
    String businessName;

    Scanner userIn = new Scanner(System.in);
    Scanner custInfo = new Scanner(System.in);

    //creating a looping menu to allow the user to continue the process
    while (quit != 'n') {
      showMenu();
      if (userIn.hasNextInt())
        userChoice = userIn.nextInt();
      switch (userChoice) {
        case 1:
          System.out.println("Enter first name:");
          custFirst = custInfo.nextLine();
          System.out.println("Enter last name:");
          custLast = custInfo.nextLine();
          System.out.println("Enter phone number:");
          custPhone = custInfo.nextLine();
          printCustInfo(custLast, custFirst, custPhone);
          break;
        case 2:
          System.out.println("Enter the business name:");
          businessName = custInfo.nextLine();
          System.out.println("Enter first name:");
          custFirst = custInfo.nextLine();
          System.out.println("Enter last name:");
          custLast = custInfo.nextLine();
          System.out.println("Enter phone number:");
          custPhone = custInfo.nextLine();
          printCustInfo(custLast, custFirst, custPhone, businessName);
          break;
        default:
          System.out.println("Invalid choice. ");
          break;
      }
      System.out.println("\nWould you like to enter another customer? Yy/Nn");
      String input = userIn.next().toLowerCase();
      quit = input.charAt(0);
    }
  }
  /*
Method: showMenu

Use: Prints the menu options on screen

Arguments: none

Returns: none
*/
  private static void showMenu () {
    System.out.println("Choose whether you are a residential or business customer ");
    System.out.println("**");
    System.out.println("1) Residential Customer ");
    System.out.println("2) Business Customer ");
    System.out.println("**");
  }
  /*
Method: printCustomerInfo

Use: Prints the residential customer's first and last name,
and phone number.

Arguments: 1) custFirst = customer first name
           2) custLast = customer last name
           3) custPhone = customer phone number

Returns: none
*/
  private static void printCustInfo(String custFirst, String custLast, String custPhone) {

    System.out.println("\nFirst Name: " + custFirst);

    System.out.println("Last Name: " + custLast);

    System.out.println("Phone Number: " + custPhone);
  }

  /*
Method:

Use:Prints the business customer's business name, first and last name,
and phone number.

Arguments: 1) custFirst = customer first name
           2) custLast = customer last name
           3) custPhone = customer phone number
           4) businessName = customer business name

Returns:
*/
  private static void printCustInfo(String custFirst, String custLast, String custPhone, String businessName) {
    System.out.println("\nBusiness Name: " + businessName);

    System.out.println("First Name: " + custFirst);

    System.out.println("Last Name: " + custLast);

    System.out.println("Phone Number: " + custPhone);
  }
}