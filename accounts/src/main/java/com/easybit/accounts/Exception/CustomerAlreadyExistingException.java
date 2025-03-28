package com.easybit.accounts.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CustomerAlreadyExistingException  extends RuntimeException
{
    public CustomerAlreadyExistingException(String message)
    {
        super(message);
    }
}
