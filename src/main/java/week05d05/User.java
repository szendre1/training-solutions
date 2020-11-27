package week05d05;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        int occurence=email.indexOf("@");
        if (email.indexOf("@") == -1 || email.substring(occurence).indexOf(".")== -1){
            throw new IllegalArgumentException("Hibás e-mai cím! \'@\' vagy  \'.\' hiányzik!");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }



    public String getFullName() {
        return (firstName+" "+lastName);
    }

    public static void main(String[] args) {
        User user1 = new User("Black","Jack","bj_gmail.com");

    }

}
