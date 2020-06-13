import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

class SILab2Test {

    private SILab2 siLab2 = new SILab2();
    private static User user1 = null;
    private static User user2 = new User("Dimitar",null,"eli@gmail.com");
    private static User user3 = new User(null,"Lozinka1!","eli@gmail.com");
    private static User user4 = new User("Eli","Kratka","eli@gmail.com");
    private static User user5 = new User("Eli", "EliPassword", "eli@gmail.com");
    private static User user6 = new User("Eli","lozinka1","eli@gmail.com");
    private static User user7 = new User("Eli","Lozinka","eli@gmail.com");
    private static User user8 = new User("Eli","lozinka!","eli@gmail.com");
    private static User user9 = new User("Eli","Lozinka1","eli@gmail.com");
    private static User user10 = new User("Eli","Lozinka!","eli@gmail.com");
    private static User user11 = new User("Eli","lozinka1!","eli@gmail.com");
    private static User user12 = new User("Eli","Lozinka1!","eli@gmail.com");
    private static List<String> users;

    @BeforeAll
    public static void init() {
        System.out.println("Initializing the expected paramethars ");

        users = new ArrayList<>(11);
    }

    public static void destroy() {
        System.out.println("The test terminates");
    }

    @Test
    void EachBranchTest(){
        assertAll(
                () -> assertFalse(siLab2.function(user1, users)),
                () -> assertFalse(siLab2.function(user2, users)),
                () -> assertFalse(siLab2.function(user3, users)),
                () -> assertFalse(siLab2.function(user4, users)),
                () -> assertFalse(siLab2.function(user5, users)),
                () -> assertFalse(siLab2.function(user6, users)),
                () -> assertFalse(siLab2.function(user7, users)),
                () -> assertFalse(siLab2.function(user8, users)),
                () -> assertFalse(siLab2.function(user9, users)),
                () -> assertFalse(siLab2.function(user10, users)),
                () -> assertFalse(siLab2.function(user11, users)),
                () -> assertTrue(siLab2.function(user12, users))
        );
    }
    @Test
    void EachStatementTest(){
        assertAll(
                () -> assertFalse(siLab2.function(user1, users)),
                () -> assertFalse(siLab2.function(user4, users)),
                () -> assertTrue(siLab2.function(user12, users))
        );
    }
}