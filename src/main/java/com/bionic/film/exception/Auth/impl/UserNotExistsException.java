package com.bionic.film.exception.Auth.impl;


import com.bionic.film.exception.Auth.AuthException;

/**
 * Created by Pavel on 006 06.12.17.
 */
public class UserNotExistsException extends AuthException {
    public UserNotExistsException(){
        super("ID for user not exists");}
    public UserNotExistsException(final int login){
        super("ID for user not exists"+login);
    }
}
