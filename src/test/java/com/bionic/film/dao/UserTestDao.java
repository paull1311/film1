package com.bionic.film.dao;


import com.bionic.film.Application;
import com.bionic.film.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


/**
 * Created by vitalii.levash on 18.04.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
@WebAppConfiguration
public class UserTestDao {

   @Autowired
    private UserDao userDao;

    @Test
    public void testGetLogin() throws Exception{
        User user = userDao.findByLogin("leo");
        System.out.println(user.getLogin());
        Assert.assertEquals(user.getLogin(),"leo");
    }
}
