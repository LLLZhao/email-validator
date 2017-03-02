package email_validator;

public class emailValidator {
 
       	public int validator(String mail){
         
        int atIndex = 0;
        int fullIndex = 0;
		int count = 0;
        
        atIndex = mail.indexOf('@', 0);
        fullIndex = mail.indexOf('.', 0);
        //To determine . behind @
        for(int i = 0;i < mail.length();i++){
        	
        	
        }
        if(atIndex >= fullIndex) {
        	count++;
        }
        //To determine there is only one @
        if(mail.indexOf('@', 0) != mail.lastIndexOf('@')) {
            count++;
        }
        return count;
  /*      //To determine there is at least one .
        if(mail.indexOf('.', 1) != mail.lastIndexOf('.')) {
        	
        }
        //To determine there are 1 to 40 characters in front of @
        if(!(atIndex >= 1 && atIndex <= 40)) {
            
        }
        //To determine only letters in front of @
        for (int i = 0; i < atIndex; i++) {
            if (!((mail.charAt(i) >= 'a' && mail.charAt(i) <= 'z')||(mail.charAt(i) >= 'A' && mail.charAt(i) <= 'Z'))) {
                
            }
        }
        //To determine no more than 40 characters between @ to .
        if(!(fullIndex - atIndex - 1 >= 1 && fullIndex - atIndex - 1 <= 40)) {
            
        }
        //To determine there are all letters or number between @ to .
        for (int i = atIndex+1; i < fullIndex; i++) {
            if (!((mail.charAt(i) >= 'a' && mail.charAt(i) <= 'z')||(mail.charAt(i) >= 'A' && mail.charAt(i) <= 'Z')||(mail.charAt(i)>='0'&&mail.charAt(i)<='9'))) {
                
            }
        }
        //To determine the character length is 2 or 3 behind @ 
        if (!(mail.length() - fullIndex - 1 >= 2 && mail.length() - fullIndex -1 <= 3) ){
            
        }
        //To determine all letter behind @
        for (int i = fullIndex+1; i < mail.length(); i++) {
            if (!((mail.charAt(i) >= 'a' && mail.charAt(i) <= 'z')||(mail.charAt(i) >= 'A' && mail.charAt(i) <= 'Z'))) {
                
            }
        }
        */
    }
 
}