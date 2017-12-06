package com.bionic.film.exception.web;


import com.bionic.film.exception.AppException;

/**
 * Created by Pavel on 006 06.12.17.
 */
public class NotFoundException extends AppException {
    public NotFoundException(final Long entityId) {
        super(String.format("could not find '%d'.", entityId));
    }

    public NotFoundException(final Long entityId, final String entityName) {
        super(String.format("could not find %s by '%d'.", entityName, entityId));
    }

    public NotFoundException(final String msg) {
        super(msg);
    }
}
