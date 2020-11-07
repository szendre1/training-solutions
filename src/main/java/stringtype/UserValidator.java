package stringtype;

public class UserValidator {

    public boolean isValidUsername (String username){
        return(username.equals("")? false:true);
    }

    public boolean isValidPassword (String password1,String password2){
        return((password1.equals(password2)&password1.length()>=8) ? true:false);
    }

    public boolean isValidEmail(String email){
        if (!(email.substring(0,1).equals("@"))){ // első nem @
            if (!(email.substring(email.length()-1,email.length()).equals("."))){  // utolsó nem .
                if (email.substring(1,email.length()-2).contains("@")){ // van @
                    String subEmail = email.substring(email.indexOf("@"),email.length()-1);
                    if (!(subEmail.indexOf(".") == -1)) {  // van . a @ után
                        return(true);
                    }
                }
            }

        }
        return (false);
    }

}

