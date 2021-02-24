package com.digitalinnovationone.crud.saladereuniao.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ErrorDetails {
    
    @Getter
    private Date timestamp;

    @Getter
    private String message;

    @Getter
    private String details;

}
