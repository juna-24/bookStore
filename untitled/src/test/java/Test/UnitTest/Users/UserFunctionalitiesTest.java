package Test.UnitTest.Users;


import Mock.Users.UserServiceMock;
import com.example.Model.Userss.UserFunctionalities;
import com.example.Model.Userss.Users;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserFunctionalitiesTest {


    @Test
    public void testUpdateUser() {
        ArrayList<Users> usersListt = new ArrayList<>();
        Users user1 = new Users();
        Users user2 = new Users();

        user1.setEmail("nidiafino@gmail.com");
        user1.setFirstName("Nidia");

        user2.setEmail("junadako@gmail.com");
        user2.setFirstName("Juna");


        usersListt.add(user1);
        usersListt.add(user2);

        UserFunctionalities coverConstuctor = new UserFunctionalities();

        UserServiceMock userServiceMock = new UserServiceMock();
        userServiceMock.setUsers(usersListt);

        UserFunctionalities userFunctionalities = new UserFunctionalities(userServiceMock);

        Users user = new Users();
        user.setEmail("nidiafino@gmail.com");
        user.setFirstName("Nidia");

        ArrayList<Users> updatedUser =   UserFunctionalities.updateUsers(user);
        assertEquals(updatedUser.get(0).getFirstName(),user.getFirstName() );
    }


}
