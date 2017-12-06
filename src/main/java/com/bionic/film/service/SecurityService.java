package com.bionic.film.service;


import com.bionic.film.model.User;

/**
 * @author vitalii.levash
 */
public interface SecurityService {
    int getUserId();
    String getUserLogin();
    User getUserDetails();
}
