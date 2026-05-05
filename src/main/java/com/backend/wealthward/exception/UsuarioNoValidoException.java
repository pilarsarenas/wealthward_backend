package com.backend.wealthward.exception;

import com.backend.wealthward.constant.GeneralConstant;

public class UsuarioNoValidoException extends GeneralException {

    public UsuarioNoValidoException() {
        super(GeneralConstant.USUARIO_NO_VALIDO_ERROR_CODE, GeneralConstant.USUARIO_NO_VALIDO_ERROR_MESSAGE);
    }

}
