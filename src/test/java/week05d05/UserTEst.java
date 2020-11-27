package week05d05;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTEst {

    @DisplayName("Correct user")
    @Test
    public void UserTestingCUser(){
        assertEquals("Black Jack", new User("Black","Jack","bj@gmail.com").getFullName());

    }

    @DisplayName("Missing @")
    @Test
    public void UserTestMA(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new User("Black","Jack","bj_gmail.com"));
        assertEquals("Hibás e-mai cím! '@' vagy  '.' hiányzik!", ex.getMessage());
    }

    @DisplayName("Missing \'.\'")
    @Test
    public void UserTestMDot(){
        Exception ex1 = assertThrows(IllegalArgumentException.class, () -> new User("Black","Jack","bj@gmail_com"));
        assertEquals("Hibás e-mai cím! '@' vagy  '.' hiányzik!", ex1.getMessage());
    }

}
