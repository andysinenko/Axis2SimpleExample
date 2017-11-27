package ua.kiev.sinenko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ua.kiev.sinenko.*;

import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;

public class CreateUserService {
    public void createUser(User users[]) {
        for(User u: users) {
            System.out.println("name: " + u.getUserName());
            System.out.println("password: " + u.getPassword());
            for(Role r: u.getRoles())
                System.out.println("role: " + r.roleName);
        }
    }
}
