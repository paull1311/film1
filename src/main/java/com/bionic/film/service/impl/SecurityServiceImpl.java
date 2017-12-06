package com.bionic.film.service.impl;

import com.bionic.film.dao.UserDao;
import com.bionic.film.model.User;
import com.bionic.film.service.SecurityService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;

/**
 * Created by leo on 18.04.2016.
 */
@Service
public class SecurityServiceImpl implements SecurityService {
    @Autowired
    private UserDao userDao;

    @Override
    public int getUserId() {
        return getUserDetails().getId();
    }


    @Override
    public String getUserLogin() {
        return getUserDetails().getLogin();
    }

    @Override
    public User getUserDetails() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        User user=userDao.findByLogin(name);
        return user;
    }
}
