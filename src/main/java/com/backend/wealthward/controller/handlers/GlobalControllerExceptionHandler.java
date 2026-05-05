package com.backend.wealthward.controller.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.backend.wealthward.exception.GeneralException;

@RestControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(UnsupportedOperationException.class)
    public ResponseEntity<String> handleUnsupportedOperationException(UnsupportedOperationException ex) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(ex.getMessage());
    }

    @ExceptionHandler(GeneralException.class)
public ResponseEntity<ModelMap> handleGeneralException(GeneralException ex) {
    ModelMap model = new ModelMap();
    
    model.addAttribute("error", ex.getClass().getSimpleName());
    model.addAttribute("errorCode", ex.getCodigoDeError());
    model.addAttribute("errorMessage", ex.getMensajeDeError());
    
    return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(model);
}
}