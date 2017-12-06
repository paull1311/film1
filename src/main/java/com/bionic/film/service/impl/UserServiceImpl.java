package com.bionic.film.service.impl;

import com.bionic.film.dao.UserDao;
import com.bionic.film.exception.Auth.impl.LoginExistsException;
import com.bionic.film.exception.Auth.impl.UserNotExistsException;
import com.bionic.film.model.User;
import com.bionic.film.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.Optional.ofNullable;

/**
 * Created by Paul.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Override
    @Transactional(readOnly = true)
    public void addUser(User user) throws LoginExistsException {
       if (userDao.findByLogin(user.getLogin())!=null){
           throw new LoginExistsException(user.getLogin());
       }
       user.setPassword(encoder.encode(user.getPassword()));
       userDao.saveAndFlush(user);
    }

    @Override
    @Transactional
    public void delete(final int id) throws UserNotExistsException {
        userDao.delete(getById(id));
    }


    @Override
    public User getById(final int id) throws UserNotExistsException {
        return ofNullable(userDao.getOne(id)).orElseThrow(() -> new UserNotExistsException(id));
    }

    @Override
    public List<User> getUserList() {
        return userDao.findAll();
    }
}