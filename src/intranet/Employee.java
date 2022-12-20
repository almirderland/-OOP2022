package intranet;


/**
* @generated
*/
public class Employee extends User {

    private String login;

	public Employee() {

    }
    
    public Employee(String name, String surname, String birthDate, String phoneNumber, String email,
            String password) {
        super(name, surname, birthDate, phoneNumber, email, password);
        this.login = this.generateLogin(name, surname);
    }    
  
    

    //                          Operations                                  

    public void sendMessage(String messageFrom, String messageTo, String title, String text) {
        Message m = new Message(messageFrom, messageTo, title, text);
        Database.messages.add(m);
    }
    
    @Override
    public String generateLogin(String name, String surname) {
    	return name.substring(0, 1).toLowerCase() + "." + surname.toLowerCase() + "@kbtu.kz";
    }
    

    public String getMessages() {
        String ans = "";
        int msgCount = 0;
        for (Message message : Database.messages) {
            if(message.getMessageTo().equals(this.getLogin())) {
                msgCount ++;
                ans += msgCount + ") Message from: " + message.getMessageFrom() 
                + "\n    Title: " + message.getTitle() 
                + "\n    Text: " + message.getText() + "\n\n";
            }
        }
        return ans;
    }
    
}
