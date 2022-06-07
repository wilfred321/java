public class ContactTest{
 public static void main( String[] args){

     Contact contact1 = new Contact();
     Contact contact2 = new Contact("Wilfred", "Owobu", "5173033056");


     System.out.println(contact1.getFirstName());
     System.out.println(contact1.getFullName());
     System.out.println(contact2.getFirstName());

     contact1.setFullName();
     contact1.setFullName();
     System.out.println(contact1.getFullName());
     System.out.println(contact2.getFullName());
     
 }


}