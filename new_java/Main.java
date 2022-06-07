import java.util.Scanner;
import java.util.Arrays;

class Main{


   
    public static void main(String [] args){
    // String firstName = null;
    // String lastName = null;
    // String phoneNumber = null;
    Scanner input = new Scanner(System.in);
    ContactUtils contact = new ContactUtils();
    String [] myContactList;
    myContactList = new String[3];
    

    
   



        System.out.println("Welcome to Contact Manager!");
        System.out.println("Select a task from the Menu below:");
        System.out.println("View contact list: Press 1");
        System.out.println("Add Contact: Press 2");
        System.out.println("Delete Contact: Press 3");
        System.out.println("To exit: Press 4:");
        System.out.print("Enter a number here : ");

        int taskId = input.nextInt();
        if ( taskId != 2)
           System.out.println("Invalid task. please enter a valid number between 1 and 4");
        else{
             
            System.out.println("start adding contacts");
           
          

            //Prompt the user to enter the first contact information
           boolean try_again = true;
            while(try_again == true){

            myContactList = contact.getContact();
                // System.out.printf("%nEnter contact firstname: ");
                // firstName = input.next();

                // System.out.printf("%nEnter contact lastname: ");
                // lastName = input.next();

                // System.out.printf("%nEnter contact phone number: %n");
                // phoneNumber = input.next();

                
                
                System.out.println("Do you wish to add another contact?: ");
                System.out.print("Enter 1 to continue, 2 to save and exit: ");
                
                int response = input.nextInt();
                

                if (response == 2){
                    try_again = false;
                     System.out.println("After if try again value is  : " + try_again);
                }

            }

        
            
            System.out.println("Outputting the array contactList!");
            System.out.println(Arrays.toString(myContactList));

            ContactManager myContactManager = new ContactManager();

            // Contact contact1 = new Contact(firstName, lastName, phoneNumber);
            Contact contact2 = new Contact("Praju", "Nivargi", "459830218");

            // myContactManager.addContact(contact1);
            myContactManager.addContact(contact2);

            String name = "Praju";
            Contact result = myContactManager.searchContact(name);


            System.out.println("Firstname: " + result.getFirstName() + "\nLastname: " + result.getLastName() + 
            "\nPhone Number: " + result.getPhoneNumber());
            System.out.println("Total number of friends on your contact list is :" + myContactManager.friendsCount);

        }
            
    }
}