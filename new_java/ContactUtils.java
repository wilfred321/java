import java.util.Scanner;
public class ContactUtils{



//this method returns a list of contact
public String [] getContact(){

    Scanner input = new Scanner(System.in);
    String firstName = null;
    String lastName = null;
    String phoneNumber = null;

    String [] contactList;
    contactList = new String[3];

    System.out.printf("%nEnter contact firstname: ");
    firstName = input.next();

    System.out.printf("%nEnter contact lastname: ");
    lastName = input.next();

    System.out.printf("%nEnter contact phone number: %n");
    phoneNumber = input.next();

    contactList[0] = firstName;
    contactList[1] = lastName;
    contactList[2] = phoneNumber;

    return contactList;


}


}