package com.plac.domain.user.service;

import com.plac.exception.user.WeakPasswordException;
import org.springframework.stereotype.Service;

@Service
public class PasswordChecker {

    public boolean checkWeakPassword(String password) {
        if(password.length() < 5 || password.length() > 16)
            throw new WeakPasswordException("비밀번호 형식에 맞지 않습니다. (5~16자)");
        return false;
    }

}
