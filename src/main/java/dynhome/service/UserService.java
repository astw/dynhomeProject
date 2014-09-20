/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynhome.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import dynhome.domain.User;

/**
 *
 * @author swang
 */
public class UserService {

    public User getDefaultUser() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));  

        User user = new User();
        user.setFirstName(" this is a fake of getting data from db " + dateFormat.format(date));
        user.setLastName("  last name ");
        return user;
    }
}
