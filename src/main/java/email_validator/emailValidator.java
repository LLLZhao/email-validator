package email_validator;

public class emailValidator {
 
       	public int validator(String mail){
         
        int atIndex = 0;
        int fullIndex = 0;
		int count = 0;
        
        atIndex = mail.indexOf('@', 0);
        fullIndex = mail.indexOf('.', 0);
        //To determine . behind @
        if(	mail.contains("."))
        	count++;
        //To determine only one @ in email address
        if(mail.indexOf('@', 0) == mail.lastIndexOf('@')) 
            count++;

        return count;
    
    }
 
}