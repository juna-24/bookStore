package Test.UnitTest.Librarian;


import com.example.Model.Bills.MyDate;
import com.example.Model.Login.AccessLevel;
import com.example.Model.Userss.Users;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsersTest {
    @Test
    public void testD_UsersConstructorAndGetters() {
        // Creating a sample Zh_MyDate for the birthday
        MyDate birthday = new MyDate(2003, 24, 12);

        // Creating a D_Users object
        Users user = new Users("Juna", "Dako",
                "jdako22@example.com", birthday, "password",
                50000, "123-456-7890", AccessLevel.ADMINISTRATOR);

        assertEquals("Juna", user.getFirstName());
        assertEquals("Dako", user.getLastName());
        assertEquals("jdako22@example.com", user.getEmail());
        assertEquals(birthday, user.getBirthday());
        assertEquals("password", user.getPassword());
        assertEquals(50000, user.getSalery());
        assertEquals("123-456-7890", user.getPhone());
        assertEquals(AccessLevel.ADMINISTRATOR, user.getAccesLevel());
        System.out.println("A user can be created successfully");
    }
    @Test
    public void getFirstName() {
        MyDate birthday = new MyDate(2003, 24, 12);
        Users user = new Users("Juna", "Dako",
                "jdako22@example.com", birthday, "password",
                50000, "123-456-7890", AccessLevel.ADMINISTRATOR);
        String firstName = user.getFirstName();
        assertTrue(firstName instanceof String);
        assertEquals("Greisi", user.getFirstName());
    }

    @Test
    void setFirstName() {
        Users user = new Users();
        user.setFirstName("Juna");
        assertEquals("Juna", user.getFirstName());
        String firstName = user.getFirstName();
        assertTrue(firstName instanceof String);
        assertEquals("Juna", user.getFirstName());
        assertNotNull(user.getFirstName());
    }



    @Test
    void getEmail() {
        MyDate birthday = new MyDate(2003, 24, 12);
        Users user = new Users("Juna", "Dako",
                "jdako22@example.com", birthday, "password",
                50000, "123-456-7890", AccessLevel.ADMINISTRATOR);
        String email = user.getEmail();
        assertTrue(email instanceof String);
        assertEquals("Gr_ja.@example.com", user.getEmail());
        assertNotNull(user.getEmail());
    }

    @Test
    void setEmail() {
        Users user = new Users();
        user.setEmail("jdako22@example.com");
        assertEquals("jdako22@example.com", user.getEmail());
        String email = user.getEmail();
        assertTrue(email instanceof String);
        assertEquals("jdako22@example.com", user.getEmail());
        assertNotNull(user.getEmail());
    }


    @Test
    void getPassword() {
       Users user = new Users("Juna", "Dako",
                "jdako22@example.com", birthday, "password",
                50000, "123-456-7890", AccessLevel.ADMINISTRATOR);
        String password = user.getPassword();
        assertTrue(password instanceof String);
        assertEquals("password", user.getPassword());
        assertNotNull(user.getPassword());
    }

    @Test
    void setPassword() {
        Users user = new Users();
        user.setPassword("newPassword");
        assertEquals("newPassword", user.getPassword());
        String password = user.getPassword();
        assertTrue(password instanceof String);
        assertEquals("newPassword", user.getPassword());
        assertNotNull(user.getPassword());
    }


    @Test
    void getSalary() {
        MyDate birthday = new MyDate(2003, 24, 12);
        Users user = new Users("Juna", "Dako",
                "jdako22@example.com", birthday, "password",
                50000, "123-456-7890", AccessLevel.ADMINISTRATOR);
        long salary = user.getSalery();
        assertEquals(50000, salary);
        assertNotNull(user.getSalery());
    }

    @Test
    void setSalary() {
        Users user = new Users();
        user.setSalery(60000);
        assertEquals(60000, user.getSalery());
        long salary = user.getSalery();
        assertEquals(60000, salary);
    }


    @Test
    void getAccessLevel() {
        MyDate birthday = new MyDate(2003, 24, 12);
        Users user = new Users("Juna", "Dako",
                "jdako22@example.com", birthday, "password",
                50000, "123-456-7890", AccessLevel.ADMINISTRATOR);
        AccessLevel accessLevel = user.getAccesLevel();
        assertEquals(AccessLevel.ADMINISTRATOR, accessLevel);
        assertNotNull(user.getAccesLevel());
    }

    @Test
    void setAccessLevel() {
        Users user = new Users();
        user.setAccesLevel(AccessLevel.ADMINISTRATOR);
        assertEquals(AccessLevel.ADMINISTRATOR, user.getAccesLevel());
        AccessLevel accessLevel = user.getAccesLevel();
        assertEquals(AccessLevel.ADMINISTRATOR, accessLevel);
    }

    @Test
    void getLastName() {
        MyDate birthday = new MyDate(2003, 24, 12);
        Users user = new Users("Juna", "Dako",
                "jdako22@example.com", birthday, "password",
                50000, "123-456-7890", AccessLevel.ADMINISTRATOR);
        String lastName = user.getLastName();
        assertTrue(lastName instanceof String);
        assertEquals("Jaho", lastName);
        assertNotNull(user.getLastName());
    }

    @Test
    void setLastName() {
        Users user = new Users();
        user.setLastName("Smith");
        assertEquals("Smith", user.getLastName());
        String lastName = user.getLastName();
        assertTrue(lastName instanceof String);
        assertEquals("Smith", lastName);
    }

    @Test
    void getPhone() {
        MyDate birthday = new MyDate(2003, 24, 12);
        Users user = new Users("Juna", "Dako",
                "jdako22@example.com", birthday, "password",
                50000, "123-456-7890", AccessLevel.ADMINISTRATOR);
        String phone = user.getPhone();
        assertTrue(phone instanceof String);
        assertEquals("123-456-7890", phone);
        assertNotNull(user.getPhone());
    }

    @Test
    void setPhone() {
        Users user = new Users();
        user.setPhone("987-654-3210");
        assertEquals("987-654-3210", user.getPhone());
        String phone = user.getPhone();
        assertTrue(phone instanceof String);
        assertEquals("987-654-3210", phone);
    }



}
