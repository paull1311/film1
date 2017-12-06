package com.bionic.film.exception.Auth;


import com.bionic.film.exception.AppException;

/**
 * Created by Pavel on 006 06.12.17.
 */
public class AuthException extends AppException {
    public AuthException(final String message) {
        super(message);
    }

    public AuthException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthException(Throwable cause) {
        super(cause);
    }
}
