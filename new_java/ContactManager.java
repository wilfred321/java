public class ContactManager{
    //class attributes
Contact [] myFriends;
int friendsCount;


//default contructor
 public ContactManager()
 {
   this.myFriends = new Contact[500];
   this.friendsCount = 0;
 }

 public void addContact(Contact contact){
     myFriends[friendsCount] = contact;
     friendsCount++;
 }


 Contact searchContact(String name){
     for( int i = 0; i < friendsCount; i++){
         if (myFriends[i].firstName.equals(name)){
             return myFriends[i];
         }
     }
     return null;
 }




}