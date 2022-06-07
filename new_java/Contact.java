public class Contact{
    String firstName;
    String lastName;
    String phoneNumber;
    String fullName;
   
   Contact(){

   }

    Contact(String fname, String lname, String pNumber ){
        this.firstName = fname;
        this.lastName = lname;
        this.phoneNumber = pNumber;
    }
    
    public void setFirstName(String fname){
        this.firstName = fname;
    }

    public String getFirstName(){
        return this.firstName;
    }


    public void setLastName(String lname){
        this.lastName = lname;
    }

    public String getLastName(){
        return this.lastName;
    }


    public void setFullName(){
       this.fullName = "this.firstName , this.lastName";
    }

    public String getFullName(){
        return this.fullName;
     }


    public void setPhoneNumber(String pNumber){
        this.phoneNumber = pNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
}