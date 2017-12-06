package com.bionic.film.exception.Auth.impl;


import com.bionic.film.exception.Auth.AuthException;

/**
 * Created by Pavel on 006 06.12.17.
 */
public class LoginExistsException extends AuthException {
    public LoginExistsException(){
        super("Login for user exists");
    }
    public LoginExistsException(final String login){
        super(String.format("Email '%s' already exists in DB.", login));
    }
}
